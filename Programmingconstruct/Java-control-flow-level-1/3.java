import java.util.Scanner;
class Largest{
	public static void main(String... args){
		Scanner sc = new Scanner(System.in);
		
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		if (n1>=n2&&n1>=n3)
			System.out.println("The largest number is"+n1);
		else if (n2>=n1&&n2>=n3)
		System.out.println("The largest number is"+n2);
        else
        System.out.println("The Largest number is "+n3);
	}
}	
		