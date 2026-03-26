class Animal {
    String name;
    int age;

    public void setage(int age){
        this.age = age;
    }

    public void setname(String name){
        this.name = name;
    }

    public int getage(){
        return age;
    }

    public String getname(){
        return name;
    }

    void makesound(){
        System.out.println("Animal Makes Sound.");
    }
}

class Dog extends Animal {
    void makesound(){
        System.out.println("Dog Barks.");
    }
}

class Cat extends Animal {
    void makesound(){
        System.out.println("Cat meows.");
    }
}

public class first {
    public static void main(String[] args) {

        Dog d1 = new Dog();
        d1.setage(5);
        d1.setname("Tommy");

        Cat c1 = new Cat();
        c1.setage(6);
        c1.setname("Kitty");

       
        System.out.println("Dog Name: " + d1.getname());
        System.out.println("Dog Age: " + d1.getage());
        d1.makesound();

        System.out.println();

        System.out.println("Cat Name: " + c1.getname());
        System.out.println("Cat Age: " + c1.getage());
        c1.makesound();
    }
}