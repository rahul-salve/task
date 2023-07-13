package RemoveSpace;

public class RemoveSpaceOfString {
  public static void main(String[] args) {
	String s="Java  is most   popular  prograamming    language";
	System.out.println("Before removing space :"+s);
	s=s.replaceAll("\\s", "");
	System.out.println("After removing space :"+s);
}
}
