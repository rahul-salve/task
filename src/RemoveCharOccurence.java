
public class RemoveCharOccurence {
    public static void main(String[] args) {
    	String s="JAVA IS AWESOME LANGUAGE";
           System.out.println(s.replace("S",""));
           
           int len=s.length();
           int ts=s.replace("S","").length();
           int org=len-ts;
           System.out.println("Count is :"+org);
    }
}
