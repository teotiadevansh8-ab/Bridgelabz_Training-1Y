interface Payment {
    void pay(int amount);
}

class UPI implements Payment {
    int amount;

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void pay(int amount) {
        System.out.println("Paid via UPI: " + amount);
    }
}

class CreditCard implements Payment {
    int amount;

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void pay(int amount) {
        System.out.println("Paid via Credit Card: " + amount);
    }
}

class Wallet implements Payment {
    public void pay(int amount) {
        System.out.println("Paid via Wallet: " + amount);
    }
}
public class Third {

    public static void main(String[] args) {

        Payment p1 = new UPI();
        Payment p2 = new CreditCard();
        Payment p3 = new Wallet();

        p1.pay(20000);
        p2.pay(5000);
        p3.pay(1000);
    }
}