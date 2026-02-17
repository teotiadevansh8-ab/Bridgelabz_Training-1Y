import java.util.Scanner;

class StringIndexDemo {
    static void handle(String text) {
        try {
            System.out.println(text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Index error handled");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        handle(text);
        sc.close();
    }
}
