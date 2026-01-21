import java.util.Scanner;

public class GradeCheck {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter marks for student " + i + ": ");
            int marks = input.nextInt();

            if (marks < 0 || marks > 100) {
                System.out.println("Invalid marks");
            } 
            else if (marks < 50) {
                System.out.println("Result: Fail");
            } 
            else if (marks < 60) {
                System.out.println("Grade: D");
            } 
            else if (marks < 70) {
                System.out.println("Grade: C");
            } 
            else if (marks < 80) {
                System.out.println("Grade: B");
            } 
            else if (marks < 90) {
                System.out.println("Grade: A");
            } 
            else {
                System.out.println("Grade: O");
            }

            System.out.println(); // space between outputs
        }

        
    }
}
