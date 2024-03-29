package basicAnnotation2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestClass2
{
	@Test
	public void test1()
	{
		System.out.println("Test 1 class 2");
	}
	@Test
	public void test2()
	{
		System.out.println("Test 2 class 2");
	}
	@Test
	public void test3()
	{
		System.out.println("Test 3 class 2");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before method class 2");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("after method class 2");
	}
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before class 2");
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("after class 2");
	}
	
	@BeforeTest
	@Parameters({"browser"})
	public void masterSFDC(String browser)
	{
		System.out.println("Before SFDC");
		System.out.println("Browser:"+browser);
	}
	
	@AfterTest
	public void afterSFDC()
	{
		System.out.println("After SFDC");
	}
}
