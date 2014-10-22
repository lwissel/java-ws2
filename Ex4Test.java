import static org.junit.Assert.*;

import org.junit.Test;


public class Ex4Test {
	
	/*
	 * Example case
	 */
	@Test
	public void ex4Test1() {
		String[] input = { "Java", "the", "array", "a", "softwareWorkshop",
				"to" };
		String[] expected = { "a", "to", "the", "Java", "array",
				"softwareWorkshop" };

		System.out.println("Ex4 Public Test 1");
		String[] result = Ex4.bubbleSort(input);
		assertArrayEquals("Arrays do not match", expected, result);


	}

	/**
	 * Empty case
	 */
	@Test
	public void ex4Test2() {
		String[] input = {};
		String[] expected = {};

		System.out.println("Ex4 Public Test 2");
		String[] result = Ex4.bubbleSort(input);
		assertArrayEquals("Arrays do not match", expected, result);


	}

}
