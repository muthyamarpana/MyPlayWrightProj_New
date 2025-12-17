package basicProgs;

import java.nio.file.Path;
import java.util.List;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.SelectOption;
import com.microsoft.playwright.BrowserType.ConnectOptions;
import com.microsoft.playwright.BrowserType.ConnectOverCDPOptions;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.BrowserType.LaunchPersistentContextOptions;
import com.microsoft.playwright.ElementHandle;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class HandlingDropDownList {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Playwright pl_w = Playwright.create();
		Browser brow=pl_w.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		BrowserContext brow_cont=brow.newContext((new Browser.NewContextOptions().setViewportSize(1536,864)));
		Page pg = brow_cont.newPage();
		pg.navigate("https://www.wikipedia.org/");
		//select an item by its value
		pg.selectOption("select", "ca");
		Thread.sleep(3000);
		
		//select an item by text
		pg.selectOption("select", new SelectOption().setLabel("Dansk"));
		
		//select an item by index
		pg.selectOption("select", new SelectOption().setIndex(3));
		
		//count no. of values in dropdown
		
		Locator values = pg.locator("select > option");
		
		System.out.println("total count="+values.count());
		
		//display each text of each option
		
		for(int i=0;i<values.count();i++)
		{
			System.out.println(values.nth(i).innerText()+"\t"+"---"+values.nth(i).getAttribute("lang"));
			
		}
		System.out.println("***************Using Query Selector************");
		
		List<ElementHandle> values1=pg.querySelectorAll("select > option");
		System.out.println(values1.size());
		
		//use simple extended for..loop
		for(ElementHandle opt:values1)
		{
			System.out.println(opt.innerText()+"\t"+"---"+opt.getAttribute("lang"));

		}
		pg.close();
		pl_w.close();
		
	}

}
