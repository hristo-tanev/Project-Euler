package Problems;

public class Prob63 {

	public static void main(String[] args) {
		int x = 0, n = 1, count = 0;
		while (x < 10) {
			x = (int)Math.ceil(Math.pow(10, (n - 1.0)/n));
			count += 10 - x;
			n++;
		}
		
		System.out.println(count);
	}

}
