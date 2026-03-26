

interface Devices{
    void turnon();
    void turnoff();
}
class Light implements Devices{
    public void turnon(){
        System.out.println("Light :---- ");
        System.out.println("Turn On Light");
    }
    public void turnoff(){
        System.out.println("Turn Off Light");
    }
}
class Ac implements Devices{
    public void turnon(){
        System.out.println("AC : ---- ");
        System.out.println("Turn On Ac");
    }
    public void turnoff(){
        System.out.println("Turn Off Ac");
    }
}
class TV implements Devices{
    public void turnon(){
        System.out.println("TV : ---- ");
        System.out.println("Turn On Tv");
    }
    public void turnoff(){
        System.out.println("Turn Off Tv");
    }
}
public class First {

    public static void main(String[] args) {
        Light l1 = new Light();
        Ac a1 = new Ac();
        TV t1 = new TV();
        l1.turnon();
        l1.turnoff();
        System.out.println();
        a1.turnon();
        a1.turnoff();
        System.out.println();
        t1.turnon();
        t1.turnoff();
    }
}