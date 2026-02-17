import java.util.Scanner;

class VowelConsonantCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine().toLowerCase();

        int v = 0, c = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if ("aeiou".indexOf(ch) >= 0) v++;
                else c++;
            }
        }

        System.out.println("Vowels: " + v);
        System.out.println("Consonants: " + c);

        sc.close();
    }
}
