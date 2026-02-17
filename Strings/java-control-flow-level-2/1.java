import java.util.Scanner;

class StringLengthDemo {
    static int getLength(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (Exception e) {}
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        System.out.println(getLength(text));
        System.out.println(text.length());
        sc.close();
    }
}
