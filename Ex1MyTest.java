import static org.junit.Assert.*;

import org.junit.Test;


public class Ex1MyTest {

	/**
	 * MSc pass new values
	 */
	@Test
	public void ex1Test1() {
		System.out.println("Ex1 Public Test 1 - Pass: 45,45,60,10,MSc");
		Boolean result = Ex1.hasPassed(55, 65, 60, 50, "MSc");
		assertTrue(result);

	}

	/**
	 * MSc Fail if it is even closer
	 */
	@Test
	public void ex1Test2() {

		System.out.println("Ex1 Public Test 2 - Fail: 30,40,10,50,MSc");
		boolean result = Ex1.hasPassed(30, 40, 10, 50, "MSc");
		assertFalse(result);
	}

	/**
	 * MSc Fail if it is 0
	 */
	@Test
	public void ex1Test3() {

		System.out.println("Ex1 Public Test 3 - Fail: 0,0,0,0,MSc");
		boolean result = Ex1.hasPassed(0, 0, 0, 0, "MSc");
		assertFalse(result);
	}

	/**
	 * MSc works for 100
	 */
	@Test
	public void ex1Test4() {

		System.out.println("Ex1 Public Test 4 - Pass: 100,100,100,100,MSc");
		boolean result = Ex1.hasPassed(100, 100, 100, 100, "MSc");
		assertTrue(result);
	}

	/**
	 * MSc Fail in lower case as well
	 */
	@Test
	public void ex1Test5() {

		System.out.println("Ex1 Public Test 5 - Fail: 10,10,10,10,MSc");
		boolean result = Ex1.hasPassed(10, 10, 10, 10, "msc");
		assertFalse(result);
	}

  /**
	 * doing well in ex failing group just failed teamwork and failed the exam closely.
	 */
	@Test
	public void ex1Test6() {

		System.out.println("Ex1 Public Test 6 - Fail: 90,90,45,0,MSc");
		boolean result = Ex1.hasPassed(90, 90, 45, 0, "MSc");
		assertFalse(result);
	}

}
