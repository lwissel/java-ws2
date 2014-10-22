import static org.junit.Assert.*;

import org.junit.Test;


public class Ex4MyTest {
	
	/*
	 * only 2 words
	 */
	@Test
	public void ex4Test1() {
		String[] input = { "Java", "the" };
		String[] expected = { "the", "Java" };

		System.out.println("Ex4 Public Test 1");
		String[] result = Ex4.bubbleSort(input);
		assertArrayEquals("Arrays do not match", expected, result);


	}

	/**
	 * only 1 word
	 */
	@Test
	public void ex4Test2() {
		String[] input = { "test" };
		String[] expected = { "test" };

		System.out.println("Ex4 Public Test 2");
		String[] result = Ex4.bubbleSort(input);
		assertArrayEquals("Arrays do not match", expected, result);


	}

	/**
	 * 3 times the same word
	 */
	@Test
	public void ex4Test3() {
		String[] input = { "test", "test", "test" };
		String[] expected = { "test", "test", "test" };

		System.out.println("Ex4 Public Test 3");
		String[] result = Ex4.bubbleSort(input);
		assertArrayEquals("Arrays do not match", expected, result);
	}


	/**
	 * a - b - a  test
	 */
	@Test
	public void ex4Test4() {
		String[] input = { "test", "hi", "test" };
		String[] expected = { "hi", "test", "test" };

		System.out.println("Ex4 Public Test 4");
		String[] result = Ex4.bubbleSort(input);
		assertArrayEquals("Arrays do not match", expected, result);
	}


	/**
	 * test characters
	 */
	@Test
	public void ex4Test5() {
		String[] input = { "a", "b", "c", "d" };
		String[] expected = { "a", "b", "c", "d" };

		System.out.println("Ex4 Public Test 5");
		String[] result = Ex4.bubbleSort(input);
		assertArrayEquals("Arrays do not match", expected, result);
	}

	/**
	 * test 2 double redundant
	 */
	@Test
	public void ex4Test6() {
		String[] input = { "a", "cc", "a", "cc" };
		String[] expected = { "a", "a", "cc", "cc" };

		System.out.println("Ex4 Public Test 6");
		String[] result = Ex4.bubbleSort(input);
		assertArrayEquals("Arrays do not match", expected, result);
	}
}
