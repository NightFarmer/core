package junit4.categories;

import org.junit.Test;
import org.junit.experimental.categories.Category;

public class TestA {

	@Test
	public void a1(){
		System.out.println("a1");
	}
	
	@Category(value=Type1.class)
	@Test
	public void a2(){
		System.out.println("a1");
	}
}
