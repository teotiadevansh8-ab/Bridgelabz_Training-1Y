import java.util.Scanner;

class UniqueChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (result.indexOf(ch) == -1)
                result += ch;
        }

        System.out.println(result);
        sc.close();
    }
}
