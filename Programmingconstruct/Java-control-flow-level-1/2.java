import java.util.Scanner;
class Numbertest {
	public static void main(String... args){
		Scanner sc = new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		
		if (n1<n2&&n1<n3)
			System.out.println("The number is smallest");
		else
		System.out.println("The number is not Smallest");
    }
}