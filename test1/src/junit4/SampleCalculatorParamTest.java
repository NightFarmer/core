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
 * junit参数测试
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
	 * 每一组数据的第一个元素，也就是加法的第一个参数
	 */
	@Parameter(value = 0)
	public int o1;
	
	/**
	 * 每一组数据的第二个元素，也就是加法的第二个参数
	 */
	@Parameter(value = 1)
	public int o2;
	
	/**
	 * 每一组数据的第三个元素，也就是加法期望结果
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
