package testScripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.AutomationTestingPage;
import pomPages.CoreJavaSeleniumPage;
import pomPages.LoginPage;
import pomPages.SearchResultPage;

public class CoreJavaSelenium extends BaseClass {
	
	@Test
	public void tc2() throws InterruptedException, FileNotFoundException, IOException {
	LoginPage l =new LoginPage(driver);
	l.search(pfile.getPropertyData("course"));
	l.go();
	
	SearchResultPage s = new SearchResultPage(driver);
	utils.mouseHover(driver, s.getTesting());
	s.automation();
	
	AutomationTestingPage a =new AutomationTestingPage(driver);
	a.selectCoreJava();
	
	CoreJavaSeleniumPage c = new CoreJavaSeleniumPage(driver);
	utils.switchFrame(driver);
	c.play();
	Thread.sleep(5000);
	c.pause();
	utils.switchBackFrame(driver);
	c.twitter();
	
	}

}
