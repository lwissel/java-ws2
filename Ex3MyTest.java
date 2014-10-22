import static org.junit.Assert.*;

import org.junit.Test;


public class Ex3MyTest {

	/*
	 * border case 3 elements
	 */
	@Test
	public void ex3Test1() {
		int input = 3;
		boolean[] expected = { false, false, true };

		System.out.println("Ex3 Public Test 1");
		boolean[] result = Ex3.sieve(input);
		if (expected.length != result.length) {
			fail("Array lengths do not match");
		}
		for (int i = 0; i < expected.length; i++) {
			if (expected[i]) {
				assertTrue(result[i]);
			} else {
				assertFalse(result[i]);

			}
		}

	}

	/**
	 *  test for 4
	 */
	@Test
	public void ex3Test2() {
		int input = 4;
		boolean[] expected = { false, false, true, true };

		System.out.println("Ex3 Public Test 2");
		boolean[] result = Ex3.sieve(input);
		if (expected.length != result.length) {
			fail("Array lengths do not match");
		}
		for (int i = 0; i < expected.length; i++) {
			if (expected[i]) {
				assertTrue(result[i]);
			} else {
				assertFalse(result[i]);

			}
		}
  }

	/**
	 * test for 7
	 */
	@Test
	public void ex3Test3() {
		int input = 7;
		boolean[] expected = { false, false, true, true, false, true, false };

		System.out.println("Ex3 Public Test 3");
		boolean[] result = Ex3.sieve(input);
		if (expected.length != result.length) {
			fail("Array lengths do not match");
		}
		for (int i = 0; i < expected.length; i++) {
			if (expected[i]) {
				assertTrue(result[i]);
			} else {
				assertFalse(result[i]);
			}
		}
	}


	/**
	 * Minimal value 1
	 */
	@Test
	public void ex3Test4() {
		int input = 1;
		boolean[] expected = { false };

		System.out.println("Ex3 Public Test 4");
		boolean[] result = Ex3.sieve(input);
		if (expected.length != result.length) {
			fail("Array lengths do not match");
		}
		for (int i = 0; i < expected.length; i++) {
			if (expected[i]) {
				assertTrue(result[i]);
			} else {
				assertFalse(result[i]);

			}
		}
  }

	/**
	 * Minimal value 0
	 */
	@Test
	public void ex3Test5() {
		int input = 0;
		boolean[] expected = { };

		System.out.println("Ex3 Public Test 5");
		boolean[] result = Ex3.sieve(input);
		if (expected.length != result.length) {
			fail("Array lengths do not match");
		}
		for (int i = 0; i < expected.length; i++) {
			if (expected[i]) {
				assertTrue(result[i]);
			} else {
				assertFalse(result[i]);

			}
		}
  }  

	/**
	 * test for exercise example
	 */
	@Test
	public void ex3Test6() {
		int input = 14;
		boolean[] expected = { false, false, true, true, false, true, false, true, false, false, false, true, false, true };

		System.out.println("Ex3 Public Test 6");
		boolean[] result = Ex3.sieve(input);
		if (expected.length != result.length) {
			fail("Array lengths do not match");
		}
		for (int i = 0; i < expected.length; i++) {
			if (expected[i]) {
				assertTrue(result[i]);
			} else {
				assertFalse(result[i]);

			}
		}
  }
}
