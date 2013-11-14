package kata.fizzbuzz;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {

	private FizzBuzz fizzBuzz;

	@Before
	public void before() {
		this.fizzBuzz = new FizzBuzz();
	}

	@Test
	public void fizzBuzzNotNull() {
		assertNotNull(fizzBuzz);
	}

	@Test
	public void testFizzBuzz() {
		assertArrayEquals(new String[0], fizzBuzz.getArrayAnswer(0));
		assertArrayEquals(new String[] { "1" }, fizzBuzz.getArrayAnswer(1));
		assertArrayEquals(new String[] { "1", "2" }, fizzBuzz.getArrayAnswer(2));
		assertArrayEquals(new String[] { "1", "2", "Fizz" },
				fizzBuzz.getArrayAnswer(3));
		assertArrayEquals(new String[] { "1", "2", "Fizz", "4" },
				fizzBuzz.getArrayAnswer(4));
	}

}
