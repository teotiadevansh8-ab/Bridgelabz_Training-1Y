class P
{
String t;

P(String a)
{
t=a;
}

boolean c()
{
String r="";

for(int i=t.length()-1;i>=0;i--)
r=r+t.charAt(i);

return t.equals(r);
}

public static void main(String[]x)
{
P p=new P("madam");
System.out.println(p.c());
}
}