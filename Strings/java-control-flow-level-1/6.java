import java.util.Scanner;

class IllegalArgDemo {
    static void handle(String text) {
        try {
            System.out.println(text.substring(5, 2));
        } catch (Exception e) {
            System.out.println("Illegal argument handled");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        handle(sc.next());
        sc.close();
    }
}
