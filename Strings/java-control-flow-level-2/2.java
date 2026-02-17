import java.util.Scanner;

class SplitWords {
    static String[] split(String text) {
        return text.split(" ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[] words = split(text);

        for (String w : words)
            System.out.println(w);

        sc.close();
    }
}
