import java.util.Scanner;

class FactorialWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        if (n < 1) {
            System.out.println("Not a natural number");
        } else {
            int fact = 1;
            int i = 1;

            while (i <= n) {
                fact *= i;
                i++;
            }

            System.out.println("Factorial = " + fact);
        }

        input.close();
    }
}
