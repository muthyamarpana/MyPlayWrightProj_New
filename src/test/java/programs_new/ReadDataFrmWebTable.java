//package programs_new;
//
//import com.microsoft.playwright.Browser;
//import com.microsoft.playwright.BrowserType;
//import com.microsoft.playwright.ElementHandle;
//import com.microsoft.playwright.Page;
//import com.microsoft.playwright.Playwright;
//import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
//
//import java.util.List;
//public class ReadDataFrmWebTable {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Playwright pl_w=Playwright.create();
//		Browser browser=pl_w.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
//		Page pg = browser.newPage();
//		pg.navigate("https://money.rediff.com/indices/nse/NIFTY-50?src=moneyhome_nseIndices");
//		//		System.out.println(pg.locator("#leftcontainer > table > tbody").locator("tr").count());  //50
//		//		System.out.println(pg.locator("#leftcontainer > table > tbody").locator("tr:first-child").locator("td").count()); //6
//		//		assertThat(pg.locator("#leftcontainer > table > tbody").locator("tr:first-child").locator("td:nth-child(2)")).hasText("Nifty");
//		//		System.out.println("Assert Executed...");
//		//print the entire table
//		//pg.locator("#leftcontainer > table > tbody").allInnerTexts().forEach(text -> System.out.println(text));
//		//Get all Rows and columns using QuerySelectorAll
//		List<ElementHandle> rows=pg.querySelectorAll(".dataTable > tbody > tr");
//		System.out.println("total number of Rows="+rows.size());
//		//loop through each row
//		for(ElementHandle row:rows)
//		{
//			//get all cells inside the each row
//			List<ElementHandle> cells=row.querySelectorAll("td");
//			//print each cell text
//			for(ElementHandle cell:cells)
//			{
//				System.out.println(cell.innerText());
//			}
//		}
//		pg.close();
//		browser.close();
//		pl_w.close();
//	}
//
//}
