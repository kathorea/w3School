package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplicationMainPage
{
	@FindBy (xpath="//a[text()='Try it Yourself »']")
	private WebElement tryItYourSelf;
	
	
	public ApplicationMainPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickTryItYourSelf()
	{
		tryItYourSelf.click();
	}
    
}
