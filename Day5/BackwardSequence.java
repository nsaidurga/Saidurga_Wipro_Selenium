/*
 1. Reverse CharSequence: Custom BackwardSequence
•	Create a class BackwardSequence that implements java.lang.CharSequence.
•	Internally store a String and implement all required methods: length(), charAt(), subSequence(), and toString().
•	The sequence should be the reverse of the stored string (e.g., new BackwardSequence("hello") yields "olleh").
•	Write a main() method to test each method.
 */
package Day5;

public class BackwardSequence implements CharSequence {
	private final String original;
	private final String reversed;

	public BackwardSequence(String input) {
		this.original = input;
		this.reversed = new StringBuilder(input).reverse().toString();
	}

	@Override
	public int length() {
		return reversed.length();
	}

	@Override
	public char charAt(int index) {
		if (index < 0 || index >= reversed.length()) {
			throw new IndexOutOfBoundsException("Index: " + index);
		}
		return reversed.charAt(index);
	}

	@Override
	public CharSequence subSequence(int start, int end) {
		if (start < 0 || end > reversed.length() || start > end) {
			throw new IndexOutOfBoundsException("Invalid subsequence range.");
		}
		return reversed.substring(start, end);
	}

	@Override
	public String toString() {
		return reversed;
	}

	public static void main(String[] args) {
		BackwardSequence bs = new BackwardSequence("hello");

		System.out.println("Original: hello");
		System.out.println("BackwardSequence: " + bs);
		System.out.println("Length: " + bs.length());
		System.out.println("charAt(1): " + bs.charAt(1));
		System.out.println("subSequence(1, 4): " + bs.subSequence(1, 4));
	}
}

/*
output:

Original: hello
BackwardSequence: olleh
Length: 5
charAt(1): l
subSequence(1, 4): lle

*/