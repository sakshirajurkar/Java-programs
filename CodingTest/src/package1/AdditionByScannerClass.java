package package1;
import java.util.Scanner;
public class AdditionByScannerClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the num of your choice");
		int a = sc.nextInt();
		
		System.out.println("Enter the num of your choice");
		int b = sc.nextInt();
		
		int result = a+b;
		System.out.println("a+b="+result);
		
		
	}

}