package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultPage {
	
	@FindBy(xpath="//span[text()='Testing']")
	private WebElement testing;
	
	@FindBy(xpath="//a[text()='Automation Testing']")
	private WebElement automation;
	
	public SearchResultPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getTesting() {
		return testing;
	}
	
	public void automation() {
		automation.click();
	}
	

}
