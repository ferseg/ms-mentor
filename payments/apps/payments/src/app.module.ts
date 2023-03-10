import { Module } from '@nestjs/common';
import { ClientsModule, Transport } from '@nestjs/microservices';
import { AppController } from './app.controller';
import { PaymentService } from './app.service';

@Module({
  imports: [
    ClientsModule.register([
      {
        name: 'PAYMENT_RESULT',
        transport: Transport.RMQ,
        options: {
          urls: ['amqp://localhost:5672'],
          queue: 'payments_result',
          queueOptions: {
            durable: false
          },
        },
      },
    ]),
  ],
  controllers: [AppController],
  providers: [PaymentService],
})
export class AppModule {}
