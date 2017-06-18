package Problems;

public class Prob28 {
	
	static int[] b=new int[]{-2, 0, 2, 4};
	
	public static void main(String[] args) {
		int sum = 1, u;
		
		for (u = 1; (4*(u*u) + 4*u + 1) != (1001*1001); ++u);
		
		for (int i : b) {
			for (int j = 1; j <= u; ++j) {
				sum += 4*(j*j) + i*j + 1;
			}
		}
		
		System.out.println(sum);
	}

}
