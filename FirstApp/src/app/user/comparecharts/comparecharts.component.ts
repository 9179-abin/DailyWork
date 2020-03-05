import { Component, OnInit } from '@angular/core';
import { CompanyCompareService } from 'src/app/services/company-compare.service';
import { Company } from 'src/app/models/company';
import { FormGroup, FormControl, FormBuilder, Validators } from '@angular/forms';

@Component({
  selector: 'app-comparecharts',
  templateUrl: './comparecharts.component.html',
  styleUrls: ['./comparecharts.component.css']
})
export class ComparechartsComponent implements OnInit {
  compare:FormGroup;
  constructor(private service:CompanyCompareService, private formBuilder:FormBuilder) { }
  company : Company[];
  compareCompany(){
    console.log(this.compare.value);
  }
  ngOnInit() {

    this.compare = this.formBuilder.group({
      c1:[''],
      c2:['']
    });

    this.service.getAllCompany().subscribe(data =>{
      this.company=data;
    })
  }

}
