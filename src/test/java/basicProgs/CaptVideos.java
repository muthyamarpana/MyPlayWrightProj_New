package basicProgs;

import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class CaptVideos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Playwright pl_w=Playwright.create();
		Browser browser=pl_w.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		BrowserContext context=browser.newContext(new Browser.NewContextOptions().setRecordVideoDir(Paths.get("Video123/")));
		Page pg = context.newPage();
		pg.navigate("https://jqueryui.com/resources/demos/droppable/default.html");
		Locator drag = pg.locator("#draggable");
		Locator drop = pg.locator("#droppable");
		pg.mouse().move(drag.boundingBox().x + drag.boundingBox().width/2, drag.boundingBox().y + drag.boundingBox().height/2);
		pg.mouse().down();
		pg.mouse().move(drop.boundingBox().x + drop.boundingBox().width/2, drop.boundingBox().y + drag.boundingBox().height/2);
		pg.mouse().up();
	}

}
