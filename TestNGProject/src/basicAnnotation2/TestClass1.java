package basicAnnotation2;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestClass1 {

	/*
	 * @Test public void test1() 
	 * { 
	 * System.out.println("Test case1"); 
	 * }
	 * 
	 * @Test public void test2() 
	 * { 
	 * System.out.println("Test case2");
	 *  }
	 */
	@Test(priority=0, enabled=false)//to skip used enabled=false
	public void test3()
	{
		System.out.println("Test case3");
	}
	
	@Test(priority=1,dependsOnMethods = {"test2"})//depend on method if method fails then this dependent method will skip in case priority will override
	public void test1()
	{
		System.out.println("Test case1");
	}
	@Test(priority=2)
	public void test2()
	{
		System.out.println("Test case2");
		throw new SkipException("skip this test");
	}
}