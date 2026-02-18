import java.util.Scanner;

class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double[] weight = new double[n];
        double[] height = new double[n];
        double[] bmi = new double[n];

        for(int i=0;i<n;i++){
            weight[i]=sc.nextDouble();
            height[i]=sc.nextDouble();
            bmi[i] = weight[i]/(height[i]*height[i]);
            System.out.println("BMI: "+bmi[i]);
        }
        sc.close();
    }
}
