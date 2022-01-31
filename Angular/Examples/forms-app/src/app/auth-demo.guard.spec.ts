import { TestBed } from '@angular/core/testing';

import { AuthDemoGuard } from './auth-demo.guard';

describe('AuthDemoGuard', () => {
  let guard: AuthDemoGuard;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    guard = TestBed.inject(AuthDemoGuard);
  });

  it('should be created', () => {
    expect(guard).toBeTruthy();
  });
});
