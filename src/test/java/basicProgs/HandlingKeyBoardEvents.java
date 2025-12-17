package basicProgs;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class HandlingKeyBoardEvents {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Playwright pl_w=Playwright.create();
		Browser browser=pl_w.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page pg = browser.newPage();
		pg.navigate("https://mail.rediff.com/cgi-bin/login.cgi");
		pg.locator("#login1").fill("arpana_muthyam");
		pg.keyboard().press("Control+A");
		Thread.sleep(5000);
		pg.keyboard().press("Control+X");
		Thread.sleep(5000);
		pg.locator("#password").press("Control+V");
		Thread.sleep(5000);
		pg.keyboard().down("Shift");
		
		
		for(int i=0;i<4;i++)
		{
			pg.keyboard().press("ArrowLeft");
			Thread.sleep(500);
		}
		
	}

}
