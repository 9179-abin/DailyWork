// // var re = /apples/gi; 
// // var str = "Apples are round, and apples are juicy."; 
// // var newstr = str.replace(re, "oranges"); 
// // console.log(newstr) 
// function add(a=1,b=9){
//     console.log(a+b);
// }
// add('')
var arr=new Array();
var a=new Array();
for(var i=0;i<10;i++){
    arr.push(Math.floor(Math.random()*100));
}
// console.log(arr);
// var filter = ()=>{
//     for(let i of arr){
//         if(i%2==0 && i%5==0){
//            console.log(i);
//         }
//     }
// }
// filter();
// var Map = ()=>{
//     for(let i in arr){
//         arr[i]=Math.floor(arr[i]*1.1);
//         }
    
// }
// Map();
// console.log(arr);
let div=arr.filter((x)=>x%2==0 && x%5==0);
console.log(div);
let inc=arr.map((x)=>parseInt(x*1.1));
console.log(inc);
