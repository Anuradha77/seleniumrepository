package basicselenium;

import java.util.List;

import org.openqa.selenium.Alert;
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
		
		/*
		 * Thread.sleep(2000); 
		 * WebElement depart= dr.findElement(By.name("fromPort"));
		 * 
		 * Select sel1 =new Select(depart); 
		 * sel1.selectByValue("Frankfurt");
		 * 
		 * Thread.sleep(2000); 
		 * sel1.selectByValue("New York");
		 */
		
		/*Thread.sleep(2000);
		WebElement month=dr.findElement(By.name("fromMonth"));
		Select sel2=new Select(month);
		
		sel2.selectByValue("2");
		sel2.selectByIndex(2);
		
		Thread.sleep(2000);
		WebElement day=dr.findElement(By.name("fromDay"));
		Select sel3=new Select(day);
		
		sel3.selectByValue("28");
		sel3.selectByIndex(27);
		
		Thread.sleep(2000);
		WebElement port=dr.findElement(By.name("toPort"));
		Select sel4=new Select(port);
		
		sel4.selectByValue("London");
		
		Thread.sleep(2000);
		WebElement tomonth=dr.findElement(By.name("toMonth"));
		Select sel5=new Select(tomonth);
		
		sel5.selectByValue("2");
		
		
		Thread.sleep(2000);
		WebElement today=dr.findElement(By.name("toDay"));
		Select sel6=new Select(today);
		
		sel6.selectByValue("29");
		
		Thread.sleep(2000);
		WebElement servclass=dr.findElement(By.name("servClass"));
		Select sel7=new Select(servclass);
		
		sel7.selectByValue("Business");*/
		
		
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
		dr.findElement(By.name("reserveFlights")).click();
		
		//for check box
		dr.findElement(By.name("ticketLess")).click();
		System.out.println(dr.findElement(By.name("ticketLess")).isSelected());
		
		WebElement country=dr.findElement(By.name("delCountry"));
		
		Select countrySel= new Select(country);
		countrySel.selectByIndex(3);
		
		//to handle alert
		Alert alt=dr.switchTo().alert();
		System.out.println(alt.getText());
		//alt.accept();
		alt.dismiss();
		
		dr.findElement(By.name("buyFlights")).click();
		//dr.close();
		
		System.out.println(dr.findElement(By.xpath("//font[@size='+1']")).getText());
		
		
		
	}
}
