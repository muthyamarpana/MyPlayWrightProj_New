package basicProgs;

import java.nio.file.Path;
import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Page.ScreenshotOptions;
import com.microsoft.playwright.Playwright;

public class BasicAuth_Test {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Playwright pl_w=Playwright.create();
		Browser browser=pl_w.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		BrowserContext context=browser.newContext(new Browser.NewContextOptions().setHttpCredentials("admin","admin"));
		Page pg = context.newPage();
		pg.navigate("http://the-internet.herokuapp.com/basic_auth");
		pg.screenshot(new ScreenshotOptions().setPath(Paths.get("./src/test/resources/files/scr1.png")));
		//pg.screenshot(new ScreenshotOptions().setPath(Paths );
	}

}
