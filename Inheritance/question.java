class Person{
    int age;
    String name;

    public void setage(int age){
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getage(){
        return age;
    }

    public String getName(){
        return name;
    }

    void display(){
        System.out.println("Age : - " + age);
        System.out.println("Name : - " + name);
    }
}

class Teacher extends Person{
    String subject;

    public void setsubject(String subject){
        this.subject = subject;
    }

    public String getsubject(){
        return subject;
    }

    void display(){
        super.display();
        System.out.println("Subject : - " + subject);
    }
}

class Student extends Person{
    int marks;

    public void setmarks(int marks){
        this.marks = marks;
    }

    public int getmarks(){
        return marks;
    }

    void display(){
        super.display(); 
        System.out.println("Marks : - " + marks);
    }
}

public class question {
    public static void main(String[] args) {

        Teacher t1 = new Teacher();
        t1.setName("Rahul");
        t1.setage(35);
        t1.setsubject("Math");

        Student s1 = new Student();
        s1.setName("Aman");
        s1.setage(20);
        s1.setmarks(90);

        t1.display();
        System.out.println();
        s1.display();
    }
}