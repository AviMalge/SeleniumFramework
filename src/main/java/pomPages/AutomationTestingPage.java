package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutomationTestingPage {
	@FindBy(xpath="//a[text()=' Core Java For Selenium Trainin']")
	private WebElement corejavaselenium;
	
	public AutomationTestingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	public void selectCoreJava() {
		corejavaselenium.click();
	}
	

}
