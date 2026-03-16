class M
{
String b;
String m;
double p;

M(String a,String c,double d)
{
b=a;
m=c;
p=d;
}

void d()
{
System.out.println(b+" "+m+" "+p);
}

public static void main(String[]x)
{
M o=new M("Apple","iPhone",80000);
o.d();
}
}