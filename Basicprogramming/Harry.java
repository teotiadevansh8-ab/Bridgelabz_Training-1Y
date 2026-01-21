import java.util.Scanner;
class Harry{
	public static void main(String args[]){
		Scanner intput = new Scanner(System.in);
		System.out.println("Enter the birth year");
		int birthyear=intput.nextInt();
		int currentyear=2026;
		int age = currentyear-birthyear;
		System.out.println("age="+age);
	}
}