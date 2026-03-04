# Section 04: Practicing the basics. 

Practicing the basics.

# What I Learned.

# Testing for exceptions - and challenge number 1.

<p align="center">
    <img src="Practicing_The_Basics.PNG" style="width:520px;height:290px;" alt="tdd course">
</p>

1. We will be going thought the making *ISBN* validator better!

- First scenario is to write that *ISBN* needs to be at least 10 digits long!

- First we will be writing failing test.

````Java 
	@Test
	public void checkIsIfISBNis10digitsLong()
	{
		fail();
	}

````

<p align="center">
    <img src="Practicing_The_Basics.PNG" style="width:520px;height:290px;" alt="tdd course">
</p>

1. We get the failing test!

- We have **two** ways to **throw** exception (JUnit 5 way):
    - The **old** way, which should **not** be used!
    ````Java
    @Test
    public void testException() {
        try {
            service.process(null);
            fail("Exception expected");
        } catch (IllegalArgumentException e) {
            assertEquals("Input cannot be null", e.getMessage());
        }
    }
    ````
    - Or capturing the exception!

    ````Java
        @Test
        void testExceptionMessage() {
        IllegalArgumentException ex =
            assertThrows(IllegalArgumentException.class,
                        () -> service.process(null));
            assertEquals("Input cannot be null", ex.getMessage());
        }    
    ````
    - Or just asserting the exception!
    ```Java
        @Test
        void testException() {
            assertThrows(IllegalArgumentException.class, () -> {
                service.process(null);
            });
        }
    ````

- We are going to use the `NumberFormatException`
    ````Yml
    Thrown to indicate that the application has attempted to convert a string to one of the numeric types, but that the string does not have the appropriate format.
    ````

- Our test:

````
@Test
	public void checkIsIfISBNis10digitsLong()
	{
		ValidateISBN validator = new ValidateISBN();

		assertThrows(NumberFormatException.class, () -> {
			boolean result = validator.checkISBN("123456789"); // Definitely 9 digits long!
		});
	}
````

- My service class:

````Java

	public boolean checkISBN(String isbn) {

		if (isbn == null | isbn.length() < 10)
		{
			throw new NumberFormatException();
		}

		int total = 0;
		// The adding of the numbers together, sum.
		for (int i = 0; i < 10; i++)
		{
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
````

- We can see **green** bar.

<p align="center">
    <img src="Exception_Throwing_Test.PNG" style="width:520px;height:290px;" alt="tdd course">
</p>

1. Green bar!

- Last step is **refactoring** step, there is no need for refactor!


<p align="center">
    <img src="Writing_Other_Scenario_Practice.PNG" style="width:520px;height:290px;" alt="tdd course">
</p>

1. We are following test, this needs give `Format Exception` when `string` is inputted! My example below:



# Challenge 2 - writing a test.

- My example:

````Java
@Test
	public void checkIfISBNContainsAlphabetic()
	{
		fail();
	}
````

````Java
    public static boolean isAlphabet(String str) {
        return str.matches("[a-zA-Z]+");
    }
````

- Instructors example:



# Solution to challenge 2.

# Getting to more complex requirements and finding hidden requirements.

# Challenge 3 - Adding further business requirements.