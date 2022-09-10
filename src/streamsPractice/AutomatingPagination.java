package streamsPractice;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomatingPagination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//tr/th[1]")).click();
		List<String> price;
		do {
			List<WebElement> rows=driver.findElements(By.xpath("//tr/td[1]"));
			price=rows.stream().filter(s->s.getText().contains("Chocolate")).map(s->getPrice(s)).collect(Collectors.toList());
			price.forEach(s->System.out.println(s));
			if(price.size()<1) {
				driver.findElement(By.cssSelector("[aria-label='Next']")).click();
			}
		}while(price.size()<1);
		driver.quit();
	}
	public static String getPrice(WebElement s) {
		String priceValue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return priceValue;
	}

}
