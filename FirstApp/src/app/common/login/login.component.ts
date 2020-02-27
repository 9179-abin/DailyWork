import { Component, OnInit } from '@angular/core';
import { FormGroup } from '@angular/forms';
import { Routes, RouterModule, Router, ActivatedRoute, Params } from '@angular/router';
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  val:string;
  isAdmin:boolean;
  constructor(private router:Router, public activatedRoute: ActivatedRoute) { }
  signupForm: FormGroup;
  onLog(){
    if(this.val=='1'){
      this.isAdmin=true;
      this.router.navigate(['/adminservices']);}
    else if(this.val=='0'){
      this.isAdmin=false;
      this.router.navigate(['/userLanding']);
    }  
  }
  onAdmin(){
    if(this.val=='1'){
      this.isAdmin=true;
      }
    else if(this.val=='0'){
      this.isAdmin=false;
    }  
  }
 
  ngOnInit() {
    this.activatedRoute.paramMap.subscribe(params => { 
      this.val = params.get('id'); 
      this.onAdmin();
  });
      // alert('Welcome : '+this.val);
      console.log("User inserted successfully"+this.val);
  }
}
