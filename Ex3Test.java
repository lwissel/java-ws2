import static org.junit.Assert.*;

import org.junit.Test;


public class Ex3Test {

	/*
	 * Small value
	 */
	@Test
	public void ex3Test1() {
		int input = 50;
		boolean[] expected = { false, false, true, true, false, true, false,
				true, false, false, false, true, false, true, false, false,
				false, true, false, true, false, false, false, true, false,
				false, false, false, false, true, false, true, false, false,
				false, false, false, true, false, false, false, true, false,
				true, false, false, false, true, false, false };

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
	 * Minimal value
	 */
	@Test
	public void ex3Test2() {
		int test = 12;
		int input = 2;
		boolean[] expected = { false, false };

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


}
