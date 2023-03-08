import { Test, TestingModule } from '@nestjs/testing';
import { EquipmentsController } from './equipments.controller';
import { EquipmentsService } from './equipments.service';

describe('EquipmentsController', () => {
  let equipmentsController: EquipmentsController;

  beforeEach(async () => {
    const app: TestingModule = await Test.createTestingModule({
      controllers: [EquipmentsController],
      providers: [EquipmentsService],
    }).compile();

    equipmentsController = app.get<EquipmentsController>(EquipmentsController);
  });

  describe('root', () => {
    it('should return "Hello World!"', () => {
      expect(equipmentsController.getHello()).toBe('Hello World!');
    });
  });
});
