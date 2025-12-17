package basicProgs;

import java.awt.Dimension;
import java.awt.Toolkit;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class MyFirstTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
		int width=(int)size.getWidth();  //get width of your screen
		int height=(int)size.getHeight();
		System.out.println("Width="+width+"\t"+"Height="+height);
		
		Playwright play_wright= Playwright.create();
		Browser browser=play_wright.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false));
		BrowserContext browContext=browser.newContext(new Browser.NewContextOptions().setViewportSize(width,height));
		Page page=browContext.newPage();
		page.navigate("https://www.google.com");
		System.out.println("title="+page.title());
		if(page.title().equals("Google"))
		{
			System.out.println("title matched...");
			//page.close();
			//play_wright.close();
		}
		
		
	}

}
