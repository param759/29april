package Gitwork.Homework29;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HomeTest {
 public WebDriver driver;
	@Test
	public void goal1()
	{
		System.out.println("this is first commit");
	}
	
	@Test
	public void goal2()
	
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\15199\\Desktop\\latestchrome\\chromedriver.exe");
		 driver=new ChromeDriver();	
		 driver.get("https://www.salesforce.com/ca/?ir=1");
	}
}
