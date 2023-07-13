package demlo;

import java.io.IOException;

public class DataReader {
  String readLine() throws IOException {
	  StringBuilder dataString=new StringBuilder();
	  int data;
	  while((data=System.in.read())!=13) {
		dataString.append((char)data);
		
	  }
	  System.in.read();
	return dataString.toString();
  }
  
}
