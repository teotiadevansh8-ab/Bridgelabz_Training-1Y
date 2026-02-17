import java.util.Scanner;
import java.util.Calendar;

class CalendarDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int year = sc.nextInt();

        Calendar cal = Calendar.getInstance();
        cal.set(year, month - 1, 1);

        int firstDay = cal.get(Calendar.DAY_OF_WEEK);
        int days = cal.getActualMaximum(Calendar.DAY_OF_MONTH);

        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        for (int i = 1; i < firstDay; i++)
            System.out.print("    ");

        for (int d = 1; d <= days; d++) {
            System.out.printf("%4d", d);
            if ((d + firstDay - 1) % 7 == 0)
                System.out.println();
        }
        sc.close();
    }
}
