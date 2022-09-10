package automationPractice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrolingInTable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		driver.quit();
	}

}
