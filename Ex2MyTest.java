import static org.junit.Assert.*;

import org.junit.Test;


public class Ex2MyTest {

	/**
	 * Token appears twice
	 */
	@Test
	public void ex2Test1() {
		String[] stringArray = { "the", "the", "the", "cat", "sat", "on", "the", "mat" };
		String token = "the";
		int expected = 4;
		System.out.println("Ex2 Public Test 1");
		int result = Ex2.countOccurences(token, stringArray);
		assertEquals(expected, result);

	}

	/**
	 * Token appear in substring only
	 */
	@Test
	public void ex2Test2() {
		String[] stringArray = { "the", "cat", "saturday", "on", "the", "mat" };
		String token = "sat";
		int expected = 0;
		System.out.println("Ex2 Public Test 2");

		int result = Ex2.countOccurences(token, stringArray);
		assertEquals(expected, result);

	}

	/**
	 * array is empty string
	 */
	@Test
	public void ex2Test3() {
		String[] stringArray = { "" };
		String token = "dog";
		int expected = 0;
		System.out.println("Ex2 Public Test 3");

		int result = Ex2.countOccurences(token, stringArray);
		assertEquals(expected, result);

	}

	/**
	 * array is whitespace string
	 */
	@Test
	public void ex2Test4() {
		String[] stringArray = { " " };
		String token = " ";
		int expected = 1;
		System.out.println("Ex2 Public Test 4");

		int result = Ex2.countOccurences(token, stringArray);
		assertEquals(expected, result);
	}

	/**
	 * array is empty
	 */
	@Test
	public void ex2Test5() {
		String[] stringArray = { };
		String token = "test";
		int expected = 0;
		System.out.println("Ex2 Public Test 5");

		int result = Ex2.countOccurences(token, stringArray);
		assertEquals(expected, result);
	}

	/**
	 * array has numbers
	 */
	@Test
	public void ex2Test6() {
		String[] stringArray = { "1", "23", "4" };
		String token = "3";
		int expected = 0;
		System.out.println("Ex2 Public Test 6");

		int result = Ex2.countOccurences(token, stringArray);
		assertEquals(expected, result);
	}
}
