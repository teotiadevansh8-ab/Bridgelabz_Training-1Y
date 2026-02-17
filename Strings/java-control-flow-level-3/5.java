import java.util.Scanner;

class UniqueFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String unique = "";

        for (int i = 0; i < text.length(); i++)
            if (unique.indexOf(text.charAt(i)) == -1)
                unique += text.charAt(i);

        for (int i = 0; i < unique.length(); i++) {
            char ch = unique.charAt(i);
            int count = 0;

            for (int j = 0; j < text.length(); j++)
                if (text.charAt(j) == ch) count++;

            System.out.println(ch + " : " + count);
        }
        sc.close();
    }
}
