package cp213;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * @author Aryan Kohli 169091834
 * @version 2025-10-05
 */
public class SerialNumber {

	/**
	 * Determines if a string contains all digits.
	 *
	 * @param string the string to test
	 * @return {@code true} if {@code string} is all digits, {@code false} otherwise
	 */
	public static boolean allDigits(final String string) {

		// your code here
		for (int i = 0; i < string.length(); i++) {
			if (!Character.isDigit(string.charAt(i))) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Determines if a string is a good serial number. Good serial numbers are of
	 * the form 'SN/nnnn-nnn', where 'n' is a digit.
	 *
	 * @param sn the serial number to test
	 * @return {@code true} if the serial number is valid in form, {@code false}
	 *         otherwise.
	 */
	public static boolean validSn(final String sn) {

		// your code here

		// Check if sn is null or doesn't match the correct pattern
		if (sn == null) {
			return false;
		}

		return sn.matches("^SN/\\d{4}-\\d{3}$");
	}

	/**
	 * Evaluates serial numbers from a file. Writes valid serial numbers to
	 * {@code goodSns}, and invalid serial numbers to {@code badSns}. Each line of
	 * {@code fileIn} contains a (possibly valid) serial number.
	 *
	 * @param fileIn  a file already open for reading
	 * @param goodSns a file already open for writing
	 * @param badSns  a file already open for writing
	 */
	public static void validSnFile(final Scanner fileIn, final PrintStream goodSns, final PrintStream badSns) {

		// your code here
		while (fileIn.hasNextLine()) {
			String line = fileIn.nextLine().trim(); // read and remove extra spaces

			// Check if the serial number is valid using validSn()
			if (validSn(line)) {
				goodSns.println(line); // write to good serial numbers file
			} else {
				badSns.println(line); // write to bad serial numbers file
			}
		}

		return;
	}
}