
public class Main {
	public static void main(String[] args) throws InterruptedException {

		Join j = new Join();
		j.start();
		//j.join();
		j.interrupt();
		for (int i = 0; i <= 5; i++) {
			System.out.println("main method executed...");
		}
	}
} 
