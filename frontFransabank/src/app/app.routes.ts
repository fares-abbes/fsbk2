import { Routes } from '@angular/router';

import { TpIntegrationPage } from './pages/tp-integration';
import { MatchingPage } from './pages/matching';
import { BatchesHistory } from './pages/batches-history/batches-history';

export const routes: Routes = [
  {
    path: '',
    component: TpIntegrationPage
  },
  {
    path: 'matching',
    component: MatchingPage
  },
  {
    path: 'batches-history',
    component: BatchesHistory
  },
  {
    path: '**',
    redirectTo: ''
  }
];
