import { Inject, Injectable } from '@nestjs/common';
import { ClientProxy } from '@nestjs/microservices';
import { randomUUID } from 'crypto';

export class PaymentService {
  constructor(@Inject("PAYMENT_RESULT") private client: ClientProxy) {}

  processPayment(): any {
    console.log("Processing payment")
    const paymentInfo: any = {
      timestamp: Date.now(),
      id: randomUUID(),
    }
    this.client.emit("payment_processed", paymentInfo)
    return paymentInfo;
  }
}
