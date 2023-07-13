package amstrong_num;

public class AmstrongNum {
public static void main(String[] args) {
	int num=153;
	int temp=num;
	int sum=0;
	 while(num!=0) {
		 int r=num%10;
		 num=num/10;
		 sum=sum+(r*r*r);
	 }
	 if(sum==temp) {
		 System.out.println(temp +" Num is Amstrong..");
	 }else {
		 System.out.println(temp+" num is not Amstrong...");
	 }
}
}
