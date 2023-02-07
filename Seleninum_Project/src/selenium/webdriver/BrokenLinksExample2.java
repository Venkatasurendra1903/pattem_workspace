package selenium.webdriver;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinksExample2 {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Venkata.Pattem\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.theworldsworstwebsiteever.com/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		for(int i=0; i<links.size(); i++) {
			WebElement element = links.get(i);
			String url = element.getAttribute("href");
			URL link = new URL(url);
			HttpURLConnection httpUrlConnection = (HttpURLConnection) link.openConnection();
			Thread.sleep(3000);
			httpUrlConnection.connect();
			int rescode = httpUrlConnection.getResponseCode();
			if(rescode >= 400) {
				System.out.println(url + " - " + " is broken link");
			}
			else
			{
				System.out.println(url + " - " + "is valid link");
			}
		}
		System.out.println("done");
		driver.quit();

	}

}
