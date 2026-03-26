interface TemperatureChecker {
    void checkTemperature(double temp);
}

class AlertSystem implements TemperatureChecker {

    double threshold = 40.0;

    public void checkTemperature(double temp) {

        if (temp > threshold) {
            System.out.println("⚠️ High Temperature Alert: " + temp);
        } else {
            System.out.println("✅ Temperature Normal: " + temp);
        }
    }
}

public class Fourth {
    public static void main(String[] args) {

        TemperatureChecker t1 = new AlertSystem();

        t1.checkTemperature(42.5);
        t1.checkTemperature(35.0);
    }
}