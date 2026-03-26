import java.util.Scanner;

public class upperCase {

    
    public static String makeUpperCase(String text) {
        String newText = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

   
            if (ch >= 'a' && ch <= 'z') {
                ch = (char)(ch - 32);   // difference between small and capital is 32
            }

            newText = newText + ch;
        }

        return newText;
    }


    public static boolean checkEqual(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter complete text:");
        String input = sc.nextLine();

      
        String myResult = makeUpperCase(input);


        String inbuiltResult = input.toUpperCase();

      
        boolean same = checkEqual(myResult, inbuiltResult);

        System.out.println("Uppercase using our method: " + myResult);
        System.out.println("Uppercase using built-in method: " + inbuiltResult);
        System.out.println("Both results are same? " + same);

        sc.close();
    }
}
