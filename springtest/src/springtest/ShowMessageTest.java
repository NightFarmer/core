package springtest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class ShowMessageTest {

	private static FileSystemXmlApplicationContext context;

	@BeforeClass
	public static void init(){
		context = new FileSystemXmlApplicationContext("classpath:myspring.xml");
	}
	
	@AfterClass
	public static void dispose(){
		context.close();
	}
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testShow() {
		ShowMessage sm = (ShowMessage)context.getBean("myBean");
		sm.show();
	}

	@Test
	public void testShowList() {
		ShowMessage sm = (ShowMessage)context.getBean("myBean");
		sm.showList();;
	}

}
