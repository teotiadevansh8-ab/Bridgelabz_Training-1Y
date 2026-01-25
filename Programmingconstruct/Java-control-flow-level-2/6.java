import java.util.Scanner;
class FriendsInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int ageAmar = input.nextInt();
        int ageAkbar = input.nextInt();
        int ageAnthony = input.nextInt();

        double hAmar = input.nextDouble();
        double hAkbar = input.nextDouble();
        double hAnthony = input.nextDouble();

        // Youngest
        if(ageAmar <= ageAkbar && ageAmar <= ageAnthony)
            System.out.println("Youngest: Amar");
        else if(ageAkbar <= ageAmar && ageAkbar <= ageAnthony)
            System.out.println("Youngest: Akbar");
        else
            System.out.println("Youngest: Anthony");

        // Tallest
        if(hAmar >= hAkbar && hAmar >= hAnthony)
            System.out.println("Tallest: Amar");
        else if(hAkbar >= hAmar && hAkbar >= hAnthony)
            System.out.println("Tallest: Akbar");
        else
            System.out.println("Tallest: Anthony");

        input.close();
    }
}
