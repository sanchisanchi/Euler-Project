/**
 * A palindromic number reads the same both ways. The largest palindrome made 
 * from the product of two 2-digit numbers is 9009 = 91 Å~ 99.
 * 
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */

public class Problem004 {

	public static void main(String[] args) {
		int largest = 0;
		
		for (int i = 100; i < 1000; i++) {
			for (int j = 100; j < 1000; j++) {
				int product = i * j;
				if (isPalindrome(product) && product > largest) {
					largest = product;
				}
			}
		}
		System.out.println(largest);

	}
	
	public static boolean isPalindrome(int n) {
		StringBuffer s = new StringBuffer(String.valueOf(n));
	    return s.toString().equals(s.reverse().toString());
	}

}
