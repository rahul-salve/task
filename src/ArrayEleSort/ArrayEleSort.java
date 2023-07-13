package ArrayEleSort;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArrayEleSort {
	public static void main(String[] args) {
		//int a[] = { 12, 43, 56, 75, 32, 11 };

		/*
		 * System.out.println("Array ele before sorting :" + Arrays.toString(a));
		 * Arrays.parallelSort(a); System.out.println("Array ele after sorting :" +
		 * Arrays.toString(a));
		 */
		
		//Approch 2
		/*
		 * System.out.println("Array ele before sorting :" + Arrays.toString(a));
		 * Arrays.sort(a); System.out.println("Array ele after sorting :" +
		 * Arrays.toString(a));
		 */
		
		//Approch 3
		Integer a[] = { 12, 43, 56, 75, 32, 11 };
		System.out.println("Array ele before sorting :" + Arrays.toString(a));
		Arrays.sort(a,Collections.reverseOrder());
		System.out.println("Array ele after sorting :" + Arrays.toString(a));
	}
}
