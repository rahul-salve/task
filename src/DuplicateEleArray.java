
public class DuplicateEleArray {
  public static void main(String[] args) {
	  
	  int[] a= {10,20,30,40};
	  boolean flag=true;
	  for(int i=0;i<a.length;i++) {
		  for(int j=i+1;j<a.length;j++) {
			  
			  if(a[i]==a[j]) {
				  System.out.println( a[i]+" Num is duplicate");
				 flag=false; 
			  } 
	  }
	 }if(flag==true) {
		  System.out.println("No duplicate value found..");
		  
 }
	 
  }
}
