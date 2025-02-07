class Customer{
int cid;
String cname;
String email;
long phone;
Customer(){
}
Customer(int cid,String cname,String email,long
phone){
this.cid=cid;
this.cname=cname;
this.email=email;
this.phone=phone;
}
public boolean equals(Customer cust){
return this.cid == cust.cid &&
this.cname.equals(cust.cname) &&
this.email.equals(cust.email) && this.phone ==
cust.phone;
}
}
class Lab524{
public static void main(String as[]){
Customer cust1 = new
Customer(101,"Srinivas","sri@mjlc.com",12345);
Customer cust2 = new
Customer(101,"Srinivas","sri@mjlc.com",12345);
Customer cust3 = new
Customer(102,"Srinivas","vas@mjlc.com",67890);
System.out.println(cust1.equals(cust2));
System.out.println(cust1.equals(cust3));
}
} 
