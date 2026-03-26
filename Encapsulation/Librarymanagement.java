abstract class L{
int i;String t,a;
L(int x,String y,String z){i=x;t=y;a=z;}
abstract int g();
void d(){System.out.println(t+" "+a);}
}

interface R{
void r();
}

class B extends L implements R{
B(int x,String y,String z){super(x,y,z);}
int g(){return 10;}
public void r(){System.out.println("R");}
}

class M{
public static void main(String[]x){
L l=new B(1,"Java","A");
l.d();
}}