package junit4.categories;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

/**
 * 按条件批量执行测试
 * 执行TestA、TestB中的测试用例
 * 执行Type1类型的用例
 * 不执行Type2类型的用例
 */
@RunWith(value=Categories.class)
@SuiteClasses({TestA.class, TestB.class})
@IncludeCategory(Type1.class)
//@ExcludeCategory(Type2.class)
public class SampleCalculatorCategoriesTest {
	
}
