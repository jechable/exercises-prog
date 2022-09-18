import java.util.Scanner;
import java.lang.Math;
import java.math.BigInteger;

public class Power {
	public static void main(String[] args) {
		int x = 256;
		int y = 5;
		int pow = Math.pow(x, y);
		BigInteger N;

		System.out.println(pow);
		
		N = BigInteger.valueOf(Math.pow(x, y));
		System.out.println(N.intValue());
	}
}
