package palindromNum;

import java.util.Scanner;

public class PalindromNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num :");
		int num = sc.nextInt();
		int org_Num = num;
		int rev = 0;
		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		if (org_Num == rev) {
			System.out.println(org_Num + " num is palindrom..");
		} else {
			System.out.println(org_Num + " num is not palindrom..");
		}

	}
}
