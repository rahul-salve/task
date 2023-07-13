import java.util.ArrayList;
import java.util.Scanner;

public class New {
  public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter a num");
	String num=scanner.nextLine();
	
	ArrayList<String> log=new ArrayList<String>();
	log.add(num);
	while (scanner.hasNextLine()) {
		log.add(scanner.nextLine());
		
	}
	for(int i=0;i<log.size();i++) {
		//System.out.println(log.get(i));
		System.out.println(Test.containsZero(i));
	}
	
}
}
class Test{
	static boolean containsZero(int num) {
	    if(num == 0)
	        return true;

	    if(num < 0)
	        num = -num;

	    while(num > 0) {
	        if(num % 10 == 0)
	            return true;
	        num /= 10;
	    }
	    return false;
	}
}
