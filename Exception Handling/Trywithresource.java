import java.io.*;

class A{
public static void main(String[] a){
try(BufferedReader b=new BufferedReader(new FileReader("info.txt"))){
System.out.println(b.readLine());
}catch(IOException e){
System.out.println("Error reading file");
}
}
}