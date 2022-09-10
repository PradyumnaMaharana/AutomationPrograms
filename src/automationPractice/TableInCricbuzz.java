package automationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableInCricbuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		System.setProperty("webdriver.chrome.driver", "./Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://www.cricbuzz.com/live-cricket-scorecard/44501/county-div-1-county-championship-division-one-2022");
		WebElement table = driver.findElement(By.cssSelector("div[class='cb-col cb-col-67 cb-scrd-lft-col html-refresh ng-isolate-scope']"));
		int rowCount = table.findElements(By.cssSelector(".cb-col.cb-col-100.cb-scrd-itms")).size();
		System.out.println("No. of table : "+rowCount);
		int count = table.findElements(By.cssSelector("div[class=cb-col cb-col-100 cb-scrd-itms] div:nth-child(3)"))
				.size();
		for (int i = 0; i < count - 2; i++) {
			String value = table
					.findElements(By.cssSelector("div[class=cb-col cb-col-100 cb-scrd-itms] div:nth-child(3)")).get(i)
					.getText();
			int valueInteger = Integer.parseInt(value);
			sum += valueInteger;
		}
		System.out.println("Total run is : " + sum);
		String extra = driver.findElement(By.xpath(
				"//div[@class='cb-col cb-col-100 cb-scrd-itms'] //div[@class='cb-col cb-col-8 text-bold cb-text-black text-right']"))
				.getText();
		int extraInteger = Integer.parseInt(extra);
		int totalSum = sum + extraInteger;
		String actualTotal = driver.findElement(By.xpath(
				"//div[@class='cb-col cb-col-100 cb-scrd-itms'] //div[@class='cb-col cb-col-8 text-bold text-black text-right']"))
				.getText();
		int actualTotalInteger = Integer.parseInt(actualTotal);
		System.out
				.println("Our total count is : (" + totalSum + ") and actual count is : (" + actualTotalInteger + ")");
		if (totalSum == actualTotalInteger) {
			System.out.println("Count is successful.....");
		} else {
			System.out.println("Count failed......");
		}
		driver.quit();
	}
}
