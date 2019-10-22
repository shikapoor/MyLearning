import '../polyfills';
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpModule, Http } from '@angular/http';
import { RouterModule, Routes } from '@angular/router';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { AgGridModule } from 'ag-grid-angular';

import { AppComponent } from './app.component';
import { ProductsComponent } from './components/products/products.component';
import { ProductsService } from './services/products.service';

import { HttpClientModule } from '@angular/common/http';
import { LoginComponent } from './components/login/login.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { ErrorComponent } from './components/error/error.component';
import { EditProductComponent } from './components/edit-product/edit-product.component';
import { RegisterComponent } from './components/register/register.component';


const appRoutes: Routes = [{ path: 'products', component: ProductsComponent },
                           { path: 'login', component: LoginComponent },
                           { path: 'error', component: ErrorComponent },
                           { path: 'register', component: RegisterComponent}
                          ];


@NgModule({
  declarations: [AppComponent, ProductsComponent, LoginComponent, ErrorComponent, EditProductComponent, RegisterComponent],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    HttpClientModule,
    FormsModule,
    HttpModule,
    
    RouterModule.forRoot(
      appRoutes,
      { enableTracing: true } // <-- debugging purposes only
    ),
    AgGridModule.withComponents([EditProductComponent])
  ],
  exports: [EditProductComponent],

  providers: [ProductsService],
  bootstrap: [AppComponent]
})
export class AppModule {}
