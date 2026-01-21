import java.util.Scanner;
class avg{
	public static void main(String args[]){
		Scanner intput = new Scanner(System.in);
		System.out.println("Enter number in maths=");
		int maths=intput.nextInt();
		System.out.println("Enter number in phy=");
		int phy=intput.nextInt();
		System.out.println("Enter number in che=");
		int che=intput.nextInt();
		int sum =che+phy+maths;
		float avg=sum/3;
		System.out.println("Average="+avg);
	}
}
		