class Course{
    String courseName;
    int duration;

    public void setcourseName(String courseName){
        this.courseName = courseName;
    }

    public void setduration(int duration){
        this.duration = duration;
    }

    public String getcourseName(){
        return courseName;
    }

    public int getduration(){
        return duration;
    }

    void display(){
        System.out.println("Educational Course : - ");
        System.out.println("Course_Name : - " + courseName);
        System.out.println("Duration : - " + duration);
    }
}

class OnlineCourse extends Course{
    String platform;
    String isRecorded;

    public void setplatform(String platform){
        this.platform = platform;
    }

    public void setisRecorded(String isRecorded){
        this.isRecorded = isRecorded;
    }

    public String getplatform(){
        return platform;
    }

    public String getisRecorded(){
        return isRecorded;
    }

    void display(){
        super.display();
        System.out.println("Platform : - " + platform);
        System.out.println("Is_Recorded : - " + isRecorded);
    }
}

class PaidOnlineCourse extends OnlineCourse{   
    double fee;
    double discount;

    public void setfee(double fee){
        this.fee = fee;
    }

    public void setdiscount(double discount){   
        this.discount = discount;
    }

    public double getfee(){
        return fee;
    }

    public double getdiscount(){
        return discount;
    }

    void display(){
        super.display();  // calls OnlineCourse → Course
        System.out.println("Fees : - " + fee);
        System.out.println("Discount : - " + discount);
    }
}

public class Seventh {
    public static void main(String[] args) {

        OnlineCourse h1 = new OnlineCourse();
        h1.setcourseName("B.Tech");
        h1.setduration(4);
        h1.setplatform("Offline");
        h1.setisRecorded("No");

        PaidOnlineCourse p1 = new PaidOnlineCourse();
        p1.setcourseName("Java Full Course");   
        p1.setduration(6);
        p1.setplatform("Udemy");
        p1.setisRecorded("Yes");
        p1.setfee(600000);
        p1.setdiscount(50000);

        h1.display();
        System.out.println();
        p1.display();
    }
}