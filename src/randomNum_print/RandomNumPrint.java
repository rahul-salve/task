package randomNum_print;

import java.util.Random;

public class RandomNumPrint {
  public static void main(String[] args) {
	Random random=new Random();
	int num=random.nextInt(100);
	System.out.println(num);
	System.out.println(Math.random());
	
}
}
