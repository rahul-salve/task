package reverse_String;

public class ReverseString {
	public static void main(String[] args) {
		String str = "ABCD";
		String rev = "";

		/*
		 * int len = str.length();
		 * 
		 * for (int i = len - 1; i >= 0; i--) { rev = rev + str.charAt(i); }
		 * System.out.println("Reverse String is :" + rev);
		 */

		// using char[]

		/*
		 * char a[] = str.toCharArray(); int len = a.length;
		 * 
		 * for (int i = len - 1; i >= 0; i--) { rev = rev + a[i]; }
		 * System.out.println("Reverse String is :" + rev);
		 */
		
		//using StringBuffer
		
		StringBuffer sb=new StringBuffer(str);
		System.out.println("Reverse String is :" +sb.reverse());
	}
}
