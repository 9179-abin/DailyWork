//object initializers
var person = {
    firstname:'Tom',
    lastname:'Hanks',
    func:function(){return 'hello' }
};

console.log(person.firstname)
console.log(person.lastname)
console.log(person.func())


//if propery name matches a property value,,omit property value 
var foo='bar'
var baz={foo}
console.log(baz.foo)

//object() constructor
var myCar=new Object();
myCar.make="ford";//an object
myCar.model="Mustang";
myCar.year=1977;

console.log(myCar["make"]);//accessing objects
console.log(myCar["model"]);
console.log(myCar["year"]);

myCar["model"]='lamborgini';

console.log(myCar["model"]);


//constructor function

function newcar(){
    this.make="ford";
    this.model="f123";

}

var obj =new newcar()
console.log(obj.make)
console.log(obj.model)



//object.create
var roles={
    type:"admin",
    displayType:function(){
        console.log(this.type)
    }
}

var superrole=Object.create(roles);
superrole.displayType();

var guestrole=Object.create(roles);
guestrole.type='guest';
guestrole.displayType();

//objects.assign function

var det={
    name:'tom',
    class:'10'
}
var copy=Object.assign({},det)
console.log(copy)
for(let a in copy)
{
    console.log(copy[a])
}

//another example

var o1={a:10}
var o2={b:20}
var o3={c:30}
var obj=Object.assign(o1,o2,o3)
console.log(obj)
console.log(o1)


// deleting properties

var obj=new Object();
obj.a=5;
obj.b=12;
delete obj.a;
console.log("a" in obj);

//comparing objects
        //different object reference
            var val1={name:'tom'}
            var val2={name:'tom'}
            console.log(val1==val2)
        //single object reference
            var val1={name:'Tom'}
            var val2=val1
            console.log(val1==val2)


//Object destructuring
    //breaking up the structure of an entity

var emp={name:'John',id:3}
var {name,id}=emp//array
console.log(name)
console.log(id)






