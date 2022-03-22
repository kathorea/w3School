package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TryItEditor 
{
	@FindBy (xpath="//button[text()='Run SQL »']")
	private WebElement runSql;
	
	public TryItEditor(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickRunSQL()
	{
		runSql.click();
	}

}