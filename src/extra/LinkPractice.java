package extra;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> linkAll = driver.findElements(By.tagName("a"));
		System.out.println(linkAll.size());
		List<WebElement> foot = driver.findElement(By.id("gf-BIG")).findElements(By.tagName("a"));
		System.out.println(foot.size());
		WebElement footColumn = driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		List<WebElement> footColumnLink = footColumn.findElements(By.tagName("a"));
		int size = footColumnLink.size();
		System.out.println(size);
		for (int i = 1; i < size; i++) {
			String click = Keys.chord(Keys.CONTROL, Keys.ENTER);
			footColumnLink.get(i).sendKeys(click);
			Thread.sleep(3000);
		}
		Set<String> allPages = driver.getWindowHandles();
		Iterator<String> it = allPages.iterator();
		while (it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
		driver.quit();
	}

}
