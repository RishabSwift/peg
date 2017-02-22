import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.*;

public class primes2 {

	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {



		int count=0;
		long xrange = scan.nextLong();
		long zrange = scan.nextLong();

		long start = System.currentTimeMillis();

		boolean[] checkForPrime = Primes(zrange);



		for (long checks = xrange; checks <= zrange; checks++) {
			if (checkForPrime[(int) checks]) {
//				System.out.println(checks);
				count++;
			}
		}

		long end = System.currentTimeMillis();
		NumberFormat formatter = new DecimalFormat("#0.00000");
		System.out.print("Execution time is " + formatter.format((end - start) / 1000d) + " seconds");

//		System.out.println(count);

	}

	public static boolean[] Primes(long n) {
		boolean[] isPrime = new boolean[(int) (n + 1)];
		if (n >= 2)
			isPrime[2] = true;
		for (long i = 3; i <= n; i += 2)
			isPrime[(int) i] = true;
		for (long i = 3, end = sqrt(n); i <= end; i += 2) {
			if (isPrime[(int)i]) {
				for (long j = i * 3; j <= n; j += i << 1)
					isPrime[(int)j] = false;
			}
		}
		return isPrime;
	}

	public static long sqrt(long x) {
		long y = 0;
		for (long i = 15; i >= 0; i--) {
			y |= 1 << i;
			if (y > 46340 || y * y > x)
				y ^= 1 << i;
		}
		return y;
	}
}

// public static void main(String[] args) {
//
// Scanner scan = new Scanner(System.in);
//
// int numberM = scan.nextInt();
// int numberN = scan.nextInt();
//
// for (int i = numberM; i <= numberN; i++) {
// int count = 0;
// for (int j = 1; j <= i; j++) {
//
// if ((i % j) == 0) {
//
// count++;
// }
// }
// if (count == 2) {
// System.out.println(i);
// }
// }
//
// }
//
// static boolean isPrime(long n) {
//
// for(int j = 2; j < n; j++) {
// if(n % j == 0) {
// return false;
// }
// }
// return true;
//
// }

// }
