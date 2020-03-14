import { Component, OnInit } from '@angular/core';
import { Routes, RouterModule, Router, ActivatedRoute, Params } from '@angular/router';
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators';
import { User } from 'src/app/models/user';
import { FormGroup, FormControl, FormBuilder, Validators } from '@angular/forms';
import { UserService } from 'src/app/services/user.service';
import { AuthService } from 'src/app/services/auth.service';
declare var $:any;


@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  val:string;
  n:number;
  i:number;
  valid:boolean;
  isAdmin:boolean;
  message:string;
  loginForm:FormGroup;
  users : User[];
  constructor(private router:Router, public activatedRoute: ActivatedRoute, private services:UserService, private formBuilder:FormBuilder, private auth: AuthService) { }
  signupForm: FormGroup;

  login(){
    let username = this.loginForm.get('username').value;
    let password = this.loginForm.get('password').value;
    const result = this.auth.authenticate(username, password).subscribe(data=>{
      if(sessionStorage.getItem('userType')==='user'){
        localStorage.removeItem('userId');
        localStorage.setItem('userId',data.id.toString());
        if(data.enabled){
          this.message="Login Successfull!";
          // $('#myMess').modal('show');
          this.router.navigate(['/userLanding']);
        }
        else{
          this.message="Please Activate Your Account!";
          // $('#myMess').modal('show');
          this.message="Check your mail for activation Link!";
          // $('#myMess').modal('show');
          this.router.navigate(['/home']);
        }
        
      }
      else if(sessionStorage.getItem('userType')==='admin'){
        this.message="Welcome Admin!";
        // $('#myMess').modal('show');
        this.router.navigate(['/adminservices']);
      }

    },
    error =>{
      console.log(error);
    }
    );
    // console.log(result);
  }



 
  ngOnInit() {
    this.loginForm=this.formBuilder.group({
      username:[''],
      password:['']
    })


 
  }
}

