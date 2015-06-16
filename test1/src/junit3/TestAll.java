package junit3;

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

public class TestAll {
	/**
	 * 获取批量的测试用例
	 */
	public static Test suite() {
		TestSuite suite = new TestSuite("TestSuite Test");
		suite.addTestSuite(TestSample.class);
		return suite;
	}

	/**
	 * 批量测试
	 */
	public static void main(String args[]) {
		TestRunner.run(suite());
	}
}
