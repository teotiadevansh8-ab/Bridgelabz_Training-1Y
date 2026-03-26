interface Vehicle {
    void rent(int rate);
    void returnvehicle(String name);
}

class Car implements Vehicle {
    int rate;
    String name;

    Car(int rate, String name) {
        this.rate = rate;
        this.name = name;
    }

    public void rent(int rate) {
        this.rate = rate;
        System.out.println("Car Rate : --- " + rate);
    }

    public void returnvehicle(String name) {
        this.name = name;
        System.out.println("Car Name : --- " + name);
    }
}

class Bike implements Vehicle {
    int rate;
    String name;

    Bike(int rate, String name) {
        this.rate = rate;
        this.name = name;
    }

    public void rent(int rate) {
        this.rate = rate;
        System.out.println("Bike rented at rate: " + rate);
    }

    public void returnvehicle(String name) {  // FIXED
        this.name = name;
        System.out.println("Bike returned: " + name);
    }
}

public class Second {
    public static void main(String[] args) {
        Car c1 = new Car(100, "Nexon");
        Bike b1 = new Bike(75, "TVS");

        c1.rent(100);
        c1.returnvehicle("Nexon");

        System.out.println();

        b1.rent(75);
        b1.returnvehicle("TVS");
    }
}