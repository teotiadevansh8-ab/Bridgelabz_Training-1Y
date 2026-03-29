class A{
public static void main(String[] a){
int[] x={1,2,3};
try{
int i=5;
System.out.println("Value at index "+i+": "+x[i]);
}catch(ArrayIndexOutOfBoundsException e){
System.out.println("Invalid index!");
}catch(NullPointerException e){
System.out.println("Array is not initialized!");
}
}
}