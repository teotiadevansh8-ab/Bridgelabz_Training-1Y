import java.util.Scanner;

class que {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
    System.out.println("Enter numbers of pens=");
	int pens=input.nextInt();
	System.out.println("Enter numbers of Students=");
	int students=input.nextInt();
	int que=pens/students;
	int remainder = pens % students;
System.out.println("Each student gets = " + que);
        System.out.println("Remaining pens = " + remainder);
	}
}
		
		
	


