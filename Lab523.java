class Hello{
int a;
int b;
Hello(int a,int b){
this.a=a;
this.b=b;
}
public boolean equals(Object obj){
Hello h=(Hello)obj;
return this.a == h.a && this.b == h.b;
}
}
class Lab523{
public static void main(String as[]){
Hello h1=new Hello(10,20);
Hello h2=new Hello(10,20);
Hello h3=new Hello(50,60);
Hello h4=h3;
System.out.println(h1.equals(h2));
System.out.println(h1.equals(h3));
System.out.println(h2.equals(h3));
System.out.println(h3.equals(h4));
}
}