import java.util.Scanner;

public class stringlen{
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        }
        catch (Exception e) {
            return count;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word:");
        String input = sc.next();
        int myLength = findLength(input);
        int builtInLength = input.length();
        System.out.println("Length using user-defined method: " + myLength);
        System.out.println("Length using built-in method: " + builtInLength);
        sc.close();
    }
}
