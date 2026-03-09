package org.java.se;

public class ValidateISBN {

	private static final int LONG_ISBN_MULTIPLIER = 10;
	private static final int SHORT_ISBN_MULTIPLIER = 11;
	private static final int SHORT_ISBN_LENGTH = 10;
	private static final int LONG_ISBN_LENGTH = 13;

	public static boolean containsAlphabet(String str) {
		return str.matches(".*[a-zA-Z].*");
	}

	public boolean checkISBN(String isbn) {

		if (isbn == null | isbn.length() < 10)
		{
			throw new NumberFormatException();
		}

		int total = 0;
		// The adding of the numbers together, sum.
		for (int i = 0; i < 10; i++)
		{
			if (containsAlphabet(isbn))
			{
				throw new NumberFormatException("ISBN numbers does not contain alphabet's!");
			}


			total += isbn.charAt(i) * (10 - i);
		}

		//  The modules operation
		if (total % 11 == 0)
		{
			return true;
		}
		else{
			return false;
		}

	}

	private boolean isThisAValidShortISBN(String isbn) {
		int total = 0;

		for (int i = 0; i < SHORT_ISBN_LENGTH; i++)
		{
			if (!Character.isDigit(isbn.charAt(i))) {
				if (i ==9 && isbn.charAt(i) == 'X') {
					total += 10;
				}
				else {
					throw new NumberFormatException("ISBN numbers can only contain numeric digits");
				}
			}
			else {
				total += Character.getNumericValue(isbn.charAt(i)) * (SHORT_ISBN_LENGTH -i);
			}
		}

		return (total % SHORT_ISBN_MULTIPLIER == 0);
	}

	private boolean isThisAValidLongISBN(String isbn) {
		int total = 0;
		
		for (int i = 0; i < LONG_ISBN_LENGTH; i++) {
			if (i % 2 == 0) {
				total += Character.getNumericValue(isbn.charAt(i));
			}
			else {
				total += Character.getNumericValue(isbn.charAt(i)) * 3;
			}
		}
		return (total % LONG_ISBN_MULTIPLIER == 0);
	}
}
