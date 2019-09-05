package basicselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandleIFrame {

ChromeDriver dr;
	
	@Test
	public void test1() throws InterruptedException
	{
		dr =new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		
		dr.get("https://paytm.com/");
		
		Thread.sleep(2000);
		dr.findElement(By.xpath("//div[text()='Log In/Sign Up']")).click();
	
		Thread.sleep(2000);
		dr.switchTo().frame(0);
		dr.findElement(By.xpath("//span[text()='Login/Signup with mobile number and password']")).click();
}
}