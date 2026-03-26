class Vehicle {
    int maxspeed;
    String fuelType;

    public void setmaxspeed(int Speed){
        this.maxspeed = Speed;  
    }

    public void setfuelType(String FuelType){
        this.fuelType = FuelType; 
    }

    public int getmaxspeed(){
        return maxspeed;
    }

    public String getfuelType(){
        return fuelType;
    }

    void display(){
        System.out.println("Vehicle Info");
    }
}

class Car extends Vehicle {
    void display(){
        System.out.println("Basic Information Of Car : - ");
        System.out.println("Max_Speed : - " + maxspeed);
        System.out.println("Fuel_Type : - " + fuelType);
    }
}

class Truck extends Vehicle {
    void display(){
        System.out.println("Basic Information Of Truck : - ");
        System.out.println("Max_Speed : - " + maxspeed);
        System.out.println("Fuel_Type : - " + fuelType);
    }
}

public class Third {
    public static void main(String[] args) {

        Car c1 = new Car();
        c1.setmaxspeed(220);
        c1.setfuelType("CNG");

        Truck t1 = new Truck();
        t1.setmaxspeed(330);
        t1.setfuelType("Diesel");

        c1.display();
        System.out.println();
        t1.display();
    }
}