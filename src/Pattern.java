
public class Pattern {
	public static void main(String[] args) {
		int n = 5;
		int mid = n / 2 + 1;

		for (int i = 1; i <=n; i++) {
			for (int j = 1; j<=n; j++) {
				if (i == mid || (j == 1 && i>= mid) || j == n) {
					System.out.println("* ");
				} else {
					System.out.println("");
				}
			}
			System.out.println();
		}
	}
}
