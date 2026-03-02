package org.java.se;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ValidateISBNTest {

	@Test
	public void checkValidISBN()
	{
		// First case!
		ValidateISBN validator = new ValidateISBN();
		boolean result = validator.checkISBN("0140449116");
		assertTrue( result, "First value:");
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

}

