package basicselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TestClass2 
{
	ChromeDriver dr;
	@Test
	public void bookAFlight() throws InterruptedException
	{
	
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		
		dr =new ChromeDriver();
		dr.manage().window().maximize();//to maximize browser
			
		//to navigate url we used get method
		dr.get("http://www.newtours.demoaut.com/");
		
		//text box
		dr.findElement(By.name("userName")).sendKeys("mercury");
		dr.findElement(By.name("password")).sendKeys("mercury");
		//button
		dr.findElement(By.name("login")).click();
		
		dr.findElement(By.xpath("//input[@value='oneway']")).click();//to click on radio button
		//drop down
		WebElement ele=dr.findElement(By.name("passCount"));
		
		Select sel = new Select(ele);
		
		sel.selectByIndex(2);//text value of drop down if index 2 then it select 3rd value of drop down
		
		Thread.sleep(2000);
		sel.selectByValue("2");//2nd value of drop down select
		
		Thread.sleep(2000);
		sel.selectByVisibleText("4");//4th value of drop down select
		
		dr.findElement(By.name("findFlights")).click();//click on continue button 
		
		WebElement table= dr.findElement(By.xpath("//table[@cellpadding='2'][@cellspacing='1'][1]/tbody"));
		
		List<WebElement> rows=table.findElements(By.tagName("tr"));//multiple rows
		
		for(WebElement r: rows)// enhance for loop used for collection and array
		{
			List<WebElement> cols=r.findElements(By.tagName("td"));
			
			for(WebElement c:cols)
			{
				System.out.println(c.getText());
			}
		}
		
		
		
	}
}
