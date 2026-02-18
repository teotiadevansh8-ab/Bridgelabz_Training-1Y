import java.util.Scanner;

class Table69 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] result = new int[4];

        int idx = 0;
        for (int i = 6; i <= 9; i++)
            result[idx++] = num * i;

        idx = 0;
        for (int i = 6; i <= 9; i++)
            System.out.println(num + " * " + i + " = " + result[idx++]);

        sc.close();
    }
}
