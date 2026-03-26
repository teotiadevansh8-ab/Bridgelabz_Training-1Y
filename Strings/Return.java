import java.util.Scanner;

public class Return {
    public static  char[] character(String text){
        char[] result=new char[text.length()];
        for (int i = 0; i <text.length() ; i++) {
            result[i]=text.charAt(i);

        }
        return result;
    }
    public static boolean compare(char[] Arr1 ,char[] Arr2){
        if (Arr1.length != Arr2.length){
            return false;
        }
        for (int i = 0; i < Arr1.length; i++) {
            if (Arr1[i]!=Arr2[i]){
                return false;
            }
        }
        return true;

    }
    public static void main(String[] Args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter the String");
        String text = input.nextLine();
        char[]  Array1= character(text);
        char[]  Array2=text.toCharArray();
        boolean result=compare(Array1 , Array2);
        System.out.print("Characters using user-defined method: ");
        for (char c : Array1) {
            System.out.print(c + " ");
        }
        System.out.println();
        System.out.print("Characters using toCharArray(): ");
        for (char c : Array2) {
            System.out.print(c + " ");
        }
        System.out.println();
        if (result) {
            System.out.println("Both arrays are SAME.");
        } else {
            System.out.println("Both arrays are DIFFERENT.");
        }
        input.close();
    }
    }

