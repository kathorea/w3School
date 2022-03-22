package pom;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestingClass
{
	public static void main(String[] args) 
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
				
			driver.manage().window().maximize();
			
			driver.get("https://www.w3schools.com/sql/sql_join_right.asp");
			
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			
			ApplicationMainPage applicationMainPage=new ApplicationMainPage(driver);
			applicationMainPage.clickTryItYourSelf();
			
			ArrayList<String> a=new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(a.get(1));
			
			TryItEditor tryItEditor=new TryItEditor(driver);
			tryItEditor.clickRunSQL();
		
	}

}
