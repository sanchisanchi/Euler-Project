public class Problem003 {
	public static void main(String[] args) {
		long n = 600851475143L;
		long max = 0L;
		
		for (long i = 2L; i * i < n; i++) {
			if (isPrime(i) && (n % i == 0)) {
				n /= i;
				if (isPrime(n)) {
					max = n;
					break;
				} else {
					max = i;
				}
			}
		}
		System.out.println(max);
	}

	public static boolean isPrime(long n) {
		if (n % 2 == 0) 
			return false;
		
		for (int i = 3; i * i <= n; i += 2) {
			if (n % i == 0)
	            return false;
		}
		
		return true;
	}
}
