package basicProgs;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class HandlingResize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Playwright pl_w=Playwright.create();
		Browser browser=pl_w.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page pg = browser.newPage();
		pg.navigate("https://jqueryui.com/resources/demos/resizable/default.html");
		Locator obj = pg.locator("//*[@id=\"resizable\"]/div[3]");
		pg.mouse().move(obj.boundingBox().x + obj.boundingBox().width/2, obj.boundingBox().y + obj.boundingBox().height/2);
		pg.mouse().down();
		pg.mouse().move(obj.boundingBox().x + 400, obj.boundingBox().y + 400);
	}

}
