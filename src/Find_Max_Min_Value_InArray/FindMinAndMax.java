package Find_Max_Min_Value_InArray;

public class FindMinAndMax {
	public static void main(String[] args) {
		int a[] = { 10, 30, 100, 30, 500 };
		int max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		System.out.println("Maximum value is :"+max);
		int min = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}

		}
		System.out.println("Minimum value is :"+min);
	}
}
