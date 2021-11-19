package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(xpath="//span[text()='GEARS']")
	private WebElement gearBtn;
	
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[1]")
	private WebElement skillrarydemoapp;
	
	@FindBy(xpath="//input[@name='q']")
	private WebElement searchtb;
	
	@FindBy(xpath="//input[@value='go']")
	private WebElement go;
	
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void gearButton() {
		gearBtn.click();
	}
	
	public void sklillraryDemoAppbtn() {
		skillrarydemoapp.click();
	}
	
	public void search(String course) {
		searchtb.sendKeys(course);
	}
	
	public void go() {
		go.click();
	}
	

}
