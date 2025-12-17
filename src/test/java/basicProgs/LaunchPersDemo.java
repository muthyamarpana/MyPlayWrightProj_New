package basicProgs;

import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class LaunchPersDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Playwright pl_w=Playwright.create();
		//BrowserContext brow_Cont=pl_w.chromium().launchPersistentContext(Paths.get("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe"),new BrowserType.LaunchPersistentContextOptions().setHeadless(false));
		Browser brow_Cont=pl_w.chromium().launch(new BrowserType.LaunchOptions().setChannel("msedge").setHeadless(false));
		//Browser browser=pl_w.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setArgs(arguments).setExecutablePath(Paths.get("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe")));
		//Browser browser=playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setArgs(arguments).setExecutablePath(Paths.get("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe")));
		Page pg = brow_Cont.newPage();
		pg.navigate("https://www.google.com");
		Thread.sleep(3000);
		pg.navigate("https://mail.rediff.com/cgi-bin/login.cgi");
		Thread.sleep(4000);
		pg.goBack();
		Thread.sleep(4000);
		pg.goForward();
		Thread.sleep(4000);
		
		pg.reload();
		
//		pg.close();
//		pl_w.close();
	}

}
