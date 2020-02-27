import { Injectable, Inject } from '@angular/core';
import { USERS } from '../models/user-mock';
import { HttpClient,HttpHeaders } from '@angular/common/http';
import { User } from '../models/user';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UserService {
  // users = USERS;
  private httpUrl='http://localhost:8080/users/';
  private httpUrls='http://localhost:8080/useractivate/';
  constructor(private httpClient: HttpClient, @Inject (HttpClient) private ht) { }

  getAllUsers(): Observable <User[]> {
    return this.httpClient.get<User[]>("http://localhost:8080/users/");
  }
  saveUser (user:User){
    return this.ht.post("http://localhost:8080/users/", user);
  }
  deleteUser(id:number): Observable<User> {
    return this.httpClient.delete<User>(this.httpUrl+ id);
  }
  updateUserInfo(user:User): Observable<User> {
    return this.httpClient.put<User>("http://localhost:8080/users/",user);
  } 
  getUserById(id:number): Observable<User> {
    return this.httpClient.get<User>(this.httpUrl+id);
  }
  serviceActivation(obj){
    return this.ht.put(`http://localhost:8080/activate`,obj)
  }
  // activatemessage(obj){
  //   return this.httpClient.get("http://localhost:8080/activate");
  // }
  // isAdmin() : boolean{
  //   return true;
  // }
}
