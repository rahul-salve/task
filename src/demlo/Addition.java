package demlo;

import java.io.IOException;

public class Addition {
 public static void main(String[] args) throws NumberFormatException, IOException {
	DataReader reader=new DataReader();
	System.out.print("Enter a no1 :");
	int a=Integer.parseInt(reader.readLine());
	System.out.println("Enter a no2 :");
	int b=Integer.parseInt(reader.readLine());
	int c=a+b;
	
	System.out.println("Result :"+c);
}
}
