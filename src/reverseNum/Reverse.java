package reverseNum;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Num :");
		int num = sc.nextInt();
		/*
		 * int rev = 0; while (num != 0) { rev = rev * 10 + num % 10; num = num / 10; }
		 * System.out.println("Reverse num is :" + rev);
		 */
		
		//using StringBuffer
		
		/*
		 * StringBuffer sb=new StringBuffer(String.valueOf(num)); StringBuffer
		 * rev=sb.reverse(); System.out.println("Reverse num is :" + rev);
		 */
		StringBuilder sb=new StringBuilder();
		StringBuilder rev=sb.reverse();
		System.out.println("Reverse num is :" + rev);
		
	}
}
