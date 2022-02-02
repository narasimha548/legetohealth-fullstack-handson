import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(private _httpClient : HttpClient) { }

   baseUrl='http://localhost:9090';

    fetchById(username : string) : Observable<any> {
      let url=`${this.baseUrl}/user/${username}`;
      return this._httpClient.get(url);
    }

}
