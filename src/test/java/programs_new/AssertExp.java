package programs_new;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class AssertExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Playwright pl_w=Playwright.create();
		Browser browser=pl_w.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page pg = browser.newPage();
		pg.navigate("http://www.tizag.com/htmlT/htmlcheckboxes.php");
		assertThat(pg).hasURL("http://www.tizag.com/htmlT/htmlcheckboxes.php");
		assertThat(pg).hasTitle("HTML Tutorial - Checkboxes");
		assertThat(pg.locator("#menu > a:nth-child(29)")).hasText("HTML - Tags");
		assertThat(pg.locator("#menu > a:nth-child(70)")).isVisible();
		
	}

}
