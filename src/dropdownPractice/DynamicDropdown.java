package dropdownPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		WebElement a = driver
				.findElement(By.cssSelector("div[data-testid='to-testID-origin'] div[class*='r-1phboty r-rs99b7']"));
		a.click();
		driver.findElement(By.xpath("//*[text()='AMD']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='ATQ']")).click();
		driver.findElement(By.cssSelector(
				".css-1dbjc4n.r-1awozwy.r-19m6qjp.r-156aje7.r-y47klf.r-1phboty.r-1d6rzhh.r-1pi2tsx.r-1777fci.r-13qz1uu"));
		driver.quit();
	}

}
