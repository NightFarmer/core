package junit3;

import junit.framework.TestCase;

/**
 * <p>²âÊÔÓÃÀý/p>
 */
public class TestSample extends TestCase {
	public void testAdd() {
		SampleCalculator calculator = new SampleCalculator();
		int result = calculator.add(50, 20);
		assertEquals(70, result);
	}

	public void testSubtration() {
		SampleCalculator calculator = new SampleCalculator();
		int result = calculator.subtration(50, 20);
		assertEquals(30, result);
	}
}