package basicProgs;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class HandlingSlider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Playwright pl_w=Playwright.create();
		Browser browser=pl_w.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page pg = browser.newPage();
		pg.navigate("https://jqueryui.com/resources/demos/slider/default.html");
		Locator slider=pg.locator("//*[@id=\"slider\"]/span");
		pg.mouse().move(slider.boundingBox().x + slider.boundingBox().width/2,slider.boundingBox().y + slider.boundingBox().height/2);
		pg.mouse().down();
		pg.mouse().move(slider.boundingBox().x + 1000, slider.boundingBox().y + slider.boundingBox().height/2);
		
	}

}
