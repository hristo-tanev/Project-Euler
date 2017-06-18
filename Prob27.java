package Problems;

public class Prob27 {
	
	public static boolean isPrime(int n) {
		int count = 0, i = 2;
		while (n > 1) {
			int divs = 0;
			while (n % i == 0) {
				divs++;
				n /= i;
			}
			
			if (divs > 0) {
				count++;
			}
			
			i++;
		}
		
		return (count == 1);
	}
	
	public static int period(int a, int b) {
		int count = 0;
		for (int i = 0;; ++i) {
			int e = i * i + a * i + b;
			if (isPrime(e)) {
				count++;
			} else {
				break;
			}
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		int maxPeriod = 0, prod = -1;
		for (int i = (-1000); i <= 1000; ++i) {
			for (int j = (-1000); j <= 1000; ++j) {
				if (maxPeriod < period(i, j)) {
					maxPeriod = period(i, j);
					prod = i * j;
				}
			}
		}
		
		System.out.println(prod);
	}

}
