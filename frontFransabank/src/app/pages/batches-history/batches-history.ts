import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { BatchesHistoryList } from '../../components/batches-history-list/batches-history-list';

@Component({
  selector: 'app-batches-history',
  imports: [CommonModule, BatchesHistoryList],
  templateUrl: './batches-history.html',
  styleUrl: './batches-history.css',
})
export class BatchesHistory {
}
