import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { TableModule } from 'primeng/table';
import { ButtonModule } from 'primeng/button';
import { TagModule } from 'primeng/tag';
import { TooltipModule } from 'primeng/tooltip';
import { IntegrationRow, Status } from '../types';

@Component({
  selector: 'app-tp-integration-page',
  imports: [CommonModule, TableModule, ButtonModule, TagModule, TooltipModule],
  templateUrl: './tp-integration.html',
  styleUrl: './tp-integration.css'
})
export class TpIntegrationPage {
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
    },
    {
      name: 'Integration Fichier TPE',
      status: 'Pending',
      startDate: '-',
      endDate: '-'
    }
  ];

  protected readonly internationalIntegrations: IntegrationRow[] = [
    {
      name: 'Integration VISA',
      status: 'Validating',
      startDate: '14/01/2026 09:30',
      endDate: '-'
    },
    {
      name: 'Integration Mastercard',
      status: 'Done',
      startDate: '14/01/2026 08:00',
      endDate: '14/01/2026 08:45'
    },
    {
      name: 'Integration SWIFT',
      status: 'Pending',
      startDate: '-',
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
  }

  protected isStartDisabled(row: IntegrationRow): boolean {
    return row.status === 'Validating' || row.status === 'Done';
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
