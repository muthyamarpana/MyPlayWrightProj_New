package basicProgs;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class HandlingAlerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Playwright pl_w=Playwright.create();
		Browser browser=pl_w.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page pg = browser.newPage();
		pg.navigate("https://mail.rediff.com/cgi-bin/login.cgi");
		pg.onDialog(dialog -> {
			try {
				Thread.sleep(5000);
			}catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			dialog.accept();
			System.out.println(dialog.message());
		});
		pg.locator("[name='proceed']").click();

		try {
			Thread.sleep(5000);
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
		pg.close();

	}

}
