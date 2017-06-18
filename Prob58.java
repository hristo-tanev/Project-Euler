package Problems;

public class Prob58 {
	
	static int[] b = new int[]{-2, 0, 2, 4};
	static int[] primes = new int[4];

	public static boolean isPrime(int x) {
		if (x <= 2) {
			return true;
		} else {
			for (int i = 2; i <= (int)Math.sqrt((double)x); ++i) {
				if (x % i == 0) {
					return false;
				}
			}
			
			return true;
		}
	}
	
	public static void main(String[] args) {
		int n = 0;
		double ratio = 0.0;
		do {
			n++;
			for (int i = 0; i < 4; ++i) {
				if (isPrime(4*(n*n) + b[i]*n + 1)) {
					primes[i]++;
				}
			}
			
			int primesSum = 0;
			for (int i : primes) {
				primesSum += i;
			}
			
			int numbersOnDiags = 2*(int)Math.sqrt(4*(n*n) + 4*n + 1) - 1;
			ratio = (double)primesSum / (double)numbersOnDiags;
		} while (ratio >= 0.1);
		
		int side = (int)Math.sqrt(4*(n*n) + 4*n + 1);
		System.out.println(side);
	}

}
