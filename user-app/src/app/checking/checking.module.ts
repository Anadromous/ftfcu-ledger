import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { CheckingRoutingModule } from './checking-routing.module';
import { CheckingListComponent } from './checking-list/checking-list.component';
import { CheckingEditComponent } from './checking-edit/checking-edit.component';

@NgModule({
  imports: [
    CommonModule,
    CheckingRoutingModule
  ],
  declarations: [CheckingListComponent, CheckingEditComponent]
})
export class CheckingModule { }
