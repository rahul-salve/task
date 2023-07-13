package sum_of_array_value;

public class SumOfArray {
  public static void main(String[] args) {
	int arr[]= {1,2,3,4,5,6};
	
	int sum=0;
	/*
	 * for(int i=0;i<=arr.length-1;i++) { sum=sum+arr[i]; }
	 */
	for(int value:arr) {
		sum=sum+value;
	}
	
	System.out.println(sum);
	
}
} 
