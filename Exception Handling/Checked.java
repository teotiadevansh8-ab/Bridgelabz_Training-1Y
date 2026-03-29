import java.io.*;

class A{
public static void main(String[] a){
try{
BufferedReader b=new BufferedReader(new FileReader("data.txt"));
String s;
while((s=b.readLine())!=null) System.out.println(s);
b.close();
}catch(IOException e){
System.out.println("File not found");
}
}
}