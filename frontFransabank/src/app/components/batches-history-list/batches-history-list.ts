import { Component, OnInit, OnDestroy } from '@angular/core';
import { CommonModule } from '@angular/common';
import { TableModule } from 'primeng/table';
import { ButtonModule } from 'primeng/button';
import { TagModule } from 'primeng/tag';
import { CardModule } from 'primeng/card';
import { BatchesHistory } from '../../types';
import { BatchHistoryService, BatchStatusUpdate } from '../../services/batch-history.service';
import { Subscription } from 'rxjs';

@Component({
  selector: 'app-batches-history-list',
  imports: [CommonModule, TableModule, ButtonModule, TagModule, CardModule],
  templateUrl: './batches-history-list.html',
  styleUrl: './batches-history-list.css',
})
export class BatchesHistoryList implements OnInit, OnDestroy {
  protected batchesHistory: BatchesHistory[] = [];
  protected loading = false;
  protected error: string | null = null;
  protected wsStatus: 'connected' | 'disconnected' | 'connecting' = 'disconnected';

  private statusUpdateSubscription?: Subscription;
  private connectionStatusSubscription?: Subscription;

  constructor(private batchHistoryService: BatchHistoryService) {}

  ngOnInit(): void {
    this.loadBatchesHistory();
    this.connectToWebSocket();
    this.subscribeToStatusUpdates();
    this.subscribeToConnectionStatus();
  }

  ngOnDestroy(): void {
    this.batchHistoryService.disconnectWebSocket();
    this.statusUpdateSubscription?.unsubscribe();
    this.connectionStatusSubscription?.unsubscribe();
  }

  private loadBatchesHistory(): void {
    this.loading = true;
    this.error = null;

    this.batchHistoryService.getAllHistory()
      .subscribe({
        next: (data) => {
          this.batchesHistory = data;
          this.loading = false;
        },
        error: (err) => {
          console.error('Error loading batches history:', err);
          this.error = 'Failed to load batches history. Please try again.';
          this.loading = false;
        }
      });
  }

  private connectToWebSocket(): void {
    // TEMPORARY: Development mode - connect without token
    // TODO: When authentication is implemented, get token from auth service
    // Example: const token = this.authService.getToken();

    // Connect without token (backend has authentication disabled for development)
    this.batchHistoryService.connectWebSocket('development-no-auth');
  }

  private subscribeToStatusUpdates(): void {
    this.statusUpdateSubscription = this.batchHistoryService.getStatusUpdates()
      .subscribe({
        next: (update: BatchStatusUpdate) => {
          if (update.type === 'STATUS_UPDATE' && update.batchHId) {
            this.updateBatchStatus(update.batchHId, update.status!);
          }
        },
        error: (err) => {
          console.error('Error in status update subscription:', err);
        }
      });
  }

  private subscribeToConnectionStatus(): void {
    this.connectionStatusSubscription = this.batchHistoryService.getConnectionStatus()
      .subscribe({
        next: (status) => {
          this.wsStatus = status;
          console.log('WebSocket status:', status);
        }
      });
  }

  private updateBatchStatus(batchHId: number, newStatus: number): void {
    const batch = this.batchesHistory.find(b => b.batchHId === batchHId);

    if (batch) {
      batch.status = newStatus;
      // Optionally update end date if status is "done" (1)
      if (newStatus === 1) {
        batch.batchHEndDate = new Date().toISOString();
      }

      // Trigger change detection by creating new array reference
      this.batchesHistory = [...this.batchesHistory];

      console.log(`Updated batch ${batchHId} to status ${newStatus}`);
    } else {
      console.warn(`Batch ${batchHId} not found in current list`);
    }
  }

  protected getStatusLabel(status: number | null): string {
    if (status === null) return 'Unknown';
    switch (status) {
      case -1: return 'Pending';
      case 0: return 'Parsing Started';
      case 1: return 'Done';
      case 2: return 'Error';
      case 3: return 'Parsing Completed';
      default: return `Status ${status}`;
    }
  }

  protected getStatusSeverity(status: number | null): 'success' | 'secondary' | 'info' | 'warn' | 'danger' | 'contrast' {
    if (status === null) return 'secondary';
    switch (status) {
      case -1: return 'secondary'; // Pending
      case 0: return 'info';       // Parsing Started
      case 1: return 'success';    // Done
      case 2: return 'danger';     // Error
      case 3: return 'success';    // Parsing Completed
      default: return 'info';
    }
  }

  protected formatDate(date: string | null): string {
    if (!date) return '-';
    try {
      return new Date(date).toLocaleString('fr-FR');
    } catch {
      return date;
    }
  }

  protected refresh(): void {
    this.loadBatchesHistory();
  }

  protected getWsStatusColor(): string {
    switch (this.wsStatus) {
      case 'connected': return 'green';
      case 'connecting': return 'orange';
      case 'disconnected': return 'red';
      default: return 'gray';
    }
  }

  protected getWsStatusLabel(): string {
    switch (this.wsStatus) {
      case 'connected': return 'Live Updates';
      case 'connecting': return 'Connecting...';
      case 'disconnected': return 'Disconnected';
      default: return 'Unknown';
    }
  }
}
