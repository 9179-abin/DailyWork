import { Component, OnInit } from '@angular/core';
import * as Highcharts from 'highcharts';
import { CompanyService } from 'src/app/services/company.service';
import { StockPricesService } from 'src/app/services/stock-prices.service';
import { Company } from '../../models/company';
import { StockPrices } from '../../models/stockPrices';
import {CompareCompany } from '../../models/compare';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-showchart',
  templateUrl: './showchart.component.html',
  styleUrls: ['./showchart.component.css']
})


export class ShowchartComponent implements OnInit {
   compareData:CompareCompany;
   // c1:number;
   // c2:number;
   // company:Company[];
   // stprice:StockPrices[];
   // d1:number[]=[];
   // d2:number[]=[];
   // i:number;
   // j:number;
   // n:number;
  constructor(private companyService:CompanyService, private stockPriceService:StockPricesService, private route: ActivatedRoute) { }
    chartOne = Highcharts;
    chartOneOptions: any;
  ngOnInit() {
   this.compareData = JSON.parse(this.route.snapshot.queryParams.formData);
   let series: any = []
   let categories: any[] = [];
   // this.c1=+localStorage.getItem("c1");
   // this.c2=+localStorage.getItem("c2");
   // this.companyService.getAllCompanies().subscribe(data =>{
   //    this.company=data;
   // });
   // this.stockPriceService.getAllStockPrices().subscribe(data =>{
   //    this.stprice=data;
   //    for(this.i=0;this.i<this.stprice.length;this.i++){
   //       if(data[this.i].companyCode==this.c1){
   //          this.d1.push(data[this.i].stockPrice);
   //       }
   //       if(data[this.i].companyCode==this.c2){
   //          this.d2.push(data[this.i].stockPrice);
   //       }
   //    }
   //    console.log(this.d1);
   //    console.log(this.d2);
   // });
  }
  title = 'charts';
  data = [{
          name: 'example',
          data: []
       },{
          name: 'Nicesnippets.com',
          data: []
       }];
  highcharts = Highcharts;
  chartOptions = {   
    chart: {
       type: "column"
    },
    title: {
       text: "Monthly Site Visitor"
    },
    xAxis:{
       categories:["Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"]
    },
    yAxis: {          
       title:{
          text:"Visitors"
       } 
    },
    series: this.data
  };
}
