package cp213;

/**
 * Sample string methods.
 *
 * @author Aryan Kohli 169091834 kohl1834@mylaurier.ca
 * @version 2025-09-24
 */
public class StringMethods {
	// Constants
	/**
	 * String of vowels.
	 */
	public static final String VOWELS = "aeiouAEIOU";

	/**
	 * Counts the number of vowels in a string. Does not include 'y'.
	 *
	 * @param string A string.
	 * @return Number of vowels in string.
	 */
	public static int vowelCount(final String string) {
		int count = 0;

		for (int i = 0; i < string.length(); i++) { // go through every character
			char ch = string.charAt(i); // pick out the current character
			if (VOWELS.indexOf(ch) != -1) { // check if the character is in the VOWELS string
				count++; // if yes, add one to our counter
			}
		}

		return count; // after the loop, return how many vowels we counted

	}

	/**
	 * Counts the number of digits in a string.
	 *
	 * @param string A string.
	 * @return Number of digits in string.
	 */
	public static int digitCount(final String string) {
		int count = 0;

		for (int i = 0; i < string.length(); i++) {
			if (Character.isDigit(string.charAt(i))) {
				count++;
			}
		}

		return count;
	}

	/**
	 * Totals the individual digits in a string.
	 *
	 * @param string A string.
	 * @return The integer total of all individuals digits in string.
	 */
	public static int totalDigits(final String string) {
		int total = 0;

		for (int i = 0; i < string.length(); i++) {
			char ch = string.charAt(i);
			if (Character.isDigit(ch)) {
				total += ch - '0'; // convert digit char to its int value
			}
		}
		return total;
	}

	/**
	 * Compares string1 and string2 and returns a comma-delimited concatenated
	 * string consisting of the string that is first lexically followed by the
	 * string that is second lexically. If the strings are equal, then only string1
	 * is returned.
	 *
	 * @param string1 String to compare against string2.
	 * @param string2 String to compare against string1.
	 * @return A concatenation of string1 and string2 in order.
	 */
	public static String pairs(String string1, String string2) {
		String line = null;

		int cmp = string1.compareTo(string2);

		if (cmp < 0) {
			line = string1 + "," + string2; // no space
		} else if (cmp > 0) {
			line = string2 + "," + string1; // no space
		} else {
			line = string1;
		}

		return line;
	}

	/**
	 * Finds the distance between the s1 and s2. The distance between two strings of
	 * the same length is the number of positions in the strings at which their
	 * characters are different. If two strings are not the same length, the
	 * distance is unknown (-1). If the distance is zero, then two strings are
	 * equal.
	 *
	 * @param string1 String to compare against string2.
	 * @param string2 String to compare against string1.
	 * @return The distance between string1 and string2.
	 */
	public static int stringDistance(String string1, String string2) {
		int distance = 0;

		// your code here
		if (string1.length() != string2.length()) {
			return -1;
		}

		for (int i = 0; i < string1.length(); i++) {
			if (string1.charAt(i) != string2.charAt(i)) {
				distance++;
			}
		}
		return distance;
	}
}
