import { NestFactory } from '@nestjs/core';
import { EquipmentsModule } from './equipments.module';

async function bootstrap() {
  const app = await NestFactory.create(EquipmentsModule);
  await app.listen(3000);
}
bootstrap();
