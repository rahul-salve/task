package TwoArraysLenght;

public class FindTwoArraysLenght {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 6 };
		int b[] = { 5, 1, 2, 3 };

		/*
		 * boolean status = a.equals(b); if (status == true) {
		 * System.out.println("Array a and Array b are same..."); } else
		 * System.out.println("Array a and Array b are not same...");
		 */
		boolean status = true;
		if (a.length == b.length) {
			for (int i = 0; i < a.length; i++) {
				if (a[i] != b[i]) {
					status = false;
				}
			}
		} else {
			status = false;
		}
		if (status = true) {
			System.out.println("Arrays are equal...");
		} else {
			System.out.println("Arrays are not equal...");
		}
	}
}
