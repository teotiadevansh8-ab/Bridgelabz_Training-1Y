import java.util.Scanner;

class BMI2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[][] person = new double[n][3];
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {
            person[i][0] = sc.nextDouble(); 
            person[i][1] = sc.nextDouble(); 

            person[i][2] = person[i][0] /
                    (person[i][1] * person[i][1]);

            if (person[i][2] < 18.5)
                status[i] = "Underweight";
            else if (person[i][2] < 25)
                status[i] = "Normal";
            else
                status[i] = "Overweight";
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Weight: " + person[i][0] +
                    " Height: " + person[i][1] +
                    " BMI: " + person[i][2] +
                    " Status: " + status[i]);
        }

        sc.close();
    }
}
