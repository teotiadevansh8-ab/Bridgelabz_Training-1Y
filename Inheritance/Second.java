class Employee{
    int id;
    String name;
    int Salary;
    public void setid(int id){
        this.id = id;
    }
    public void setname(String name){
        this.name = name;
    }
    public void setSalary(int Salary){
        this.Salary = Salary;
    }
    public int getid(){
        return id;
    }
    public String getname(){
        return name;
    }
    public int getSalary(){
        return Salary;
    }
    void display(){
        System.out.println("Employee Profile.");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + Salary);
    }
}
class Manager extends Employee{
    void display(){
        System.out.println("Manager Profile.");
       System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + Salary);
    }
}
class Developer extends Employee{
    void display(){
        System.out.println("Developer Profile.");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + Salary);
    }
}


public class Second {
    public static void main(String[] args) {
        Manager m1 = new Manager();
        m1.setid(121);
        m1.setname("Bill Gates");
        m1.setSalary(100000);
        Developer d1 = new Developer();
        d1.setid(22203);
        d1.setname("Parth Kaushik");
        d1.setSalary(75000);
        m1.display();
        System.out.println();
        d1.display();
    }
}