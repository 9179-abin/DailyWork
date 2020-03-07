import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { UserService } from 'src/app/services/user.service';
import { User } from 'src/app/models/user';

@Component({
  selector: 'app-user-info',
  templateUrl: './user-info.component.html',
  styleUrls: ['./user-info.component.css']
})
export class UserInfoComponent implements OnInit {
  user:User;
  constructor(private router: Router, private service:UserService) { }

  updateUser(){
    
  }

  ngOnInit() {
    const c = localStorage.getItem('iduser');
    this.service.getUserById(+c).subscribe(data =>{
      this.user=data;
    })


  }

}
