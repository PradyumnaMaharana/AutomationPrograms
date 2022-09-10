package dropdownPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdateDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		WebElement a = driver.findElement(
				By.cssSelector("div[class='css-1dbjc4n'] div div[class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep']"));
		a.click();
		Thread.sleep(3000);
		System.out.println(a.getText());
		for (int i = 1; i < 5; i++) {
			driver.findElement(By.xpath(
					"//div[@class='css-1dbjc4n r-1awozwy r-18u37iz'] //div[@data-testid='Adult-testID-plus-one-cta']"))
					.click();
		}
		a.click();
		System.out.println(a.getText());
		driver.quit();
	}

}
