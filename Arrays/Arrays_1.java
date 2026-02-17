import java.util.Scanner;

public class Arrays_1 {
    public static void main(String... args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter size :-");
        int n = input.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println("Length of the array is: " + arr.length);
    }
}
