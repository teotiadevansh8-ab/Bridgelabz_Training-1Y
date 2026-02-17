import java.util.Scanner;

class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        boolean isPal = true;
        int start = 0, end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                isPal = false;
                break;
            }
            start++;
            end--;
        }

        System.out.println(isPal ? "Palindrome" : "Not Palindrome");
        sc.close();
    }
}
