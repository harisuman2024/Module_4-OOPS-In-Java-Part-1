class Customer{

int cid;
String cname;
String email;
long phone;

Customer(){}

Customer (int cid, String cname, String email, long phone){
this.cid=cid;
this.cname=cname;
this.email=email;
this.phone=phone;
}
public String toString(){
String str="["+cid+","+cname+","+email+","+phone+"]";
return str;
}
}

class Lab519{
public static void main (String as []){
Customer cust1 = new Customer();
System.out.println(cust1);

Customer cust2 = new Customer(101,"Hari", "Hari@suman.com", 12345);
System.out.println(cust2);
}
}
