class Device{
    int Deviceid;
    String status;
    public void setDeviceid(int Deviceid){
        this.Deviceid = Deviceid;
    }
    public void setstatus(String status){
        this.status = status;
    }
    public int getDeviceid(){
        return Deviceid;
    }
    public String getstatus(){
        return status;
    }
    void display(){
        System.out.println("Baisc Information Of Device : - ");
        System.out.println("Device Id : - "+Deviceid);
        System.out.println("Status ; - "+status);
    }
}
class Thermostat extends Device{
    double temperatureSetting;
    public void settemperatureSetting(double temperatureSetting){
        this.temperatureSetting = temperatureSetting;
    }
    public double gettemperatureSetting(){
        return temperatureSetting;
    }
    void display(){
        super.display();
        System.out.println("TemperatureSetting : - "+temperatureSetting);
    }
}

public class Five {
public static void main(String[] args) {
    Thermostat th1 = new Thermostat();
    th1.setDeviceid(121);
    th1.setstatus("Working");
    th1.settemperatureSetting(34.4);
    th1.display();
}
    
}