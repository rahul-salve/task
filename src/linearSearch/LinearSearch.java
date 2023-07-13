package linearSearch;

public class LinearSearch {
  public static void main(String[] args) {
	  int [ ]a= {10,120,3034,404};
	  int ls=12;
	  boolean flag=true;
	  for(int i=0;i<a.length;i++) {
		  if(ls==a[i]) {
			  System.out.println(a[i]+" num is found");
			  flag=false;
			  break;
		  } 
			  
	  }if(flag==true)
	  System.out.println("Num is not found...");
  }
}
