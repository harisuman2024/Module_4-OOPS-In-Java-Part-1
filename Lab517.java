class Hello{
int a;
int b;
Hello (int a, int b){
this.a=a;
this.b=b;
}
public int hashCode(){
return a+b;
}
}

class Lab517{
public static void main (String as []){
Hello h1 = null;
System.out.println(h1);

Hello h2 = new Hello (10, 20);
System.out.println(h2);
System.out.println(h2.toString());
System.out.println(h2.hashCode());
}
}


