package selenium.webdriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class irctc {

	public static void main(String[] args) throws Throwable {
//		driver.get("https://irctc.co.in/nget/train-search/");
//		driver.findElement(By.xpath("//*[@id=\"origin\"]/span")).sendKeys("nellore");
//		driver.findElement(By.xpath("//*[@id=\"pr_id_1_list\"]/li[2]")).click();
		
		ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-notifications");
        
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Venkata.Pattem\\\\eclipse-workspace\\\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
        ChromeDriver driver=new ChromeDriver(options);
        driver.get("https://www.irctc.co.in/nget/train-search");
        driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"disha-banner-close\"]")).click();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
//        Thread.sleep(5000);
//        Actions act=new Actions(driver);
//        WebElement sai=driver.findElement(By.xpath("//*[@id=\"login_header_disable\"]/div/div/div[2]/a"));
//        act.moveToElement(sai).click().build().perform();
//        Thread.sleep(5000);


        driver.findElement(By.xpath("//*[@id=\"origin\"]/span/input")).click();
        List<WebElement> list=driver.findElements(By.xpath("//*[@id=\"pr_id_1_list\"]//li//span"));
        System.out.println(list.size());
        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i).getText());
            if(list.get(i).getText().equals("HYDERABAD DECAN - HYB"))
            {
                Thread.sleep(4000);
                list.get(i).click();
                break;
            }
        }
        driver.findElement(By.xpath("//*[@id=\"destination\"]/span/input")).click();
       List<WebElement>list1=driver.findElements(By.xpath("//*[@id=\"pr_id_2_list\"]//li//span"));
       System.out.println(list.size());
       for(int i=0;i<list1.size();i++)
       {
           System.out.println(list1.get(i).getText());
           if(list1.get(i).getText().equals("CHENNAI EGMORE - MS"))
           {
               Thread.sleep(4000);
               list1.get(i).click();
               break;
           }
       }
       driver.findElement(By.xpath("//*[@id=\"journeyQuota\"]/div")).click();
       List<WebElement> list2=driver.findElements(By.xpath("//*[@id=\"journeyQuota\"]/div/div[4]/div/ul//li//span"));
       System.out.println(list.size());
       for(int i=0;i<list2.size();i++)
       {
           System.out.println(list2.get(i).getText());
           if(list2.get(i).getText().equals("GENERAL"))
           {
               Thread.sleep(4000);
               list2.get(i).click();
               break;
           }
       }
       driver.findElement(By.xpath("//*[@id=\"jDate\"]/span/input")).click();
       Thread.sleep(4000);
       driver.findElement(By.xpath("//*[@id=\"jDate\"]/span/div/div/div[2]/table/tbody/tr[4]/td[6]/a")).click();
       driver.findElement(By.xpath("//*[@id=\"divMain\"]/div/app-main-page/div/div/div[1]/div[1]/div[1]/app-jp-input/div/form/div[5]/div/button")).click();
       //driver.quit();
       Thread.sleep(7000);
       driver.quit();
	}

}
