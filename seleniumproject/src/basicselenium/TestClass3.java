package basicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestClass3 
{
	ChromeDriver dr;
	@Test
	public void test1()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		
		dr =new ChromeDriver();
		dr.manage().window().maximize();//to maximize browser
			
		//to navigate url we used get method
		dr.get("http://www.newtours.demoaut.com/");
		
		System.out.println(dr.findElement(By.xpath("//img[@alt='Mercury Tours']")).getAttribute("height"));
		System.out.println(dr.findElement(By.xpath("//img[@alt='Mercury Tours']")).getAttribute("width"));
	}
}
