package extra;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAjaxAutomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.cssSelector("#nav-link-accountList"))).build().perform();
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		a.moveToElement(search).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		driver.quit();
	}

}
