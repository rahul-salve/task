package print_one_n_num;

import java.util.Scanner;

public class Demo {
   public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number :");
	int num=sc.nextInt();
	
	for(int i=1;i<=num;i++) {
		System.out.println(" "+i);
	}
}
}
