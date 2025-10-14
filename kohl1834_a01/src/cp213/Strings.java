package cp213;

/**
 * @author Your name and id here
 * @version 2025-09-07
 */
public class Strings {
	// Constants
	public static final String VOWELS = "aeiouAEIOU";

	/**
	 * Determines if {@code string} is a "palindrome": a word, verse, or sentence
	 * (such as "Able was I ere I saw Elba") that reads the same backward or
	 * forward. Ignores case, spaces, digits, and punctuation in {@code string}.
	 *
	 * @param string a string
	 * @return {@code true} if {@code string} is a palindrome, {@code false}
	 *         otherwise
	 */
	public static boolean isPalindrome(final String string) {

		// your code here
		if (string == null) {
			return false;
		}

		// Step 1: Normalize the string — remove all non-letters and make lowercase
		String cleaned = string.replaceAll("[^A-Za-z]", "").toLowerCase();

		// Step 2: Compare cleaned string with its reverse
		int left = 0;
		int right = cleaned.length() - 1;

		while (left < right) {
			if (cleaned.charAt(left) != cleaned.charAt(right)) {
				return false; // mismatch means not a palindrome
			}
			left++;
			right--;
		}

		return true; // all characters matched
	}

	/**
	 * Determines if {@code name} is a valid Java variable name. Variables names
	 * must start with a letter or an underscore, but cannot be an underscore alone.
	 * The rest of the variable name may consist of letters, numbers and
	 * underscores.
	 *
	 * @param name a string to test as a Java variable name
	 * @return {@code true} if {@code name} is a valid Java variable name,
	 *         {@code false} otherwise
	 */
	public static boolean isValid(final String name) {

		// your code here
		if (name == null || name.isEmpty()) {
			return false;
		}

		// Variable name cannot be just "_"
		if (name.equals("_")) {
			return false;
		}

		// Must start with a letter or underscore
		char first = name.charAt(0);
		if (!Character.isLetter(first) && first != '_') {
			return false;
		}

		// Remaining characters can be letters, digits, or underscores
		for (int i = 1; i < name.length(); i++) {
			char ch = name.charAt(i);
			if (!Character.isLetterOrDigit(ch) && ch != '_') {
				return false;
			}
		}

		return true;
	}

	/**
	 * Converts a word to Pig Latin. The conversion is:
	 * <ul>
	 * <li>if a word begins with a vowel, add "way" to the end of the word.</li>
	 * <li>if the word begins with consonants, move the leading consonants to the
	 * end of the word and add "ay" to the end of that. "y" is treated as a
	 * consonant if it is the first character in the word, and as a vowel for
	 * anywhere else in the word.</li>
	 * </ul>
	 * Preserve the case of the word - i.e. if the first character of word is
	 * upper-case, then the new first character should also be upper case.
	 *
	 * @param word the string to convert to Pig Latin
	 * @return the Pig Latin version of word
	 */
	public static String pigLatin(String word) {
		if (word == null || word.isEmpty()) {
			return word;
		}

		String vowels = "aeiouAEIOU";
		String lowerWord = word.toLowerCase();

		int firstVowelIndex = -1;

		// Special rule: 'y' counts as vowel except when it's the first character
		for (int i = 0; i < lowerWord.length(); i++) {
			char c = lowerWord.charAt(i);
			if (vowels.indexOf(c) != -1 || (c == 'y' && i != 0)) {
				firstVowelIndex = i;
				break;
			}
		}

		String pigLatinWord;

		// Case 1: starts with a vowel → add "way"
		if (firstVowelIndex == 0) {
			pigLatinWord = word + "way";
		}
		// Case 2: no vowel found → just add "ay"
		else if (firstVowelIndex == -1) {
			pigLatinWord = word + "ay";
		}
		// Case 3: starts with consonants → move them to end and add "ay"
		else {
			String prefix = lowerWord.substring(0, firstVowelIndex);
			String rest = lowerWord.substring(firstVowelIndex);
			pigLatinWord = rest + prefix + "ay";
		}

		// Preserve capitalization of the original first letter
		if (Character.isUpperCase(word.charAt(0))) {
			pigLatinWord = pigLatinWord.substring(0, 1).toUpperCase() + pigLatinWord.substring(1).toLowerCase();
		}

		return pigLatinWord;
	}
}
