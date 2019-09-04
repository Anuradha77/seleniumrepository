package selassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class oneway1 
{

	ChromeDriver dr;
	@Test
	public void login() throws InterruptedException
	{
		
		
	//	System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		
		 dr =new ChromeDriver();//1st execute constructor
		dr.manage().window().maximize();//to maximize browser
		
		//to navigate url we used get method
		dr.get("http://www.newtours.demoaut.com/");
		
		dr.findElement(By.name("userName")).sendKeys("mercury");
		dr.findElement(By.name("password")).sendKeys("mercury");
		dr.findElement(By.name("login")).click();
		//dr.findElement(By.linkText("SIGN-OFF")).click();
		dr.findElement(By.xpath("//input[@value='oneway']")).click();//to click on radio button
		//drop down
		WebElement ele=dr.findElement(By.name("passCount"));
		
		Select sel = new Select(ele);
		
		sel.selectByIndex(2);//text value of drop down if index 2 then it select 3rd value of drop down
		
		Thread.sleep(2000);
		sel.selectByValue("1");//2nd value of drop down select
		
				
		Thread.sleep(2000); 
		WebElement depart= dr.findElement(By.name("fromPort"));
		 
		Select sel1 =new Select(depart); 
		sel1.selectByValue("Frankfurt");
		 
		Thread.sleep(2000); 
		sel1.selectByValue("New York");
		
		
		Thread.sleep(2000);
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
		dr.findElement(By.xpath("//input[@value='Business']")).click();
		
		Thread.sleep(2000);
		WebElement air=dr.findElement(By.name("airline"));
		Select sel8=new Select(air);
		sel8.selectByVisibleText("Unified Airlines");
		
		Thread.sleep(2000);
		dr.findElement(By.name("findFlights")).click();
		
		Thread.sleep(2000);
		dr.findElement(By.xpath("//input[@value='Pangea Airlines$362$274$9:17']")).click();
		
		Thread.sleep(2000);
		dr.findElement(By.name("reserveFlights")).click();;
		
		Thread.sleep(2000);
		dr.findElement(By.name("passFirst0")).sendKeys("Swara");
		Thread.sleep(2000);
		dr.findElement(By.name("passLast0")).sendKeys("Patil");
		
		Thread.sleep(2000);
		WebElement info= dr.findElement(By.name("pass.0.meal"));
		Select sel9=new Select(info);
		sel9.selectByValue("DBML");
		
		Thread.sleep(2000);
		WebElement info1= dr.findElement(By.name("creditCard"));
		Select sel10=new Select(info1);
		sel10.selectByValue("BA");
		
		Thread.sleep(2000);
		dr.findElement(By.name("creditnumber")).sendKeys("95770925896");
		 
		Thread.sleep(2000);
		WebElement info2= dr.findElement(By.name("cc_exp_dt_mn"));
		Select sel11=new Select(info2);
		sel11.selectByIndex(10);
		
		Thread.sleep(2000);
		WebElement info3= dr.findElement(By.name("cc_exp_dt_yr"));
		Select sel12=new Select(info3);
		sel12.selectByValue("2010");
		
		Thread.sleep(2000);
		dr.findElement(By.name("cc_frst_name")).sendKeys("Swara");
		Thread.sleep(2000);
		dr.findElement(By.name("cc_mid_name")).sendKeys("Kiran");
		Thread.sleep(2000);
		dr.findElement(By.name("cc_last_name")).sendKeys("Patil");
		Thread.sleep(2000);
		dr.findElement(By.name("ticketLess")).click();
		System.out.println(dr.findElement(By.name("ticketLess")).isSelected());
		
		Thread.sleep(2000);
		dr.findElement(By.name("buyFlights")).click();
		
		
		System.out.println(dr.findElement(By.xpath("//font[@size='+1']")).getText());
		
		//dr.findElement(By.linkText("mercurysignoff.php")).click();
		//dr.findElement(By.linkText("SIGN-OFF")).click();		
	}		
}
