package Problems;

public class Prob12 {
	
	public static int getDivisors(int n) {
		int i = 2, numberOfDivisors = 1;
		while (n > 1) {
			int count = 0;
			while (n % i == 0) {
				count++;
				n /= i;
			}
			
			if (count > 0) {
				numberOfDivisors *= (count + 1);
			}
			i++;
		}
		
		return numberOfDivisors;
	}

	public static void main(String[] args) {
		int n = 1;
		while (true) {
			int number = n * (n + 1) / 2;
			int divisors = getDivisors(number);
			if (divisors > 500) {
				System.out.println(number);
				break;
			}
			
			n++;
		}
	}

}
