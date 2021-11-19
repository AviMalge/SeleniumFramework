package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoreJavaSeleniumPage {
	
	@FindBy(xpath="//button[@class='play rounded-box state-paused']")
	private WebElement playbtn;
	
	@FindBy(xpath="//button[@class='play rounded-box state-playing']")
	private WebElement pausebtn;
	
	@FindBy(xpath="//span[text()='Share via Twitter']")
	private WebElement twitter;
	
	public CoreJavaSeleniumPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void play() {
		playbtn.click();
	}
	
	public void pause() {
		pausebtn.click();
	}
	
	public void twitter() {
		twitter.click();
	}

}
