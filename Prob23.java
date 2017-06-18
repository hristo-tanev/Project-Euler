package Problems;

import java.util.ArrayList;

public class Prob23 {
	
	static final int N = 28123;
	static boolean[] represent = new boolean[N + 1];
	static ArrayList<Integer> abundant = new ArrayList<Integer>();
	
	public static int pow(int x, int y) {
		if (y == 0) {
			return 1;
		} else if (y == 1) {
			return x;
		} else {
			if (y % 2 == 0) {
				return pow(x * x, y / 2);
			} else {
				return x * pow(x * x, (y - 1) / 2);
			}
		}
	}

	public static int sumOfDivs(int n) {
		int i = 2, sum = 1;
		while (n > 1) {
			int count = 0;
			while (n % i == 0) {
				count++;
				n /= i;
			}
			
			if (count > 0) {
				int itop = pow(i, count + 1) - 1;
				sum *= itop / (i - 1);
			}
			i++;
		}
		
		return sum;
	}
	
	public static boolean isAbundant(int n) {
		return (n < (sumOfDivs(n)) - n);
	}
	
	public static void main(String[] args) {
		for (int i = 1; i <= N; ++i) {
			if (isAbundant(i)) {
				abundant.add(i);
			}
		}
		
		for (int i = 0; i < abundant.size(); ++i) {
			for (int j = 0; j < abundant.size(); ++j) {
				if (abundant.get(i) + abundant.get(j) <= N) {
					represent[(abundant.get(i) + abundant.get(j))] = true;
				}
			}
		}
		
		int sum = 0;
		for (int i = 1; i <= N; ++i) {
			if (!represent[i]) {
				sum += i;
			}
		}
		
		System.out.println(sum);
	}

}
