import java.util.Scanner;

public class Compare{
    public static boolean Compare(String S1, String S2){
        if (S1.length() != S2.length()){
            return false;
        }
        for (int i=0;i<S1.length();i++) {
            if (S1.charAt(i) != S2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter first String");
        String S1= input.nextLine();
        System.out.println("Enter second String");
        String S2= input.nextLine();
        boolean ResultcharAt=Compare(S1,S2);
        boolean result=S1.equals(S2);
        System.out.println("Result using charAt():"+ ResultcharAt);
        System.out.println("Result using equals():"+ result);
        if (ResultcharAt == result) {
            System.out.println("Both methods give the SAME result.");
        } else {
            System.out.println("Both methods give DIFFERENT results.");
        }

        input.close();
    }
}
