package Problems;

public class Prob3 {

	public static void main(String[] args) {
		long n = 600851475143l;
		int i = 2, max = 0;
		while (n > 1) {
			while (n % i == 0) {
				n /= i;
			}
			if (max < i) {
				max = i;
			}
			i++;
		}
		
		System.out.println(max);
	}

}
