import { Injectable } from '@angular/core';
import { ActivatedRouteSnapshot, CanActivate, Router, RouterStateSnapshot, UrlTree } from '@angular/router';
import { Observable } from 'rxjs';
import { HardcodeAuthenticationService } from '../Services/harcode-authentication.service';
import Swal from 'sweetalert2';


@Injectable({
  providedIn: 'root'
})
export class AdminRouteGuardService implements CanActivate {

 
  constructor(private hardcodeAuthenticationService:HardcodeAuthenticationService,private route:Router) { }
  canActivate(route: ActivatedRouteSnapshot, state: RouterStateSnapshot): boolean | UrlTree | Observable<boolean | UrlTree> | Promise<boolean | UrlTree> {
    //throw new Error('Method not implemented.');
  if(this.hardcodeAuthenticationService.isAdminLoggedIn()){
    return true;
  }else{
    Swal.fire({
      icon: 'error',
      title: 'Oops...',
      text: 'Admin not Logged-In!',
    });
    this.route.navigate(['adminLogin']);
    return false;
  }
  
  
  }
}

