import { Injectable } from '@angular/core';
import { ActivatedRouteSnapshot, CanActivate, RouterStateSnapshot, UrlTree } from '@angular/router';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AuthDemoGuard implements CanActivate {
  canActivate(
    route: ActivatedRouteSnapshot,state: RouterStateSnapshot): boolean{
        let user=sessionStorage.getItem('user');
      let un=route.paramMap.get('un');
      console.log(un)
      if(user==un){
        return true;
      }else{
        alert('sorry you need to login first');
        return false;
      }
  }
  
}
