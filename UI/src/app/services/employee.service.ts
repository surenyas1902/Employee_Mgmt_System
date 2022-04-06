import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Employee } from '../models/employee';
import { map } from 'rxjs/operators';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  private baseUrl = environment.baseUrl;

  constructor(private http: HttpClient) { }

  getEmployees(): Observable<Array<Employee>> {
    return this.http.get<Array<Employee>>(`${this.baseUrl}getEmployees`).pipe(
      map(data => data)
    );
  }
}
