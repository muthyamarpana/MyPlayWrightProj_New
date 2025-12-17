package testNGWithPlayWright;

import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class HandlingLinks {

	@Test
	public void linksDemo() {
		// TODO Auto-generated method stub
		Playwright pl_w = Playwright.create();
		Browser brow=pl_w.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		BrowserContext brow_cont=brow.newContext((new Browser.NewContextOptions().setViewportSize(1536,864)));
		Page pg = brow_cont.newPage();
		pg.navigate("https://www.wikipedia.org/");
		Locator links=pg.locator("a");
		System.out.println("total number of links="+links.count());
		for(int i=0;i<links.count();i++)
		{
			System.out.println(links.nth(i).innerText()+"    "+links.nth(i).getAttribute("href"));
		}
		pg.close();
		pl_w.close();
	}

}
