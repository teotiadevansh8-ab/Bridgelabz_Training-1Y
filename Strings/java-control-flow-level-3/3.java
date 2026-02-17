import java.util.Scanner;

class FirstNonRepeat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        int[] freq = new int[256];

        for (int i = 0; i < text.length(); i++)
            freq[text.charAt(i)]++;

        for (int i = 0; i < text.length(); i++) {
            if (freq[text.charAt(i)] == 1) {
                System.out.println(text.charAt(i));
                break;
            }
        }
        sc.close();
    }
}
