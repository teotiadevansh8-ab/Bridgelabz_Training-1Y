interface MessageChecker {
    void checkMessage(String message);
}

class LengthChecker implements MessageChecker {

    int limit = 20;

    public void checkMessage(String message) {

        int length = message.length();  // direct method

        if (length > limit) {
            System.out.println("❌ Message exceeds limit! Length: " + length);
        } else {
            System.out.println("✅ Message is within limit. Length: " + length);
        }
    }
}

public class Fifth {
    public static void main(String[] args) {

        MessageChecker m1 = new LengthChecker();

        m1.checkMessage("Hello Java");
        m1.checkMessage("This is a very long message exceeding limit");
    }
}