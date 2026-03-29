import java.util.*;

class A{
public static void main(String[] a){
Scanner s=new Scanner(System.in);
try{
int x=s.nextInt();
int y=s.nextInt();
System.out.println(x/y);
}catch(ArithmeticException e){
System.out.println("Cannot divide by zero");
}finally{
System.out.println("Operation completed");
}
}
}