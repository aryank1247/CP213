package cp213;

/**
 * @author Aryan Kohli 169091834
 * @version 2025-10-05
 */
public class Numbers {

	/**
	 * Determines closest value of two values to a target value.
	 *
	 * @param target the target value
	 * @param v1     first comparison value
	 * @param v2     second comparison value
	 * @return one of {@code v1} or {@code v2} that is closest to {@code target},
	 *         {@code v1} is the value chosen if {@code v1} and {@code v2} are an
	 *         equal distance from {@code target}
	 */
	public static double closest(final double target, final double v1, final double v2) {

		// your code here

		if (Math.abs(target - v1) <= Math.abs(target - v2)) {
			return v1;
		} else {
			return v2;
		}
	}

	/**
	 * Determines if {@code n} is a prime number. Prime numbers are whole numbers
	 * greater than 1, that have only two factors - 1 and the number itself. Prime
	 * numbers are divisible only by the number 1 or itself.
	 *
	 * @param n an integer
	 * @return {@code true} if n is prime, {@code false} otherwise
	 */
	public static boolean isPrime(final int n) {

		// your code here

		if (n <= 1) {
			return false;
		}

		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}

		return true;

	}

	/**
	 * Sums and returns the total of a partial harmonic series. This series is the
	 * sum of all terms 1/i, where i ranges from 1 to {@code n} (inclusive). Ex:
	 *
	 * <pre>
	 * n = 3: sum = 1/1 + 1/2 + 1/3 = 1.8333333333333333
	 * </pre>
	 *
	 * @param n an integer
	 * @return sum of partial harmonic series from 1 to {@code n}
	 */
	public static double sumPartialHarmonic(final int n) {

		// your code here

		double sum = 0.0;

		for (int i = 1; i <= n; i++) {
			sum += 1.0 / i;
		}

		return sum;

	}
}
