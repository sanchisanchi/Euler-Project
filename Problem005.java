/**
 * 2520 is the smallest number that can be divided by each 
 * of the numbers from 1 to 10 without any remainder.
 * 
 * What is the smallest positive number that is evenly 
 * divisible by all of the numbers from 1 to 20?
 */

public class Problem005 {

	public static void main(String[] args) {
		long lcm = 2520L;
		
		while (!multiple(lcm)) {
			lcm++;
		}
		System.out.println(lcm);

	}
	
	public static boolean multiple(long num) {
		for (int i = 1; i <= 20; i++) {
			if (num % i != 0) {
				return false;
			}
		}
		return true;
	}

}
