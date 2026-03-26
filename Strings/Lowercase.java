import java.util.Scanner;

public class Lowercase {

    
    public static String makeLowerCase(String text) {

        String newText = "";

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

     
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch + 32);  
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

        
        String myResult = makeLowerCase(input);

        
        String builtInResult = input.toLowerCase();

        
        boolean same = checkEqual(myResult, builtInResult);

        System.out.println("Lowercase using our method: " + myResult);
        System.out.println("Lowercase using built-in method: " + builtInResult);
        System.out.println("Both results are same? " + same);

        sc.close();
    }
}

