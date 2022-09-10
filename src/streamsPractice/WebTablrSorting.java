package streamsPractice;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WebTablrSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//tr/th[1]")).click();
		List<WebElement> eList = driver.findElements(By.xpath("//tr/td[1]"));
		List<String> oList = eList.stream().map(s -> s.getText()).collect(Collectors.toList());
		List<String> sList = oList.stream().sorted().collect(Collectors.toList());
		Assert.assertTrue(oList.equals(sList));
		System.out.println("All done succesfully.....");
		driver.quit();
	}

}