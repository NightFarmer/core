package junit4;

import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.either;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.sameInstance;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

//@RunWith(TestClassRunner.class)
public class SampleCalculatorTest {

	private static SampleCalculator calculator = new SampleCalculator();

	@Before
	public void setUp() throws Exception {
		calculator.clear();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test(timeout = 1000)
	public void testAdd() {
		calculator.add(2);
		calculator.add(3);
		assertEquals(5, calculator.getResult());
	}

	@Test
	public void testSubstract() {
		calculator.add(10);
		calculator.substract(2);//��̨������1
		assertEquals("��������", 8, calculator.getResult());
	}

	/**
	 * ���Դ�����
	 */
	@Ignore("Multiply() Not yet implemented")
	@Test
	public void testMultiply() {
		System.out.println(String.valueOf(null).length());
	}

	/**
	 * �ڿ����ڵ��쳣�����׳������ж���������ͨ��(failure)�����׳�����������쳣���ж�Error
	 */
	@Test(expected = ArithmeticException.class)
	public void testDivide() {
		calculator.add(8);
		calculator.divide(0);
		System.out.println(String.valueOf(null).length());
		assertEquals(4, calculator.getResult());
	}
	
	// Core Hamcrest Matchers with assertThat
	@Test
	public void testAssertThatHamcrestCoreMatchers() {
		assertThat("good", allOf(equalTo("good"), startsWith("good")));
		assertThat("good", not(allOf(equalTo("bad"), equalTo("good"))));
		assertThat("good", anyOf(equalTo("bad"), equalTo("good")));
		assertThat(7, not(either(equalTo(3)).or(equalTo(4))));
		assertThat(new Object(), not(sameInstance(new Object())));
	}
}