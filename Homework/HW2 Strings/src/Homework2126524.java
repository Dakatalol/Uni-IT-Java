/**
 * @author Jordan Iliev - 126524
 *
 */
public class Homework2126524 {
	public static final String EXCEPTION_MESSAGE = "String doesn't contain only numbers!";

	/**
	 * A method that sums two numbers represented as strings
	 * 
	 * @param a
	 *            the first string of digits
	 * @param b
	 *            the second string of digits
	 * @return the sum of two the numbers
	 * @throws Exception
	 *             when there's a string which contains something else than a
	 *             number
	 */
	public String add(String a, String b) throws Exception {
		
		// Precondition check if there are strings with only numbers
		if (!a.matches("[0-9]+") || !b.matches("[0-9]+")) {
			throw new Exception(EXCEPTION_MESSAGE);
		}
		
		String reversedA = new StringBuilder(a).reverse().toString(); // reversing a
		String reversedB = new StringBuilder(b).reverse().toString(); // reversing b
		StringBuilder sum = new StringBuilder();
		int length = Math.max(a.length(), b.length());
		int carryVal = 0; // initializing the carry value

		// adding digits from both strings, if there are digits left in
		// them.If there are not any digits left in one of the strings we are
		// adding 0. After that we are adding the current carry value
		for (int i = 0; i < length; i++) {
			int digit = (i < a.length() ? Integer.parseInt(String
					.valueOf(reversedA.charAt(i))) : 0)
					+ (i < b.length() ? Integer.parseInt(String
							.valueOf(reversedB.charAt(i))) : 0) + carryVal;
			carryVal = digit / 10; // getting the current carry value
			sum.append(digit % 10); // adding the digit without the carry
			// value.
		}
		if (carryVal == 1){ // if there is a carry value
			
			sum.append(1); // we are adding it
		}
		String result = new StringBuilder(sum).reverse().toString(); // getting the result
		
		return result;
	}

	/**
	 * A method that generates a password represented as a String
	 * 
	 * @param n length of the string
	 *            
	 * @return randomly generated string with uppercase, lowercase letter and a
	 *         number.
	 */
	public String generateString(int n) {

		int smallcount = (int) (Math.random() * (n - 2)) + 1; // generating lower case letters
		int bigcount = (int) (Math.random() * (n - smallcount - 1) + 1); // generating upper case letters
		int numberscount = n - (smallcount + bigcount); // generating numbers count
	

		StringBuilder result = new StringBuilder();

		// building small letters
		for (int i = 0; i < smallcount; i++) {
			int start = 97;
			int currentRandom = (int) (Math.random() * 26) + start;
			char c = (char) currentRandom;
			result = result.append(c);
		}

		// building big letters
		for (int i = 0; i < bigcount; i++) {
			int start = 65;
			int currentRandom = (int) (Math.random() * 25) + start;
			char c = (char) currentRandom;
			result = result.append(c);
		}

		// building numbers
		for (int i = 0; i < numberscount; i++) {
			int start = 48;
			int currentRandom = (int) (Math.random() * 9) + start;
			char c = (char) currentRandom;
			result = result.append(c);
		}

		// shuffle the letters
		String shuffle = "";
		int indexes = n;
		for (int i = 0; i < n; i++) {
			int selected = (int) (Math.random() * indexes);
			shuffle += result.charAt(selected);
			result.deleteCharAt(selected);
			indexes--;
		}
		return shuffle;
	}
}
