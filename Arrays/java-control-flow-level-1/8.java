import java.util.Scanner;

class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int[] factors = new int[num];
        int index = 0;

        for (int i = 1; i <= num; i++)
            if (num % i == 0)
                factors[index++] = i;

        System.out.println("Factors:");
        for (int i = 0; i < index; i++)
            System.out.print(factors[i] + " ");

        sc.close();
    }
}
