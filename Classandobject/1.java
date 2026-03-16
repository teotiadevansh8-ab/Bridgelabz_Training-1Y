class E
{
String n;
int i;
double s;

E(String a,int b,double c)
{
n=a;
i=b;
s=c;
}

void d()
{
System.out.println(n+" "+i+" "+s);
}

public static void main(String[]x)
{
E e=new E("Dev",1,50000);
e.d();
}
}