package junit4.categories;

import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category({Type1.class, Type2.class})
public class TestB {

	@Test
	public void b1(){
		System.out.println("b1");
	}
}
