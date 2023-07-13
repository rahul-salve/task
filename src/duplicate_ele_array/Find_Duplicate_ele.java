package duplicate_ele_array;

import java.util.HashSet;

public class Find_Duplicate_ele {
	public static void main(String[] args) {

		String arr[] = { "java", "python", "java", "c" };

		/*
		 * HashSet<String> hs = new HashSet<String>(); boolean flag = false; for (String
		 * s : arr) { if (hs.add(s) == false) {
		 * System.out.println("Found duplicate ele :" + s); flag = true; } }
		 * if(flag==false) { System.out.println("Duplicate ele not found.."); } }
		 */
		// Approch-2

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println("Duplicate ele found :" + arr[i]);
				}
			}
		}

	}
}
