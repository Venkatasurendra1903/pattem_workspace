package selenium.webdriver;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import io.netty.util.internal.SystemPropertyUtil;

public class BrokenLinksExample {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Venkata.Pattem\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.theworldsworstwebsiteever.com/");
//		Thread.sleep(5000);
		Set<String> brokenlinkUrls = new HashSet<String>();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("the total number of links are present in the page is:\n"+links.size());
		
		for(WebElement link : links)
		{
			String linkURL = link.getAttribute("href");
			URL url = new URL(linkURL);
			URLConnection urlConnection = url.openConnection();
			HttpURLConnection httpURLConnection = (HttpURLConnection) urlConnection;
			httpURLConnection.connect();
			if(httpURLConnection.getResponseCode() == 200)
			{
				brokenlinkUrls.add(linkURL);
			}
//				System.out.println(linkURL + " - " + httpURLConnection.getResponseMessage());
//			else
//				System.err.println(linkURL + " - " + httpURLConnection.getResponseCode() + " - " + httpURLConnection.getResponseMessage());
			
			httpURLConnection.disconnect();
			
		}
		driver.quit();
		
		for(String brokenlinkUrl : brokenlinkUrls) {
			System.err.println(brokenlinkUrl);
		}
		System.out.println("exicuted");
	}
}
