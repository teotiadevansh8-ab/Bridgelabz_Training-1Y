import java.util.Scanner;

class Profit {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the cost price:");
        double costPrice = input.nextDouble();
        System.out.println("Enter the selling price:");
        double sellPrice = input.nextDouble();
        double profit = sellPrice - costPrice;
        double profitPercent = (profit / costPrice) * 100;
        System.out.println("Profit = " + profit);
        System.out.println("Profit Percentage = " + profitPercent + "%");
    }
}
