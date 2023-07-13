package swappingTwoNum;

public class SwapTwoNo {
	public static void main(String[] args) {

		int a = 10;
		int b = 20;

		// using 3rd variable
		/*
		 * int c = a; a = b; b = c; System.out.println("a :" + a + " and  b :" + b);
		 */

		// using 2 variable
		/*
		 * a = a + b; b = a - b; a = a - b; System.out.println("a :" + a + " and  b :" +
		 * b);
		 */
		/*
		 * a = a * b; b = a / b; a = a / b; System.out.println("a :" + a + " and  b :" +
		 * b);
		 */
		// using bitwise operator XOR

		/*
		 * a = a ^ b; b = a ^ b; a = a ^ b; System.out.println("a :" + a + " and  b :" +
		 * b);
		 */
		//using single statement
		
		b=a+b-(a=b);
		System.out.println("a :" + a + " and  b :" + b);


	}
}
