import java.util.Scanner;
import java.math.BigInteger;

public class Test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Trying to use class BigInteger	
		// BigInteger number = new BigInteger.valueOf(237987);

		System.out.println("Enter text to print 10 times");
		String message = input.nextLine();

		for (int i = 0; i < 10; i++) {
			System.out.println(message);
		}
	}
}
