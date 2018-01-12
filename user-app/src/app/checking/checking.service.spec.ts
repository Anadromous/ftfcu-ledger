import { TestBed, inject } from '@angular/core/testing';

import { CheckingService } from './checking.service';

describe('CheckingService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [CheckingService]
    });
  });

  it('should be created', inject([CheckingService], (service: CheckingService) => {
    expect(service).toBeTruthy();
  }));
});
