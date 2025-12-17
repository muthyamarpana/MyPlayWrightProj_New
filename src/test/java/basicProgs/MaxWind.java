package basicProgs;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Playwright;

import com.microsoft.playwright.Page;

public class MaxWind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Playwright playwright=Playwright.create();
		ArrayList<String> arguments=new ArrayList<>();
		arguments.add("--start-maximized");
		//Browser browser=playwright.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false).setArgs(arguments));
		//Browser browser=playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setArgs(arguments).setExecutablePath(Paths.get("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe")));
		Browser browser=playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setArgs(arguments).setExecutablePath(Paths.get("C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe")));
		BrowserContext context=browser.newContext(new Browser.NewContextOptions().setViewportSize(null));
		Page page=context.newPage();
		page.navigate("https://mail.rediff.com/cgi-bin/login.cgi");
		System.out.println(page.title());
		page.close();
		playwright.close();
		
				

	}

}
