package countOddAndEven;

public class OddAndEven {
	public static void main(String[] args) {
		int num = 1234567890;
		int odd_num = 0;
		int even_num = 0;

		while (num > 0) {
			int rem = num % 10;

			if (rem % 2 == 0) {
				even_num++;
			} else {
				odd_num++;
			}
			num = num /10;
		}
		System.out.println("Even no counting :" + even_num);
		System.out.println("Odd no counting :" + odd_num);
	}
}
