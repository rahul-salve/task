package factorialNum;

import java.util.Scanner;

public class FactorialNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num :");
		int num = sc.nextInt();

		int factorial = 1;

		/*
		 * for (int i = 1; num >= i; i++) { factorial = factorial * i; }
		 */
		
		for(int i=num;i>=1;i--) {
			factorial = factorial * i; 
		}
		System.out.println(factorial);
	}
}
