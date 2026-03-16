class C
{
double r;

C(double a)
{
r=a;
}

void a()
{
System.out.println(3.14*r*r);
}

void c()
{
System.out.println(2*3.14*r);
}

public static void main(String[]x)
{
C o=new C(5);
o.a();
o.c();
}
}