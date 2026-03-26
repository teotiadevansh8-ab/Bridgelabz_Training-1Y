import java.util.Scanner;

public class Frequency {

    public static String[][] findFrequency(String text) {

        int[] freq = new int[256];

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[(int) ch]++;
        }

        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (freq[(int) text.charAt(i)] != 0) {
                count++;
                freq[(int) text.charAt(i)] = 0;
            }
        }

        String[][] result = new String[count][2];

        int[] freq2 = new int[256];
        for (int i = 0; i < text.length(); i++) {
            freq2[(int) text.charAt(i)]++;
        }

        int index = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (freq2[(int) ch] != 0) {
                result[index][0] = String.valueOf(ch);
                result[index][1] = String.valueOf(freq2[(int) ch]);
                freq2[(int) ch] = 0;
                index++;
            }
        }

        return result;
    }

    public static void display(String[][] data) {

        System.out.println("Character\tFrequency");
        System.out.println("---------------------------");

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t\t" + data[i][1]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = sc.nextLine();

        String[][] result = findFrequency(input);

        display(result);

        sc.close();
    }
}

