package basicProgs;

import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Download;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class DownloadFile_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Playwright pl_w=Playwright.create();
		Browser browser=pl_w.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page pg = browser.newPage();
		pg.navigate("https://www.selenium.dev/downloads/");
		Download file=pg.waitForDownload(()->{
			pg.locator("body > div > main > div:nth-child(5) > div.col-sm-6.py-3.ps-0.pe-3 > div > div > p:nth-child(1) > a").click();
		});
		file.saveAs(Paths.get("./src/test/resources/Downloads/selenium.jar"));
	}

}
