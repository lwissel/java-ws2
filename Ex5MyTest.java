import static org.junit.Assert.*;

import org.junit.Test;

public class Ex5MyTest {

	/**
	 * Example must fail (0,1) changed to 1
	 */
	@Test
	public void ex5Test1() {
		int[][] input = { { 1, 1, 3, 4, 5, 6, 7, 8, 9 },
				{ 4, 5, 6, 7, 8, 9, 1, 2, 3 }, { 7, 8, 9, 1, 2, 3, 4, 5, 6 },
				{ 2, 3, 4, 5, 6, 7, 8, 9, 1 }, { 5, 6, 7, 8, 9, 1, 2, 3, 4 },
				{ 8, 9, 1, 2, 3, 4, 5, 6, 7 }, { 3, 4, 5, 6, 7, 8, 9, 1, 2 },
				{ 6, 7, 8, 9, 1, 2, 3, 4, 5 }, { 9, 1, 2, 3, 4, 5, 6, 7, 8 } };
		boolean[][] expected = {
				{ false, true, true, true, true, true, true, true, true },
				{ true, false, true, true, true, true, true, true, true },
				{ false, true, true, true, true, true, true, true, true } };
		System.out.println("Ex5 Public Test 1");
		boolean[][] result = Ex5.checkSudoku(input);
		if (expected.length != result.length) {
			fail("Array lengths do not match");
		}
		for (int i = 0; i < result.length; i++) {
			if (expected[i].length != result[i].length) {
				fail("Array lengths do not match");
			}
		}
		for (int i = 0; i < expected.length; i++) {

			for (int j = 0; j < expected[i].length; j++) {
				if (expected[i][j]) {
					assertTrue(result[i][j]);
				} else {
					assertFalse(result[i][j]);

				}
			}
		}

	}

	/**
   * Zeros should return false
	 */
	@Test
	public void ex5Test2() {
		int[][] input = { { 1, 2, 0, 4, 0, 6, 7, 0, 9 },
				{ 4, 0, 0, 7, 8, 9, 1, 2, 3 }, { 7, 8, 9, 1, 2, 3, 0, 5, 6 },
				{ 0, 3, 4, 0, 6, 7, 0, 0, 0 }, { 5, 6, 0, 8, 0, 1, 2, 3, 4 },
				{ 8, 9, 1, 2, 0, 4, 5, 6, 7 }, { 0, 4, 5, 0, 0, 8, 9, 0, 2 },
				{ 0, 7, 0, 9, 1, 0, 3, 4, 0 }, { 9, 0, 2, 3, 4, 0, 6, 7, 0 } };
		boolean[][] expected = {
				{ false, false, false, false, false, false, false, false, false },
				{ false, false, false, false, false, false, false, false, false },
				{ false, false, false, false, false, false, false, false, false } };
		System.out.println("Ex5 Public Test 2");

		boolean[][] result = Ex5.checkSudoku(input);
		if (expected.length != result.length) {
			fail("Array lengths do not match");
		}
		for (int i = 0; i < result.length; i++) {
			if (expected[i].length != result[i].length) {
				fail("Array lengths do not match");
			}
		}
		for (int i = 0; i < expected.length; i++) {

			for (int j = 0; j < expected[i].length; j++) {
				if (expected[i][j]) {
					assertTrue(result[i][j]);
				} else {
					assertFalse(result[i][j]);

				}
			}
		}

	}

	/**
	 * Error in very last position
	 */
	@Test
	public void ex5Test3() {
		int[][] input = { { 1, 2, 3, 4, 5, 6, 7, 8, 9 },
				{ 4, 5, 6, 7, 8, 9, 1, 2, 3 }, { 7, 8, 9, 1, 2, 3, 4, 5, 6 },
				{ 1, 3, 4, 5, 6, 7, 8, 9, 1 }, { 5, 6, 7, 8, 9, 1, 2, 3, 4 },
				{ 8, 9, 3, 2, 3, 4, 5, 6, 7 }, { 3, 4, 5, 6, 7, 8, 8, 1, 2 },
				{ 6, 7, 8, 9, 1, 2, 3, 4, 5 }, { 9, 1, 2, 3, 2, 5, 6, 7, 1 } };

		boolean[][] expected = {
				{ true, true, true, false, true, false, false, true, false },
				{ false, true, false, true, false, true, false, true, false},
				{ true, true, true, false, true, true, true, false, false } };

		System.out.println("Ex5 Public Test 3");

		boolean[][] result = Ex5.checkSudoku(input);
		if (expected.length != result.length) {
			fail("Array lengths do not match");
		}
		for (int i = 0; i < result.length; i++) {
			if (expected[i].length != result[i].length) {
				fail("Array lengths do not match");
			}
		}
		for (int i = 0; i < expected.length; i++) {

			for (int j = 0; j < expected[i].length; j++) {
				if (expected[i][j]) {
					assertTrue(result[i][j]);
				} else {
					assertFalse(result[i][j]);

				}
			}
		}

	}

	/**
	 * first row contains zeros
	 */
	@Test
	public void ex5Test4() {
		int[][] input = { { 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 4, 5, 6, 7, 8, 9, 1, 2, 3 }, { 7, 8, 9, 1, 2, 3, 4, 5, 6 },
				{ 1, 3, 4, 5, 6, 7, 8, 9, 1 }, { 5, 6, 7, 8, 9, 1, 2, 3, 4 },
				{ 8, 9, 3, 2, 3, 4, 5, 6, 7 }, { 3, 4, 5, 6, 7, 8, 8, 1, 2 },
				{ 6, 7, 8, 9, 1, 2, 3, 4, 5 }, { 9, 1, 2, 3, 2, 5, 6, 7, 1 } };

		boolean[][] expected = {
				{ false, true, true, false, true, false, false, true, false },
				{ false, false, false, false, false, false, false, false, false },
				{ false, false, false, false, true, true, true, false, false } };

		System.out.println("Ex5 Public Test 4");

		boolean[][] result = Ex5.checkSudoku(input);
		if (expected.length != result.length) {
			fail("Array lengths do not match");
		}
		for (int i = 0; i < result.length; i++) {
			if (expected[i].length != result[i].length) {
				fail("Array lengths do not match");
			}
		}
		for (int i = 0; i < expected.length; i++) {

			for (int j = 0; j < expected[i].length; j++) {
				if (expected[i][j]) {
					assertTrue(result[i][j]);
				} else {
					assertFalse(result[i][j]);

				}
			}
		}

	}


	/**
	 * first col contains zeros
	 */
	@Test
	public void ex5Test5() {
		int[][] input = { { 0, 2, 3, 4, 5, 6, 7, 8, 9 },
				{ 0, 5, 6, 7, 8, 9, 1, 2, 3 }, { 7, 8, 9, 1, 2, 3, 4, 5, 6 },
				{ 0, 3, 4, 5, 6, 7, 8, 9, 1 }, { 5, 6, 7, 8, 9, 1, 2, 3, 4 },
				{ 0, 9, 3, 2, 3, 4, 5, 6, 7 }, { 3, 4, 5, 6, 7, 8, 8, 1, 2 },
				{ 0, 7, 8, 9, 1, 2, 3, 4, 5 }, { 9, 1, 2, 3, 2, 5, 6, 7, 1 } };

		boolean[][] expected = {
				{ false, false, true, false, true, false, false, false, false },
				{ false, true, false, true, false, true, false, true, false },
				{ false, true, true, false, true, true, false, false, false } };

		System.out.println("Ex5 Public Test 5");

		boolean[][] result = Ex5.checkSudoku(input);
		if (expected.length != result.length) {
			fail("Array lengths do not match");
		}
		for (int i = 0; i < result.length; i++) {
			if (expected[i].length != result[i].length) {
				fail("Array lengths do not match");
			}
		}
		for (int i = 0; i < expected.length; i++) {

			for (int j = 0; j < expected[i].length; j++) {
				if (expected[i][j]) {
					assertTrue(result[i][j]);
				} else {
					assertFalse(result[i][j]);

				}
			}
		}

	}
}
