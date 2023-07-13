package find_ele_array;

public class Find_Ele_Array {
	public static void main(String[] args) {
		int arr[] = { 12, 20, 32, 22, 12 };
		int search_ele = 22;
		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			if (search_ele == arr[i]) {
				System.out.println("Element is found :" + i);

				flag = true;
				break;
			}

		}
		if (flag == false) {
			System.out.println("Element is not found....");
		}
	}
}
