package testScripts;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.AddToCartPage;
import pomPages.LoginPage;
import pomPages.SkillraryDemoLoginPage;

public class AddingCourseToCart extends BaseClass{
	@Test
	public void tc1() {
		LoginPage l= new LoginPage(driver);
		l.gearButton();
		l.sklillraryDemoAppbtn();
		
		utils.switchTabs(driver);
		
		SkillraryDemoLoginPage d = new SkillraryDemoLoginPage(driver);
		utils.mouseHover(driver, d.getCourse());
		d.seleniumTraningTab();
		
		AddToCartPage a = new AddToCartPage(driver);
		utils.doubleClick(driver, a.getAddBtn());
		a.addToCart();
		
		utils.alertpopup(driver);
		
	}

}
