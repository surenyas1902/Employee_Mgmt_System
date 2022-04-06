import { Component, OnInit } from '@angular/core';
import { Employee } from '../models/employee';
import { Gender } from '../models/gender';
import { EmployeeService } from '../services/employee.service';
import {MessageService} from 'primeng/api';
import { Observer } from 'rxjs';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css'],
  providers: [MessageService]
})
export class HomeComponent implements OnInit {

  employees: Employee[] = [];
  genders: Gender = {
    'M': 'Male',
    'F': 'Female'
  };

  constructor(private employeeService: EmployeeService, private messageService: MessageService) { }

  ngOnInit(): void {
    const dataObserver: Observer<Employee[]> = {
      next:(data=> { this.employees = data}),
      error: (error => { this.messageService.add({severity:'error', summary: 'Error', detail: error.message}); }),
      complete: (() => {})
    }
    this.employeeService.getEmployees().subscribe(dataObserver);
  }

}
