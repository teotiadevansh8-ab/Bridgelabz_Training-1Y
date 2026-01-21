import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        
        double base;
        double height;
        double areaInInches;
        double areaInCm;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter base of the triangle in inches: ");
        base = input.nextDouble();
        
        System.out.print("Enter height of the triangle in inches: ");
        height = input.nextDouble();
        
        
        areaInInches = 0.5 * base * height;
        
        
        areaInCm = areaInInches * 2.54 * 2.54;
        
        System.out.println("Area of the triangle is " + areaInInches + 
                           " square inches and " + areaInCm + 
                           " square centimeters");
        
        input.close();
    }
}
