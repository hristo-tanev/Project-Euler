package Problems;

public class Prob21 {
	
	static final int N = 10000;

	public static int sumDiv(int n) {
		int i = 2, sum = 1, p = n;
		while (p > 1) {
			int count = 0;
			while (p % i == 0) {
				count++;
				p /= i;
			}
			
			if (count > 0) {
				int itop = (int)(Math.pow(i, count + 1) - 1);
				sum *= itop / (i - 1);
			}
			i++;
		}
		
		return sum - n;
	}
	
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i < N; ++i) {
			if (sumDiv(i) > i) {
				System.out.println(i + " " + sumDiv(i));
			}
		}
	}

}
