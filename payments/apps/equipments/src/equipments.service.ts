import { Injectable } from '@nestjs/common';

@Injectable()
export class EquipmentsService {
  getHello(): string {
    return 'Hello World!';
  }
}
