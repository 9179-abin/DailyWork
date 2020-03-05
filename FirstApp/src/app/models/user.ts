export class User {
    id: number;
    username : string;
    password1:string;
    password2:string;
    email : string;
    phone : number;
    constructor(id: number, username:string, password1:string, password2:string, email:string, phone:number){
        this.id=id;
        this.username=username;
        this.password1=password1;
        this.password2=password2;
        this.email=email;
        this.phone=phone;
    }
}