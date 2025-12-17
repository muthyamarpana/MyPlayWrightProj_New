package basicProgs;

import java.nio.file.Paths;
import java.util.ArrayList;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Page.TypeOptions;
import com.microsoft.playwright.Playwright;

public class Rediff_Login {

	public static void main(String[] args) {
		Playwright playwright=Playwright.create();
		ArrayList<String> arguments=new ArrayList<>();
		arguments.add("--start-maximized");
		//Browser browser=playwright.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false).setArgs(arguments));
		//Browser browser=playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setArgs(arguments).setExecutablePath(Paths.get("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe")));
		Browser browser=playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setArgs(arguments).setExecutablePath(Paths.get("C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe")));
		BrowserContext context=browser.newContext(new Browser.NewContextOptions().setViewportSize(null));
		Page pg=context.newPage();
		pg.navigate("https://mail.rediff.com/cgi-bin/login.cgi");
		System.out.println(pg.title());
		//pg.locator("#login1").type("arpanam")
		//pg.locator("[id='login1']").type("arpanam");
		//pg.type("#login1", "arpanam",new TypeOptions().setDelay(100));
		pg.locator("#login1").fill("arpanam");
		pg.locator("#password").fill("arpana111");
		String txtValue=pg.locator("//label[@for='remember']").innerText();
		System.out.println(txtValue);
		//pg.click("text=Log In");
		pg.click("button:has-text('Log In')");
		pg.close();
		playwright.close();
	}

}
