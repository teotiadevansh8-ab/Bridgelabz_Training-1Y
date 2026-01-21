import java.util.Scanner;

class Volumeofearth {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius of the sphere in km:");
        double radiusKm = input.nextDouble();

        double pi = 3.14159;

        
        double volumeKm = (4.0 / 3.0) * pi * radiusKm * radiusKm * radiusKm;

        
        double kmToMiles = 0.621371;
        double volumeMiles = volumeKm * kmToMiles * kmToMiles * kmToMiles;

        System.out.println("The volume in cubic kilometers is " + volumeKm +
                           " and cubic miles is " + volumeMiles);
    }
}
