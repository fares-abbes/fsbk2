import { Injectable, NgZone, OnDestroy } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable, Subject, BehaviorSubject } from 'rxjs';
import SockJS from 'sockjs-client';
import * as Stomp from 'stompjs';
import { BatchesHistory } from '../types';

export interface BatchStatusUpdate {
  type: 'STATUS_UPDATE' | 'connected';
  batchHId?: number;
  status?: number;
  batchName?: string;
  timestamp?: string;
  message?: string;
}

@Injectable({
  providedIn: 'root'
})
export class BatchHistoryService implements OnDestroy {
  private readonly BASE_URL = 'http://localhost:5000/BatchHistory';
  private readonly WS_URL = 'http://localhost:5000/ws';

  private stompClient: any = null;
  private statusUpdates$ = new Subject<BatchStatusUpdate>();
  private connectionStatus$ = new BehaviorSubject<'connected' | 'disconnected' | 'connecting'>('disconnected');

  private reconnectAttempts = 0;
  private maxReconnectAttempts = 5;
  private reconnectInterval = 3000; // 3 seconds
  private reconnectTimer: any;
  private intentionalDisconnect = false;

  constructor(private http: HttpClient, private ngZone: NgZone) {}

  // HTTP Methods
  getAllHistory(): Observable<BatchesHistory[]> {
    return this.http.get<BatchesHistory[]>(`${this.BASE_URL}/getAllHistory`);
  }

  getHistoryByBatchId(batchId: number): Observable<BatchesHistory[]> {
    return this.http.get<BatchesHistory[]>(`${this.BASE_URL}/getHistoryByBatchId/${batchId}`);
  }

  getHistoryByStatus(status: number): Observable<BatchesHistory[]> {
    return this.http.get<BatchesHistory[]>(`${this.BASE_URL}/getHistoryByStatus/${status}`);
  }

  updateStatus(historyId: number, status: number): Observable<void> {
    return this.http.put<void>(`${this.BASE_URL}/updateStatus/${historyId}/${status}`, {});
  }

  processBatchHistory(batchHIds: number[]): Observable<any> {
    return this.http.post(`${this.BASE_URL}/processBatchHistory`, null, {
      params: { batchHIds: batchHIds.join(',') }
    });
  }

  deleteBatchHistory(batchHId: number): Observable<any> {
    return this.http.delete(`${this.BASE_URL}/${batchHId}`, { responseType: 'text' });
  }

  // STOMP WebSocket Methods
  connectWebSocket(token: string): void {
    // Guard: only connect in browser environment
    if (typeof window === 'undefined') {
      return;
    }

    if (this.stompClient?.connected) {
      console.log('STOMP client already connected');
      return;
    }

    this.intentionalDisconnect = false;
    this.connectionStatus$.next('connecting');

    try {
      // Create WebSocket outside Angular zone to avoid unnecessary change detection
      this.ngZone.runOutsideAngular(() => {
        const socket = new SockJS(this.WS_URL);
        this.stompClient = Stomp.over(socket);

        // Connection headers with authentication token
        const headers: any = {};
        if (token && token !== 'development-no-auth') {
          headers['Authorization'] = `Bearer ${token}`;
        }

        this.stompClient.connect(
          headers,
          (frame: any) => this.onConnect(frame),
          (error: any) => this.onError(error)
        );
      });

    } catch (error) {
      console.error('Error creating STOMP client:', error);
      this.connectionStatus$.next('disconnected');
      if (!this.intentionalDisconnect) {
        this.attemptReconnect(token);
      }
    }
  }

  private onConnect(frame: any): void {
    this.ngZone.run(() => {
      console.log('STOMP Connected:', frame);
      this.connectionStatus$.next('connected');
    });

    this.reconnectAttempts = 0;

    // Subscribe to batch status updates
    this.ngZone.runOutsideAngular(() => {
      this.stompClient.subscribe('/topic/batch-status', (message: any) => {
        try {
          const update: BatchStatusUpdate = JSON.parse(message.body);
          console.log('Received STOMP status update:', update);
          this.ngZone.run(() => {
            this.statusUpdates$.next(update);
          });
        } catch (error) {
          console.error('Error parsing STOMP message:', error);
        }
      });
    });
  }

  private onError(error: any): void {
    console.error('STOMP Error:', error);
    this.ngZone.run(() => {
      this.connectionStatus$.next('disconnected');
    });

    if (!this.intentionalDisconnect) {
      this.attemptReconnect(localStorage.getItem('wsToken') || 'development-no-auth');
    }
  }

  disconnectWebSocket(): void {
    this.intentionalDisconnect = true;

    if (this.stompClient?.connected) {
      console.log('Disconnecting STOMP client');
      this.stompClient.disconnect(() => {
        this.ngZone.run(() => {
          this.connectionStatus$.next('disconnected');
        });
      });
    }

    if (this.reconnectTimer) {
      clearTimeout(this.reconnectTimer);
      this.reconnectTimer = null;
    }

    this.connectionStatus$.next('disconnected');
  }

  private attemptReconnect(token: string): void {
    if (this.intentionalDisconnect) {
      return;
    }

    if (this.reconnectAttempts >= this.maxReconnectAttempts) {
      console.error('Max STOMP reconnect attempts reached');
      this.ngZone.run(() => {
        this.statusUpdates$.next({
          type: 'STATUS_UPDATE',
          message: 'Failed to connect to server. Please refresh the page.'
        });
      });
      return;
    }

    this.reconnectAttempts++;
    console.log(`Attempting STOMP reconnect ${this.reconnectAttempts}/${this.maxReconnectAttempts} in ${this.reconnectInterval}ms`);

    this.reconnectTimer = setTimeout(() => {
      this.connectWebSocket(token);
    }, this.reconnectInterval);
  }

  // Observables for components to subscribe
  getStatusUpdates(): Observable<BatchStatusUpdate> {
    return this.statusUpdates$.asObservable();
  }

  getConnectionStatus(): Observable<'connected' | 'disconnected' | 'connecting'> {
    return this.connectionStatus$.asObservable();
  }

  ngOnDestroy(): void {
    this.disconnectWebSocket();
    this.statusUpdates$.complete();
    this.connectionStatus$.complete();
  }
}
