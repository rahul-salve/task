
public class ReverseString {
 public static void main(String[] args) {
	 String s= "java is awesome language"; 
	 StringBuffer sb=new StringBuffer(s);
	System.out.println( sb.reverse());
	
	int len=s.length();
	String rev="";
	for(int i=len-1;i>=0;i--) {
		rev=rev+s.charAt(i);
	}
	System.out.println(rev);
 }
}
