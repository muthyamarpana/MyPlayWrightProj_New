package basicProgs;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class HandlingTabs {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Playwright pl_w=Playwright.create();
		Browser browser=pl_w.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page pg = browser.newPage();
		pg.navigate("https://sso.teachable.com/secure/673/identity/sign_up/email");
		Page tab=pg.waitForPopup(() -> {
			pg.locator("text=Privacy Policy").nth(0).click();
		});
		tab.locator("//*[@id=\"header-sign-up-btn\"]").click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		tab.locator("#name").fill("Rakesh");
		Thread.sleep(4000);
		tab.close();
		pg.close();
		browser.close();
		pl_w.close();
		}

}
