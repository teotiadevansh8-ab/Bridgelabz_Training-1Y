class Order{
    int orderId;
    int orderDate;
    public void setorderId(int orderId){
        this.orderId = orderId;
    }
    public void setorderDate(int orderDate){
        this.orderDate = orderDate;
    }
    public int getorderId(){
        return orderId;
    }
    public int getorderDate(){
        return orderDate;
    }
    void display(){
        System.out.println("Basic Information : - ");
        System.out.println("Order_Id : - "+orderId);
        System.out.println("Order_Date : - "+orderDate);
    }
}

class ShippedOrder extends Order{
    int trackingNumber;
    public void settrackingNumber(int trackingNumber){
        this.trackingNumber = trackingNumber;
    }
    public int gettrackingNumber(){
        return trackingNumber;
    }
    void display(){
        super.display();
        System.out.println("Tracking_Number : - "+trackingNumber);
    }
}




public class Six {
public static void main(String[] args) {
    ShippedOrder s1 = new ShippedOrder();
    s1.setorderId(1223);
    s1.setorderDate(1923);
    s1.settrackingNumber(1789479045);
    s1.display();
}
    
}