package Problems;

public class Prob6 {

	static final int N = 100;
	
	public static void main(String[] args) {
		int sum = (N * (N + 1)) / 2;
		int sumq = (N * (N + 1) * (2 * N + 1)) / 6;
		System.out.println(sum*sum - sumq);
	}

}
