package FindOwelsInString;

public class FindOwelsInString {
	public static void main(String[] args) {
		String s = "Rahul Salve";

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'e' || s.charAt(i) == 'a' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'u') {
				System.out.println("Given String contain " + s.charAt(i) + " index of " + i);
			}
		}
	}
}

