package BasicPrograms;

import java.util.Scanner;

public class inputAddNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in); //This is scanner constructor with System.in parameter
		
		System.out.println("Enter first Number : ");
		int a = scanner.nextInt();               // scanner,nextInt is the method to get input for integer numbers.
		
		System.out.println("Enter second Number : ");
		int b = scanner.nextInt();
		
		int sum = a+b;
		
		System.out.println("The sum of two given numbers is : "+sum);
		

	}

}
