package extra;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCalender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companion/");
		driver.findElement(By.id("form-field-travel_comp_date")).click();
		while (!driver.findElement(By.cssSelector(".flatpickr-month")).getText().contains("September")) {
			driver.findElement(By.cssSelector(".flatpickr-next-month")).click();
		}
		List<WebElement> dates = driver
				.findElements(By.xpath("//div[@class='dayContainer'] //span[contains(text()='flatpickr-day']"));
		int count = dates.size();
		for (int i = 1; i < count; i++) {
			String date = dates.get(i).getText();
			if (date.equalsIgnoreCase("12")) {
				dates.get(i).click();
				break;
			}
		}
		System.out.println(driver.findElement(By.id("form-field-travel_comp_date")).getText());
		// driver.quit();
	}

}
