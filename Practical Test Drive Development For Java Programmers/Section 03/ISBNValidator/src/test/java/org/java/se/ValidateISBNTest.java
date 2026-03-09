package org.java.se;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

class ValidateISBNTest {

	@Test
	public void checkValidISBN()
	{
		// First case!
		ValidateISBN validator = new ValidateISBN();
		boolean result = validator.checkISBN("0140449116");
		assertTrue( result, "F0irst value:");
		// Second case!
		result = validator.checkISBN("0140177396");
		assertTrue(result, "Second value:");
	}

	@Test
	public void checkInvalidISBN()
	{
		ValidateISBN validator = new ValidateISBN();
		boolean result = validator.checkISBN("0140449117");
		assertFalse(result);
	}

	@Test
	public void checkIsIfISBNisAtLeast10digitsLong()
	{
		ValidateISBN validator = new ValidateISBN();
		assertThrows(NumberFormatException.class, () -> {
			boolean result = validator.checkISBN("123456789"); // Definitely 9 digits long!
		});
	}

	// Junit 5 version.
	@Test
	public void checkIfISBNContainsAlphabetic()
	{
		ValidateISBN validator = new ValidateISBN();

		assertThrows(NumberFormatException.class, () -> {
			boolean result = validator.checkISBN("12345678910eeee"); // Definitely 9 digits long!
		});
	}

}





