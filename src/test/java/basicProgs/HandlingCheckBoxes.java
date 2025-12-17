package basicProgs;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class HandlingCheckBoxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Playwright pl_w=Playwright.create();
		Browser browser=pl_w.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page pg = browser.newPage();
		pg.navigate("http://www.tizag.com/htmlT/htmlcheckboxes.php");
		Locator checkBoxes = pg.locator("[type='checkbox']");
		Thread.sleep(5000);
		System.out.println("Total count="+checkBoxes.count());
		for(int i=0;i<checkBoxes.count();i++)
		{
			System.out.println(checkBoxes.nth(i).getAttribute("value"));
			
		}
		pg.close();
		browser.close();
		pl_w.close();
		
	}

}
