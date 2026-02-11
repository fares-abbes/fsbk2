import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BatchesHistoryList } from './batches-history-list';

describe('BatchesHistoryList', () => {
  let component: BatchesHistoryList;
  let fixture: ComponentFixture<BatchesHistoryList>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [BatchesHistoryList]
    })
    .compileComponents();

    fixture = TestBed.createComponent(BatchesHistoryList);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
