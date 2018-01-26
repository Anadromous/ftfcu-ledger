import { Component, OnInit } from '@angular/core';
import { CheckingData } from '../checking';
import { CheckingService } from '../checking.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-checking-list',
  templateUrl: './checking-list.component.html',
  styleUrls: ['./checking-list.component.css']
})
export class CheckingListComponent implements OnInit {

  private checkingDataList: CheckingData[];

  constructor() { }

  ngOnInit() {
  }

}
