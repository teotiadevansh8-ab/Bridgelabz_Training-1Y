abstract class E{
int i;String n;double b;
E(int a,String c,double d){i=a;n=c;b=d;}
abstract double s();
void d(){System.out.println(i+" "+n+" "+s());}
}

interface D{
void a(String x);
String g();
}

class F extends E implements D{
String d;
F(int a,String c,double b){super(a,c,b);}
double s(){return b;}
public void a(String x){d=x;}
public String g(){return d;}
}

class P extends E implements D{
int h;String d;
P(int a,String c,double b,int x){super(a,c,b);h=x;}
double s(){return h*b;}
public void a(String x){d=x;}
public String g(){return d;}
}

class M{
public static void main(String[]x){
E e1=new F(1,"A",5000);
E e2=new P(2,"B",100,5);
e1.d();
e2.d();
}}