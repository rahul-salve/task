package reverse_n_one;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter a num :");
	int num=sc.nextInt();
	for(int i=num;i>=1;i--) {
		System.out.println(i);
	}
	}
}
