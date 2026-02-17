import java.util.Scanner;

class AnagramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();

        int[] freq = new int[256];

        for (int i = 0; i < a.length(); i++)
            freq[a.charAt(i)]++;

        for (int i = 0; i < b.length(); i++)
            freq[b.charAt(i)]--;

        boolean result = true;
        for (int f : freq)
            if (f != 0) result = false;

        System.out.println(result ? "Anagram" : "Not Anagram");
        sc.close();
    }
}
