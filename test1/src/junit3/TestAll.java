package junit3;

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

public class TestAll {
	/**
	 * ��ȡ�����Ĳ�������
	 */
	public static Test suite() {
		TestSuite suite = new TestSuite("TestSuite Test");
		suite.addTestSuite(TestSample.class);
		return suite;
	}

	/**
	 * ��������
	 */
	public static void main(String args[]) {
		TestRunner.run(suite());
	}
}
