interface Refuelable{
    void refuel();
}

class Vehicle{
    int maxSpeed;
    String model;

    public void setmaxSpeed(int maxSpeed){
        this.maxSpeed = maxSpeed;
    }

    public void setmodel(String model){
        this.model = model;
    }

    public int getmaxSpeed(){
        return maxSpeed;
    }

    public String getmodel(){
        return model;
    }

    void display(){
        System.out.println("Vehicle Details : - ");
        System.out.println("Model : - " + model);
        System.out.println("Max Speed : - " + maxSpeed);
    }
}

class ElectricVehicle extends Vehicle{
    
    void charge(){
        System.out.println("Electric Vehicle is Charging...");
    }

    void display(){
        super.display();
        System.out.println("Type : Electric Vehicle");
    }
}

class PetrolVehicle extends Vehicle implements Refuelable{

    public void refuel(){
        System.out.println("Petrol Vehicle is Refueling...");
    }

    void display(){
        super.display();
        System.out.println("Type : Petrol Vehicle");
    }
}

public class questions {
    public static void main(String[] args) {

        ElectricVehicle ev = new ElectricVehicle();
        ev.setmodel("Tesla Model 3");
        ev.setmaxSpeed(200);

        PetrolVehicle pv = new PetrolVehicle();
        pv.setmodel("Honda City");
        pv.setmaxSpeed(180);

        ev.display();
        ev.charge();

        System.out.println();

        pv.display();
        pv.refuel();
    }
}