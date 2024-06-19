package BasicPrograms;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check if it is even or odd : ");
		int num = sc.nextInt();
		if(num%2==0) {
			System.out.println("The number "+num+" is even number.");
		}
		else {
			System.out.println("The number "+num+" is Odd number.");
		}

	}

}
