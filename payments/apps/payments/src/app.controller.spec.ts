import { Test, TestingModule } from '@nestjs/testing';
import { AppController } from './app.controller';
import { PaymentService } from './app.service';

describe('AppController', () => {
  let appController: AppController;

  beforeEach(async () => {
    const app: TestingModule = await Test.createTestingModule({
      controllers: [AppController],
      providers: [PaymentService],
    }).compile();

    appController = app.get<AppController>(AppController);
  });

  describe('root', () => {
    it('should return "Hello World!"', () => {
      expect(appController.processPayment()).toBe('Hello World!');
    });
  });
});
