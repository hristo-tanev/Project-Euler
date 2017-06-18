package Problems;

import java.util.ArrayList;

public class Prob26 {
	
	public static int getPeriodLength(int d) {
		ArrayList<Integer> p = new ArrayList<Integer>();
		int remainder = -1, period = 0, n = 10;
		p.add(n);
		do {
			remainder = n % d;
			n = remainder * 10;
			if (p.indexOf(n) != -1) {
				break;
			}
			p.add(n);
			period++;
		} while (remainder != 0);
		
		return period + 1 - p.indexOf(n);
	}
	
	public static void main(String[] args) {
		int maxPeriod = 0, at = -1;
		for (int i = 2; i < 1000; ++i) {
			if (maxPeriod < getPeriodLength(i)) {
				maxPeriod = getPeriodLength(i);
				at = i;
			}
		}
		
		System.out.println(at);
	}

}
