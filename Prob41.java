package Problems;

public class Prob41 {
	
	static boolean[] picked = new boolean[10];
	
	public static boolean isPrime(int n) {
		if (n <= 3) {
			return true;
		}
		
		for (int i = 2; i <= (int)Math.sqrt((double)n); ++i) {
			if (n % i == 0) {
				return false;
			}
		}
		
		return true;
	}
	
	public static void genPerm(int i, int num, int n) {
		if (i >= n) {
			if (isPrime(num)) {
				System.out.println(num);
				return;
			}
			return;
		}
		
		for (int j = n; j >= 1; --j) {
			if (!picked[j]) {
				picked[j] = true;
				genPerm(i + 1, num * 10 + j, n);
				picked[j] = false;
			}
		}
	}
	
	public static void main(String[] args) {
		for (int i = 7; i >= 1; --i) {
			for (int j = 1; j <= 9; ++j) {
				picked[j] = false;
			}
			
			genPerm(0, 0, i);
		}
	}

}
