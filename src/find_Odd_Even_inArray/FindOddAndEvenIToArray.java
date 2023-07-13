package find_Odd_Even_inArray;

public class FindOddAndEvenIToArray {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		System.out.println("Even Numbers..");
		for (int value : arr) {
			if (value % 2 == 0) {
				System.out.println(value);
			}
		}
		System.out.println("Odd Numbers..");
		for (int v : arr) {
			if (v % 2 != 0) {
				System.out.println(v);
			}
		}
	}
}
