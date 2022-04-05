import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MenubarModule} from 'primeng/menubar';
import { InputTextModule } from 'primeng/inputtext'
import { FieldsetModule } from 'primeng/fieldset';
import { TableModule } from 'primeng/table';
import { ButtonModule } from 'primeng/button';
import { HomeComponent } from './home/home.component';
import { FormsModule } from '@angular/forms';
import { AllocationComponent } from './allocation/allocation.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    AllocationComponent
  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    AppRoutingModule,
    MenubarModule,
    InputTextModule,
    FieldsetModule,
    TableModule,
    ButtonModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
