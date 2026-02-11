export type Status = 'Done' | 'Pending' | 'Error' | 'Validating';

export interface IntegrationRow {
  name: string;
  status: Status;
  startDate: string;
  endDate: string;
}

export interface MatchingRow {
  name: string;
  status: Status;
  startDate: string;
  endDate: string;
}

export interface FileExchangeRow {
  name: string;
  action: 'Send' | 'Get';
  startDate: string;
  endDate: string;
}

export interface AccountingRow {
  name: string;
  status: Status;
  startDate: string;
  endDate: string;
}

export interface BatchesHistory {
  batchHId: number;
  batchId: number | null;
  batchName: string | null;
  batchType: string | null;
  keyfc: string | null;
  fileLocation: string | null;
  filename: string | null;
  batchHStartDate: string | null;
  batchHEndDate: string | null;
  selectedStartDate: string | null;
  selectedEndDate: string | null;
  batchDate: string | null;
  status: number | null;
  exception: string | null;
  erreur: string | null;
  bypassStatus: number | null;
}
