import { Component, OnInit } from '@angular/core';
import { PrimeNGConfig, MenuItem } from 'primeng/api';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = 'UI';
  items: MenuItem[] = [];

  constructor(private primeConfig: PrimeNGConfig) {

  }

  ngOnInit(): void {
    this.primeConfig.ripple = true;
    this.items = [
      {
        label: 'Employee Management System',
        routerLink: '/'
      },
      {
          label: 'Allocation',
          routerLink: '/allocation'
      }
    ];
  }
}
