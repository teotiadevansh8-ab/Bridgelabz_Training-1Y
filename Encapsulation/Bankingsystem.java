abstract class B{
int n;String h;double b;
B(int a,String c,double d){n=a;h=c;b=d;}
void d(double x){b+=x;}
void w(double x){if(b>=x)b-=x;}
abstract double i();
}

interface L{
void a();
}

class S extends B implements L{
S(int a,String c,double d){super(a,c,d);}
double i(){return b*0.05;}
public void a(){System.out.println("Loan");}
}

class C extends B implements L{
C(int a,String c,double d){super(a,c,d);}
double i(){return 0;}
public void a(){System.out.println("Loan");}
}