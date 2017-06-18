package Problems;

import java.math.BigInteger;

public class Prob20 {

	public static void main(String[] args) {
		BigInteger factorial = BigInteger.valueOf(1);
		for (int i = 1; i <= 100; ++i) {
			factorial = factorial.multiply(BigInteger.valueOf(i));
		}
		
		int sum = 0;
		for (int i = 0; i < factorial.toString().length(); ++i) {
			sum += (int)factorial.toString().charAt(i) - '0';
		}
		
		System.out.println(sum);
	}

}
