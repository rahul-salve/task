package palindromString;

import java.util.Scanner;

public class PalindromString {
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a String :");
	String s=sc.next();
	String org_s=s;
	String rev="";
	int len=org_s.length();
	
	for (int i =len-1; i >=0; i--) {
		rev=rev+s.charAt(i);
	}
	//System.out.println(rev);
	if(org_s.equals(rev)) {
		System.out.println("String is palindrom...");
	}else
	System.out.println("String is not palindrom...");
}
}
