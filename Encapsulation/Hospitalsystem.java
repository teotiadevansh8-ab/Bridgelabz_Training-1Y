abstract class P{
int i;String n;int a;
P(int x,String y,int z){i=x;n=y;a=z;}
abstract double b();
}

interface M{
void a();
}

class I extends P implements M{
I(int x,String y,int z){super(x,y,z);}
double b(){return 1000;}
public void a(){System.out.println("R");}
}

class O extends P implements M{
O(int x,String y,int z){super(x,y,z);}
double b(){return 200;}
public void a(){System.out.println("R");}
}