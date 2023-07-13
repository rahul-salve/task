 package FindOutLargestNo;

import java.util.Scanner;

public class FindLargestNo {
   public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a first no :");
	int a=sc.nextInt();
	System.out.println("Enter a second no :");
	int b=sc.nextInt();
	System.out.println("Enter a third no :");
	int c=sc.nextInt();
	
	/*
	 * if(a>=b && a>=c) { System.out.println(a+" is greater number.."); }else
	 * if(b>=a && b>=c) { System.out.println(b+" is greater number.."); }else {
	 * System.out.println(c+" is greater number.."); }
	 */
	
	// second Approch..
	
	int large=a>b?a:b;
	int largest=c>large?c:large;
	System.out.println(largest+" is the greater number..");
	
	
}
}
