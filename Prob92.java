package Problems;

import java.util.ArrayList;

public class Prob92 {
	
	static ArrayList<Integer> sad = new ArrayList<Integer>();
	
	public static boolean isSad(int x) {
		if (x == 4) {
			return true;
		} else {
			int p = 0;
			while (true) {
				if (p == 1) {
					return false;
				} else if (p == 4 || p == 89) {
					return true;
				} else {
					p = 0;
					while (x > 0) {
						p += (x % 10) * (x % 10);
						x /= 10;
					}
					
					x=p;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int count = 0;
		for (int i = 2; i <= 10000000; ++i) {
			if (isSad(i)) {
				count++;
			}
		}
		
		System.out.println(count);
	}

}
