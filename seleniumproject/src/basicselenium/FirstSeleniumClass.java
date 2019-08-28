package basicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstSeleniumClass {
	
	@Test
	public void login()
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		
		ChromeDriver dr =new ChromeDriver();//1st execute constructor
		dr.manage().window().maximize();//to maximize browser
		
		//to navigate url we used get method
		dr.get("http://www.newtours.demoaut.com/");
		
		dr.findElement(By.name("userName")).sendKeys("mercury");
		dr.findElement(By.name("password")).sendKeys("mercury");
		dr.findElement(By.name("login")).click();
		dr.findElement(By.linkText("SIGN-OFF")).click();
		
	}

	

}
