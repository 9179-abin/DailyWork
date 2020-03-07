import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-navbarcommon',
  templateUrl: './navbarcommon.component.html',
  styleUrls: ['./navbarcommon.component.css']
})
export class NavbarcommonComponent implements OnInit {
  isAdmin:number;
  navbarOpen = false;
  
  toggleNavbar() {
    this.navbarOpen = !this.navbarOpen;
  }
  constructor() { }
  message(){
    alert("Access Denied");
    alert("Login as Admin or User !");
  }
  ngOnInit() {
  }

}
