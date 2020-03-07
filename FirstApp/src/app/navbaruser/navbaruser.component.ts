import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-navbaruser',
  templateUrl: './navbaruser.component.html',
  styleUrls: ['./navbaruser.component.css']
})
export class NavbaruserComponent implements OnInit {
  navbarOpen = false;
  
  toggleNavbar() {
    this.navbarOpen = !this.navbarOpen;
  }
  constructor() { }
  
  ngOnInit() {
  }

}
