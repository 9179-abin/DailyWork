
var val= new String("hameem");
console.log(val)
console.log(val.length);




var str=new String("aaaa")
console.log(str.constructor);



function employee(id,name){
    this.id=id;
    this.name=name;
}

var emp=new employee(132,"smith");
employee.prototype.email="smith@abc.com"

console.log(emp.id);
console.log(emp.name);
console.log(emp.email);

         

var str="all indians are my brothers and sisters"

console.log(str.substring(3,12))
console.log(str.slice(3,-3));
console.log(str.toUpperCase());
