# Section 03: First tests. 

First tests.

# What I Learned.

# Thinking about examples and outcomes.

<p align="center">
    <img src="Our_First_Tests.PNG" style="width:520px;height:290px;" alt="tdd course">
</p>

1. We will be writing our **first tests**, before code!

- ISBN can be 10 digits and 13 digits long. This can be seen from [ISBN](https://en.wikipedia.org/wiki/ISBN).

- We are looking the [example](https://www.amazon.com/Odyssey-Penguin-Classics-Homer/dp/0140449116).

<p align="center">
    <img src="ISBN_Numbers_From_Amazon.PNG" style="width:520px;height:290px;" alt="tdd course">
</p>

1. One can see the **ISBN-13 number** and **ISBN-10 number**.
    - `ISBN-10: 0140449116`.
    - `ISBN-13: 978-0140449112`.

- Why we would choose this test case, when writing test?

<p align="center">
    <img src="Rules_Of_TDD.PNG" style="width:520px;height:290px;" alt="tdd course">
</p>

1. When we write **test**, we expect certain outcome! Not architecture, logic etc.
    - Think about outcome, not how it should work in detail!
        - Our case is that is this valid ISBN?

# Step 1 - getting to red.

- We will start from the `checkValidISBN()`.
    - Remember this test needs to fail at **first!**

````Java
    @Test
	public void checkValidISBN()
	{
		fail();
	}
````

> [!IMPORTANT]
> Always start with **failing test**, in **TDD**!

- Remember we will follow, the **TDD pattern**:
    - Red.
    - Green.
    - Refactor.

- Next, we will be