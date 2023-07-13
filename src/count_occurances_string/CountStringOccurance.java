package count_occurances_string;

public class CountStringOccurance {
public static void main(String[] args) {
	String s="Java is popular programming language";
	int tc=s.length();
	int ns=s.replace("p", "").length();
	int fr=tc-ns;
	System.out.println("Total occurances :"+fr);
}
}
