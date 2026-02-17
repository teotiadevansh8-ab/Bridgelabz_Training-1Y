import java.util.Scanner;
class Array_3{
	public static void main(String... args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the positive number: ");
		int n = input.nextInt();
		int arr []= new int[n];
		for(int i=0;i<arr.length;i++){
			System.out.println("Enter Element At index"+i+" :");
			arr[i]=input.nextInt();
		}
		for (int i=0;i<arr.length;i++){
			if(arr[i]%3==0&&arr[i]%5==0){
				System.out.println("FizzBuzz");
			}
			else if (arr[i]%3==0){
			System.out.println("Fizz");
			}
			else if(arr[i]%5==0){
				System.out.println("Buzz");
			}
			else{
				System.out.println(arr[i]);
			}
		}
	
	}
}
	
		
