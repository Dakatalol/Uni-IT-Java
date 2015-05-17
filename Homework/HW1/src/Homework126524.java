import java.math.BigInteger;

/**
 * @author Jordan Iliev - 126524
 *
 */
public class Homework126524 {

	/**
	 * Finds and returns the greatest common divisor from two numbers.
	 * 
	 * @param a
	 *            the first number to work with
	 * @param b
	 *            the second number working with
	 * @return the greatest common divisor from two numbers
	 */

	public int gcd(int a, int b) {

		return BigInteger.valueOf(a).gcd(BigInteger.valueOf(b)).intValue();
	}

	/**
	 * Finds and returns the minimal element from an array of ints.
	 * 
	 * @param array
	 *            the array that contains the elements required for the search
	 * @return the minimal element from the array of elements
	 * @throws NegativeArraySizeException
	 *             Thrown if an application tries to create an array with
	 *             negative size.
	 */

	public int getMinElement(int[] array) {
		if (array.length <= 0) {
			throw new NegativeArraySizeException();
		}

		int minElement = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < minElement) {
				minElement = array[i];
			}
		}
		return minElement;
	}

	/**
	 * The summation of numbers from array
	 * 
	 * @param array
	 *            the array that contains the numbers
	 * @return the summation from the array
	 * @throws NegativeArraySizeException
	 *             Thrown if an application tries to create an array with
	 *             negative size.
	 */

	public static int getSum(int[] array) {
		if (array.length <= 0) {
			throw new NegativeArraySizeException();
		}

		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}

		return sum;
	}

	/**
	 * 
	 * @param array
	 *            the array that contains the numbers
	 * @return returning the elements of the array in a format[el1, el2, el3]
	 * @throws NegativeArraySizeException
	 *             Thrown if an application tries to create an array with
	 *             negative size.
	 */

	public String printArray(int[] array) {
		if (array.length <= 0) {
			throw new NegativeArraySizeException();
		}

		StringBuilder line = new StringBuilder();
		line.append('[');
		for (int i = 0; i < array.length - 1; i++) {
			line.append(array[i]);
			line.append(',');
		}
		line.append(array[array.length - 1]);
		line.append(']');
		return line.toString();
	}


}
