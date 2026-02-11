import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { HttpClient } from '@angular/common/http';
import { TableModule } from 'primeng/table';
import { ButtonModule } from 'primeng/button';
import { TagModule } from 'primeng/tag';
import { TooltipModule } from 'primeng/tooltip';
import { DatePickerModule } from 'primeng/datepicker';
import { FormsModule } from '@angular/forms';
import { InputTextModule } from 'primeng/inputtext';
import { IntegrationRow, Status } from '../types';
import { BatchSelectionDialogComponent, BatchHistory } from '../components/batch-selection-dialog';
import { environment } from '../../environments/environment';

@Component({
  selector: 'app-tp-integration-page',
  imports: [CommonModule, TableModule, ButtonModule, TagModule, TooltipModule, BatchSelectionDialogComponent, DatePickerModule, FormsModule, InputTextModule],
  templateUrl: './tp-integration.html',
  styleUrl: './tp-integration.css'
})
export class TpIntegrationPage {
  protected showBatchDialog = false;
  protected currentIntegration: IntegrationRow | null = null;
  protected currentBatchName = '';

  // Dev mode properties
  protected startDate: Date | null = null;
  protected endDate: Date | null = null;
  protected environment = environment;

  constructor(private http: HttpClient) {}

  protected readonly nationalIntegrations: IntegrationRow[] = [
    {
      name: 'Integration Fichier TP',
      status: 'Done',
      startDate: '14/01/2026 10:00',
      endDate: '14/01/2026 10:15'
    },
    {
      name: 'Integration Fichier TPM',
      status: 'Error',
      startDate: '14/01/2026 11:00',
      endDate: '-'
    }
  ];

  protected readonly internationalIntegrations: IntegrationRow[] = [
    {
      name: 'Integration VISA',
      status: 'Validating',
      startDate: '14/01/2026 09:30',
      endDate: '-'
    }
  ];

  protected get completedCount(): number {
    return this.nationalIntegrations.filter(r => r.status === 'Done').length +
           this.internationalIntegrations.filter(r => r.status === 'Done').length;
  }

  protected get pendingCount(): number {
    return this.nationalIntegrations.filter(r => r.status === 'Pending').length +
           this.internationalIntegrations.filter(r => r.status === 'Pending').length;
  }

  protected get inProgressCount(): number {
    return this.nationalIntegrations.filter(r => r.status === 'Validating').length +
           this.internationalIntegrations.filter(r => r.status === 'Validating').length;
  }

  protected get errorCount(): number {
    return this.nationalIntegrations.filter(r => r.status === 'Error').length +
           this.internationalIntegrations.filter(r => r.status === 'Error').length;
  }

  protected getStatusSeverity(status: Status): 'success' | 'secondary' | 'info' | 'warn' | 'danger' | 'contrast' {
    const severityMap: Record<Status, 'success' | 'secondary' | 'info' | 'warn' | 'danger' | 'contrast'> = {
      'Done': 'success',
      'Pending': 'secondary',
      'Validating': 'info',
      'Error': 'danger'
    };
    return severityMap[status];
  }

  protected getStatusIcon(status: Status): string {
    const iconMap: Record<Status, string> = {
      'Done': 'pi pi-check-circle',
      'Pending': 'pi pi-clock',
      'Validating': 'pi pi-spin pi-spinner',
      'Error': 'pi pi-times-circle'
    };
    return iconMap[status];
  }

  protected onStart(row: IntegrationRow): void {
    row.status = 'Validating';
    row.startDate = this.formatDate(new Date());
    row.endDate = '-';

    setTimeout(() => {
      row.status = 'Done';
      row.endDate = this.formatDate(new Date());
    }, 2000);
  }

  protected onBypass(row: IntegrationRow): void {
    row.status = 'Done';
    row.endDate = this.formatDate(new Date());
  }

  protected onView(row: IntegrationRow): void {
    console.log('View details for:', row.name);
    this.currentBatchName = this.getBatchNameForIntegration(row.name);
    this.currentIntegration = row;
    this.showBatchDialog = true;
  }

  private getBatchNameForIntegration(integrationName: string): string {
    switch (integrationName) {
      case 'Integration Fichier TP':
        return 'Intergration file TP';
      case 'Integration Fichier TPM':
        return 'Intergration file TPM';
      case 'Integration VISA':
        return 'Intergration file VISA';
      default:
        return '';
    }
  }

  protected onBatchesSelected(batches: BatchHistory[]): void {
    console.log('Selected batches:', batches);
    console.log('For integration:', this.currentIntegration?.name);
    
    if (!this.currentIntegration) return;

    // Execute each selected batch
    batches.forEach(batch => {
      if (batch.key) {
        this.executeBatch(batch.key, batch.batchName || 'Unknown');
      }
    });

    // Update integration status
    this.currentIntegration.status = 'Validating';
    this.currentIntegration.startDate = this.formatDate(new Date());
  }

  private executeBatch(key: string, batchName: string): void {
    console.log(`Executing batch: ${batchName} (key: ${key})`);
    
    this.http.post(`http://localhost:5000/BatchHistory/syncBatchByKey/${key}`, {})
      .subscribe({
        next: () => {
          console.log(`Batch ${batchName} executed successfully`);
          // Update integration status to Done after execution
          if (this.currentIntegration) {
            this.currentIntegration.status = 'Done';
            this.currentIntegration.endDate = this.formatDate(new Date());
          }
        },
        error: (err) => {
          console.error(`Error executing batch ${batchName}:`, err);
          // Update integration status to Error
          if (this.currentIntegration) {
            this.currentIntegration.status = 'Error';
            this.currentIntegration.endDate = this.formatDate(new Date());
          }
        }
      });
  }

  protected isStartDisabled(row: IntegrationRow): boolean {
    return row.status === 'Validating' || row.status === 'Done';
  }

  protected onBatchExec(row: IntegrationRow): void {
    this.currentBatchName = this.getBatchNameForIntegration(row.name);
    this.createAndExecute();
  }

  protected createAndExecute(): void {
    if (!this.startDate || !this.endDate || !this.currentBatchName) {
      alert('Please fill all fields');
      return;
    }

    const params = {
      startDate: this.formatDateForApi(this.startDate),
      endDate: this.formatDateForApi(this.endDate),
      batchName: this.currentBatchName
    };

    this.http.post('http://localhost:5000/batchExec/createAndExecute', null, { params })
      .subscribe({
        next: (response) => {
          console.log('Batch created and executed:', response);
          alert('Batch created and executed successfully');
        },
        error: (error) => {
          console.error('Error:', error);
          alert('Error creating batch');
        }
      });
  }

  private formatDateForApi(date: Date): string {
    return date.toISOString().split('T')[0];
  }

  private formatDate(date: Date): string {
    const formatter = new Intl.DateTimeFormat('fr-FR', {
      year: 'numeric',
      month: '2-digit',
      day: '2-digit',
      hour: '2-digit',
      minute: '2-digit'
    });
    return formatter.format(date);
  }
}
