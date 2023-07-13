package LargeNumArray;

public class LargeNum {
  public static void main(String[] args) {
	  int a[]= {1000,20,10,3000};
	   //max
	  int max=a[0];
	  for(int i=0;i<a.length;i++) {
		  if(a[i]>max) {
			  max=a[i];
		  }  
	  }
	  System.out.println(max);
  
  
  //min
  int min=a[0];
  for(int i=0;i<a.length;i++) {
	  if(a[i]<min) {
		  min=a[i];
	  }
  }
  System.out.println(min);
}
}
