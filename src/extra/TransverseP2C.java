package extra;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TransverseP2C {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/loginpagePractise/#");
		driver.findElement(By.cssSelector(".blinkingText")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
		String email = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		System.out.println(email);
		driver.switchTo().window(parentId);
		driver.findElement(By.id("username")).sendKeys(email);
		System.out.println(driver.findElement(By.cssSelector(".text-center.text-white")).getText());
		String username = driver.findElement(By.cssSelector(".text-center.text-white")).getText().split(" ")[2].trim();
		String p = driver.findElement(By.cssSelector(".text-center.text-white")).getText().split(" ")[6].trim();
		String password = p.substring(0, p.length() - 1);
		System.out.println("Username is : ( " + username + " ) and Password is : ( " + password + " )");
		driver.findElement(By.id("username")).sendKeys(Keys.chord(Keys.CONTROL, "a"), username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
