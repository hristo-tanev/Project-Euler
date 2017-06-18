package Problems;

public class Prob2 {

	static final int N = 4000000;
	
	public static void main(String[] args) {
		int a = 1, b = 1, sum = 0;
		while (b <= N) {
			int c = a + b;
			a = b;
			b = c;
			if (b % 2 == 0) {
				sum += b;
			}
		}
		
		System.out.println(sum);
	}

}
