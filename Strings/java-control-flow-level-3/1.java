import java.util.Scanner;

class BMIProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] data = new double[10][2]; // weight, height(cm)

        for (int i = 0; i < 10; i++) {
            data[i][0] = sc.nextDouble();
            data[i][1] = sc.nextDouble();
        }

        for (int i = 0; i < 10; i++) {
            double weight = data[i][0];
            double heightM = data[i][1] / 100;
            double bmi = weight / (heightM * heightM);

            String status;
            if (bmi < 18.5) status = "Underweight";
            else if (bmi < 25) status = "Normal";
            else status = "Overweight";

            System.out.println(weight + " " + data[i][1] +
                               " BMI=" + bmi + " " + status);
        }
        sc.close();
    }
}
