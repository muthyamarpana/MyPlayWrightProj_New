package basicProgs;

import java.nio.file.Path;
import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class UploadingMultipleFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Playwright pl_w=Playwright.create();
		Browser browser=pl_w.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page pg = browser.newPage();
		pg.navigate("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_fileupload_multiple");
		pg.frameLocator("#iframeResult");
//		pg.locator("#myFile").setInputFiles(new Path[] {
//				Paths.get("./src/test/resources/files/test1.txt"),
//				Paths.get("./src/test/resources/files/test2.txt")
//		});
		pg.close();
		browser.close();
		pl_w.close();
	}

}
