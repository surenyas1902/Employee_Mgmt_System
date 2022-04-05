import { Component, OnInit } from '@angular/core';
import { Employee } from '../models/employee';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  employees: Employee[] = [];

  constructor() { }

  ngOnInit(): void {
    this.employees.push({
      firstName: "Surendiran",
      lastName: "S",
      dob: new Date("1993-04-12"),
      doj: new Date("2022-01-31"),
      id: "123",
      gender: "M",
      grade: {
        id: "G1",
        position: "Position Name"
      },
      resume: "",
      supervisor: "Yaswanth K"
    },
    {
      firstName: "Surendiran",
      lastName: "S",
      dob: new Date("1993-04-12"),
      doj: new Date("2022-01-31"),
      id: "123",
      gender: "M",
      grade: {
        id: "G1",
        position: "Position Name"
      },
      resume: "",
      supervisor: "Somnath K"
    },
    {
      firstName: "Surendiran",
      lastName: "S",
      dob: new Date("1993-04-12"),
      doj: new Date("2022-01-31"),
      id: "123",
      gender: "M",
      grade: {
        id: "G1",
        position: "Position Name"
      },
      resume: "",
      supervisor: "Prema S"
    })
  }

}
