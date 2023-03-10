import { Controller, Get } from '@nestjs/common';
import { PaymentService as PaymentService } from './app.service';

@Controller()
export class AppController {
  constructor(private readonly paymentService: PaymentService) {}

  @Get()
  processPayment(): any {
    return this.paymentService.processPayment();
  }
}
