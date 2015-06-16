package junit4.categories;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

/**
 * ����������ִ�в���
 * ִ��TestA��TestB�еĲ�������
 * ִ��Type1���͵�����
 * ��ִ��Type2���͵�����
 */
@RunWith(value=Categories.class)
@SuiteClasses({TestA.class, TestB.class})
@IncludeCategory(Type1.class)
//@ExcludeCategory(Type2.class)
public class SampleCalculatorCategoriesTest {
	
}
