import static org.junit.Assert.*;

import org.junit.Test;


public class Ex2Test {

	/**
	 * Token appears twice
	 */
	@Test
	public void ex2Test1() {
		String[] stringArray = { "the", "cat", "sat", "on", "the", "mat" };
		String token = "the";
		int expected = 2;
		System.out.println("Ex2 Public Test 1");
		int result = Ex2.countOccurences(token, stringArray);
		assertEquals(expected, result);

	}

	/**
	 * Token appear once
	 */
	@Test
	public void ex2Test2() {
		String[] stringArray = { "the", "cat", "sat", "on", "the", "mat" };
		String token = "sat";
		int expected = 1;
		System.out.println("Ex2 Public Test 2");

		int result = Ex2.countOccurences(token, stringArray);
		assertEquals(expected, result);

	}

	/**
	 * Token not in array
	 */
	@Test
	public void ex2Test3() {
		String[] stringArray = { "the", "cat", "sat", "on", "the", "mat" };
		String token = "dog";
		int expected = 0;
		System.out.println("Ex2 Public Test 3");

		int result = Ex2.countOccurences(token, stringArray);
		assertEquals(expected, result);

	}

}
