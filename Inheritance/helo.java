interface Worker{
    void performDuties();
}

class Person{
    String name;
    int id;

    public void setName(String name){
        this.name = name;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }

    void display(){
        System.out.println("Person Details : - ");
        System.out.println("Name : - " + name);
        System.out.println("ID : - " + id);
    }
}

class Chef extends Person implements Worker{

    public void performDuties(){
        System.out.println("Chef is cooking food...");
    }

    void display(){
        super.display();
        System.out.println("Role : Chef");
    }
}

class Waiter extends Person implements Worker{

    public void performDuties(){
        System.out.println("Waiter is serving food...");
    }

    void display(){
        super.display();
        System.out.println("Role : Waiter");
    }
}

public class helo {
    public static void main(String[] args) {

        Chef c1 = new Chef();
        c1.setName("Ramesh");
        c1.setId(101);

        Waiter w1 = new Waiter();
        w1.setName("Suresh");
        w1.setId(102);

        c1.display();
        c1.performDuties();

        System.out.println();

        w1.display();
        w1.performDuties();
    }
}