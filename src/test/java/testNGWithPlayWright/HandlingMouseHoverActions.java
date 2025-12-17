package testNGWithPlayWright;

import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class HandlingMouseHoverActions {

	@Test
	public void mouseHoverDemo() {
		// TODO Auto-generated method stub
		Playwright pl_w=Playwright.create();
		Browser browser=pl_w.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page pg = browser.newPage();
		pg.navigate("https://www.way2automation.com/");
		pg.locator("//*[@id='menu-item-27580']/a/span[2]").hover();
		pg.locator("//*[@id=\"menu-item-27592\"]/a/span[2]").click();	
		pg.close();
		pl_w.close();
		}

}
