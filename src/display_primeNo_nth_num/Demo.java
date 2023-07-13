package display_primeNo_nth_num;

import java.util.Scanner;


class Test{
	public static String getResult(String strs) {
	
		 String words[]=strs.split("\\s");
	        String newString ="";
	        
	        for(String w: words){
	            String first = w.substring(0,1);      //First Letter
	            String rest = w.substring(1);         //Rest of the letters
	            newString+=first.toUpperCase()+ rest+ " ";  
	        }  
		return newString.trim();
	} 
}


public class Demo {
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a String :");
	String n=sc.nextLine();
	
	System.out.println(Test.getResult(n));
	
}


}
