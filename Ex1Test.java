import static org.junit.Assert.*;

import org.junit.Test;


public class Ex1Test {

	/**
	 * MSc pass
	 */
	@Test
	public void ex1Test1() {
		System.out.println("Ex1 Public Test 1 - Pass: 45,45,60,10,MSc");
		Boolean result = Ex1.hasPassed(45, 45, 60, 50, "MSc");
		assertTrue(result);

	}

	/**
	 * MSc Fail
	 */
	@Test
	public void ex1Test2() {

		System.out.println("Ex1 Public Test 2 - Fail: 10,10,10,10,MSc");
		boolean result = Ex1.hasPassed(10, 10, 10, 10, "MSc");
		assertFalse(result);
	}

	/**
	 * Border case
	 */
	@Test
	public void ex1Test3() {

		System.out.println("Ex1 Public Test 3 - Borderline ICY: 40,40,40,40,ICY");
		boolean result = Ex1.hasPassed(40, 40, 40, 40, "ICY");
		assertTrue (result);

	}
}
