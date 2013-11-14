package kata.fizzbuzz;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

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
		assertArrayEquals(new String[]{"1"}, fizzBuzz.getArrayAnswer(1));
		assertArrayEquals(new String[]{"1","2"}, fizzBuzz.getArrayAnswer(2));
	}
	
}
