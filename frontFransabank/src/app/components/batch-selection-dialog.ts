import { Component, EventEmitter, Input, OnInit, OnChanges, SimpleChanges, Output, ChangeDetectorRef } from '@angular/core';
import { CommonModule } from '@angular/common';
import { DialogModule } from 'primeng/dialog';
import { TableModule } from 'primeng/table';
import { ButtonModule } from 'primeng/button';
import { TagModule } from 'primeng/tag';
import { HttpClient } from '@angular/common/http';

export interface BatchHistory {
  batchHId: number;
  batchId: number | null;
  batchName: string | null;
  batchType: string | null;
  batchLastExecution: string | null;
  batchDate: string | null;
  batchHStartDate: string | null;
  batchHEndDate: string | null;
  selectedStartDate: string | null;
  selectedEndDate: string | null;
  createdAt: string;
  key: string | null;
}

@Component({
  selector: 'app-batch-selection-dialog',
  standalone: true,
  imports: [CommonModule, DialogModule, TableModule, ButtonModule, TagModule],
  template: `
    <p-dialog 
      [(visible)]="visible" 
      [modal]="true" 
      [style]="{ width: '80vw' }"
      [draggable]="false"
      [resizable]="false"
      (onHide)="onDialogHide()"
    >
      <ng-template pTemplate="header">
        <div class="dialog-header">
          <i class="pi pi-list" style="margin-right: 0.5rem;"></i>
          <span class="dialog-title">Pending Batches</span>
        </div>
      </ng-template>

      <div class="dialog-content">
        @if (loading) {
          <div class="loading-spinner">
            <i class="pi pi-spin pi-spinner" style="font-size: 2rem;"></i>
            <p>Loading batches...</p>
          </div>
        } @else if (error) {
          <div class="error-message">
            <i class="pi pi-exclamation-triangle"></i>
            <p>{{ error }}</p>
            <p-button 
              label="Retry" 
              icon="pi pi-refresh" 
              (onClick)="loadBatches()"
              severity="secondary"
              size="small"
            />
          </div>
        } @else {
          <p-table 
            [value]="batches" 
            [(selection)]="selectedBatches"
            dataKey="batchHId"
            [tableStyle]="{ 'min-width': '60rem' }"
            styleClass="p-datatable-sm"
            [rowHover]="true"
          >
            <ng-template pTemplate="header">
              <tr>
                <th style="width: 3rem">
                  <p-tableHeaderCheckbox />
                </th>
                <th>Batch ID</th>
                <th>Batch Name</th>
                <th>Batch Type</th>
                <th>Batch Date</th>
                <th>Created At</th>
                <th>Selected Range</th>
              </tr>
            </ng-template>
            <ng-template pTemplate="body" let-batch>
              <tr>
                <td>
                  <p-tableCheckbox [value]="batch" />
                </td>
                <td>
                  @if (batch.batchId) {
                    <span class="batch-id-badge">{{ batch.batchId }}</span>
                  } @else {
                    <span class="text-muted">-</span>
                  }
                </td>
                <td>
                  <div class="batch-name">
                    <i class="pi pi-file" style="margin-right: 0.5rem; color: var(--primary-color);"></i>
                    {{ batch.batchName || '-' }}
                  </div>
                </td>
                <td>
                  @if (batch.batchType) {
                    <p-tag [value]="batch.batchType" severity="info" />
                  } @else {
                    <span class="text-muted">-</span>
                  }
                </td>
                <td class="date-cell">{{ formatDate(batch.batchDate) }}</td>
                <td class="date-cell">{{ formatDate(batch.createdAt) }}</td>
                <td class="date-cell">
                  @if (batch.selectedStartDate && batch.selectedEndDate) {
                    <span class="date-range">
                      {{ formatDate(batch.selectedStartDate) }} - {{ formatDate(batch.selectedEndDate) }}
                    </span>
                  } @else {
                    <span class="text-muted">-</span>
                  }
                </td>
              </tr>
            </ng-template>
            <ng-template pTemplate="emptymessage">
              <tr>
                <td colspan="7" style="text-align: center; padding: 2rem;">
                  <i class="pi pi-inbox" style="font-size: 3rem; color: var(--text-color-secondary);"></i>
                  <p style="margin-top: 1rem;">No pending batches found</p>
                </td>
              </tr>
            </ng-template>
          </p-table>
        }
      </div>

      <ng-template pTemplate="footer">
        <div class="dialog-footer">
          <div class="selection-info">
            @if (selectedBatches.length > 0) {
              <span class="selected-count">
                <i class="pi pi-check-circle"></i>
                {{ selectedBatches.length }} batch{{ selectedBatches.length > 1 ? 'es' : '' }} selected
              </span>
            }
          </div>
          <div class="footer-buttons">
            <p-button 
              label="Cancel" 
              severity="secondary" 
              [outlined]="true"
              (onClick)="onCancel()"
            />
            <p-button 
              label="Confirm Selection" 
              severity="primary"
              [disabled]="selectedBatches.length === 0"
              (onClick)="onConfirm()"
            />
          </div>
        </div>
      </ng-template>
    </p-dialog>
  `,
  styles: [`
    :host ::ng-deep .p-dialog {
      background: var(--bg-card);
      border: 1px solid var(--border-primary);
      border-radius: 12px;
      box-shadow: 0 4px 24px rgba(0, 0, 0, 0.15);
    }

    :host ::ng-deep .p-dialog .p-dialog-header {
      background: var(--bg-card);
      border-bottom: 1px solid var(--border-primary);
      padding: 1.5rem;
      border-radius: 12px 12px 0 0;
    }

    :host ::ng-deep .p-dialog .p-dialog-content {
      background: var(--bg-card);
      padding: 1.5rem;
    }

    :host ::ng-deep .p-dialog .p-dialog-footer {
      background: var(--bg-card);
      border-top: 1px solid var(--border-primary);
      padding: 1.5rem;
    }

    .dialog-header {
      display: flex;
      align-items: center;
      font-size: 1.25rem;
      font-weight: 600;
      color: var(--text-primary);
    }

    .dialog-content {
      min-height: 400px;
      background: var(--bg-card);
    }

    .loading-spinner,
    .error-message {
      display: flex;
      flex-direction: column;
      align-items: center;
      justify-content: center;
      min-height: 400px;
      gap: 1rem;
    }

    .error-message {
      color: var(--red-500);
    }

    .batch-id-badge {
      background: var(--primary-color);
      color: white;
      padding: 0.25rem 0.75rem;
      border-radius: 12px;
      font-size: 0.875rem;
      font-weight: 600;
    }

    .batch-name {
      display: flex;
      align-items: center;
      font-weight: 500;
      color: var(--text-primary);
    }

    .date-cell {
      color: var(--text-secondary);
      font-size: 0.875rem;
    }

    .date-range {
      display: inline-flex;
      align-items: center;
      gap: 0.25rem;
      font-weight: 500;
    }

    .text-muted {
      color: var(--text-muted);
      font-style: italic;
    }

    .dialog-footer {
      display: flex;
      justify-content: space-between;
      align-items: center;
      width: 100%;
    }

    .selection-info {
      flex: 1;
    }

    .selected-count {
      display: inline-flex;
      align-items: center;
      gap: 0.5rem;
      color: var(--primary-color);
      font-weight: 600;
    }

    .footer-buttons {
      display: flex;
      gap: 0.5rem;
    }

    :host ::ng-deep {
      .p-datatable {
        background: var(--bg-card);
      }

      .p-datatable .p-datatable-thead > tr > th {
        background: var(--surface-50);
        font-weight: 600;
        color: var(--text-primary);
      }

      .p-datatable .p-datatable-tbody > tr {
        background: var(--bg-card);
      }

      .p-datatable .p-datatable-tbody > tr:hover {
        background: var(--surface-hover);
      }

      .p-checkbox .p-checkbox-box.p-highlight {
        background: var(--primary-color);
        border-color: var(--primary-color);
      }
    }
  `]
})
export class BatchSelectionDialogComponent implements OnInit, OnChanges {
  @Input() visible = false;
  @Input() batchName = '';
  @Output() visibleChange = new EventEmitter<boolean>();
  @Output() batchesSelected = new EventEmitter<BatchHistory[]>();

  batches: BatchHistory[] = [];
  selectedBatches: BatchHistory[] = [];
  loading = false;
  error: string | null = null;

  constructor(private http: HttpClient, private cdr: ChangeDetectorRef) {}

  ngOnInit(): void {
    if (this.visible) {
      this.loadBatches();
    }
  }

  ngOnChanges(changes: SimpleChanges): void {
    if (changes['visible'] && changes['visible'].currentValue === true) {
      this.loadBatches();
    }
  }

  loadBatches(): void {
    this.loading = true;
    this.error = null;

    const url = this.batchName 
      ? `http://localhost:5000/BatchHistory/getPendingBatchesSinceLastDone/${encodeURIComponent(this.batchName)}`
      : 'http://localhost:5000/BatchHistory/getPendingBatchesSinceLastDone';

    this.http.get<BatchHistory[]>(url)
      .subscribe({
        next: (data) => {
          this.batches = data;
          this.loading = false;
          this.cdr.detectChanges();
        },
        error: (err) => {
          console.error('Error loading batches:', err);
          this.error = 'Failed to load batches. Please try again.';
          this.loading = false;
          this.cdr.detectChanges();
        }
      });
  }

  formatDate(date: string | null): string {
    if (!date) return '-';
    
    try {
      const parsedDate = new Date(date);
      return new Intl.DateTimeFormat('fr-FR', {
        year: 'numeric',
        month: '2-digit',
        day: '2-digit',
        hour: '2-digit',
        minute: '2-digit'
      }).format(parsedDate);
    } catch {
      return date;
    }
  }

  onDialogHide(): void {
    this.visibleChange.emit(false);
    this.selectedBatches = [];
  }

  onCancel(): void {
    this.visible = false;
    this.visibleChange.emit(false);
    this.selectedBatches = [];
  }

  onConfirm(): void {
    this.batchesSelected.emit(this.selectedBatches);
    this.visible = false;
    this.visibleChange.emit(false);
    this.selectedBatches = [];
  }
}
