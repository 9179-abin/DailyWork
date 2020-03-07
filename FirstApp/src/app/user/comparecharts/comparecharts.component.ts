import { Component, OnInit } from '@angular/core';
import { CompanyCompareService } from 'src/app/services/company-compare.service';
import { Company } from 'src/app/models/company';
import { FormGroup, FormControl, FormBuilder, Validators } from '@angular/forms';
import { debounceTime } from 'rxjs/operators';
import { Router } from '@angular/router';

@Component({
  selector: 'app-comparecharts',
  templateUrl: './comparecharts.component.html',
  styleUrls: ['./comparecharts.component.css']
})
export class ComparechartsComponent implements OnInit {
  compare:FormGroup;
  constructor(private service:CompanyCompareService, private formBuilder:FormBuilder, private router:Router) { }
  company : Company[];
  compareCompany(){
    localStorage.removeItem("c1");
    localStorage.removeItem("c2");
    localStorage.setItem("c1",this.compare.value['c1']);
    localStorage.setItem("c2",this.compare.value['c2']);
    this.router.navigate(['/showcharts'])
  }
  ngOnInit() {

    this.compare = this.formBuilder.group({
      c1:[''],
      c2:['']
    });

    this.service.getAllCompany().subscribe(data =>{
      this.company=data;
    })

    this.compare.valueChanges.subscribe(result=>console.log(result));
    // this.company = this.compare
    // .get('c1')
    // .valueChanges
    // .pipe(
    //   debounceTime(300),
    //   switch(value => this.service.getAllCompany()({companyName:value},1))
    // );
  }

}
