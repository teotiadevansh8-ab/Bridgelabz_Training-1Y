import java.util.Scanner;

class StudentGrade2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[][] marks = new double[n][3];
        double percent;
        char grade;

        for (int i = 0; i < n; i++) {
            marks[i][0] = sc.nextDouble();
            marks[i][1] = sc.nextDouble();
            marks[i][2] = sc.nextDouble();

            percent = (marks[i][0] +
                       marks[i][1] +
                       marks[i][2]) / 3;

            if (percent >= 80) grade = 'A';
            else if (percent >= 70) grade = 'B';
            else if (percent >= 60) grade = 'C';
            else if (percent >= 50) grade = 'D';
            else if (percent >= 40) grade = 'E';
            else grade = 'R';

            System.out.println("Percentage: " +
                    percent + " Grade: " + grade);
        }

        sc.close();
    }
}
