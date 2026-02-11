import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BatchesHistory } from './batches-history';

describe('BatchesHistory', () => {
  let component: BatchesHistory;
  let fixture: ComponentFixture<BatchesHistory>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [BatchesHistory]
    })
    .compileComponents();

    fixture = TestBed.createComponent(BatchesHistory);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
