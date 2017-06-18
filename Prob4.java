package Problems;

import java.util.ArrayList;

public class Prob4 {
	
	public static boolean isPalindrome(int x) {
		ArrayList<Integer> digits = new ArrayList<Integer>();
		while (x > 0) {
			digits.add((x % 10));
			x /= 10;
		}
		
		int size = digits.size();
		for (int i = 0; i < size / 2; ++i) {
			if (digits.get(i) != digits.get(size - i - 1)) {
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		int max = 0;
		
		for (int i = 100; i < 999; ++i) {
			for (int j = i + 1; j < 1000; ++j) {
				if (isPalindrome(i * j)) {
					if (max < (i * j)) {
						max = (i * j);
					}
				}
			}
		}
		
		System.out.println(max);
	}

}
