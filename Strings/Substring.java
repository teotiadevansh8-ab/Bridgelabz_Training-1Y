import java.util.Scanner;

public class Substring {

    public static String createSubstring(String str, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result = result + str.charAt(i);
        }
        return result;
    }
    public static boolean compareStrings(String s1, String s2) {
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
        System.out.print("Enter the String: ");
        String text = sc.nextLine();
        System.out.print("Enter start index: ");
        int start = sc.nextInt();
        System.out.print("Enter end index: ");
        int end = sc.nextInt();
        String S1 = createSubstring(text, start, end);
        String S2 = text.substring(start, end);
        boolean result = compareStrings(S1, S2);
        System.out.println("Substring using charAt(): " + S1);
        System.out.println("Substring using substring(): " + S2);
        if (result) {
            System.out.println("Both substrings are SAME.");
        } else {
            System.out.println("Both substrings are DIFFERENT.");
        }
        sc.close();
    }
}



