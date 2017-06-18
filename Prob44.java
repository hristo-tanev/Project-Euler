package Problems;

public class Prob44 {
	
	static final int u = 10000;
	
	public static int getNthPentagonal(int n) {
		return (n * (3 * n - 1)) / 2;
	}
	
	public static boolean isPentagonal(int x) {
		double n = (Math.sqrt(24.0 * (double)x + 1) + 1) / 6.0;
		if (n < Math.ceil(n) && n > Math.floor(n)) {
			return false;
		}
		
		return true;
	}
		
	public static void main(String[] args) {
		int res = 999999999;
		
		for (int i = 1; i < u; ++i) {
			for (int j = i + 1; j <= u; ++j) {
				int p = getNthPentagonal(i);
				int q = getNthPentagonal(j);
				if (isPentagonal(p + q) && isPentagonal(q - p)) {
					if (res > (q - p)) {
						res = (q - p);
					}
				}
			}
		}
		
		System.out.println(res);
	}

}
