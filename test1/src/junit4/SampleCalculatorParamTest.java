package junit4;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

/**
 * <p>
 * junit��������
 * </p>
 */
@RunWith(Parameterized.class)
public class SampleCalculatorParamTest {

	@Rule
	public ExpectedException thrown = ExpectedException.none();

	@Parameters
	public static List<Object[]> data() {
		Object[][] object = { { -1, -2, -3 }, { 0, 2, 2 }, { -1, 1, 0 },
				{ 1, 500, 4 } };
		return Arrays.asList(object);
	}

	/**
	 * ÿһ�����ݵĵ�һ��Ԫ�أ�Ҳ���Ǽӷ��ĵ�һ������
	 */
	@Parameter(value = 0)
	public int o1;
	
	/**
	 * ÿһ�����ݵĵڶ���Ԫ�أ�Ҳ���Ǽӷ��ĵڶ�������
	 */
	@Parameter(value = 1)
	public int o2;
	
	/**
	 * ÿһ�����ݵĵ�����Ԫ�أ�Ҳ���Ǽӷ��������
	 */
	@Parameter(value = 2)
	public int expector;

	@Test
	public void test() throws IOException, RuntimeException {
		SampleCalculator cal = new SampleCalculator();
		assertEquals(expector, cal.sum(o1, o2));
	}
	
	@Test(expected=RuntimeException.class)
	public void testO1Exception() {
		SampleCalculator cal = new SampleCalculator();
//		thrown.expect(RuntimeException.class);
//		thrown.expectMessage("o1 is too big");
		assertEquals(expector, cal.sum(o1, o2));
	}
	
	@Test
	public void testO2Exception() {
		SampleCalculator cal = new SampleCalculator();
//		thrown.expect(RuntimeException.class);
//		thrown.expectMessage("o2 is too big");
		cal.sum(100, 300);
	}
}
