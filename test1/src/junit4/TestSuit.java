package junit4;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;


/**
 * <p>批量测试</p>
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({ 
	SampleCalculatorTest.class, 
	SampleCalculatorTest.class, 
})
public class TestSuit {
	// the class remains empty,永远保持空
//	只用来作为注解的载体
    // used only as a holder for the above annotations
}
