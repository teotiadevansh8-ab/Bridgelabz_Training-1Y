import java.util.Scanner;

class RockPaper {
    static String compChoice() {
        String[] c = {"rock","paper","scissors"};
        return c[(int)(Math.random()*3)];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String user = sc.next();
        String comp = compChoice();

        System.out.println("Computer: " + comp);

        if (user.equals(comp))
            System.out.println("Draw");
        else if ((user.equals("rock") && comp.equals("scissors")) ||
                 (user.equals("paper") && comp.equals("rock")) ||
                 (user.equals("scissors") && comp.equals("paper")))
            System.out.println("User Wins");
        else
            System.out.println("Computer Wins");

        sc.close();
    }
}
