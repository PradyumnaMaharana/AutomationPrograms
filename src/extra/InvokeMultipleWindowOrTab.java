package extra;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokeMultipleWindowOrTab {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		driver.switchTo().newWindow(WindowType.TAB);
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		String pWindow = it.next();
		String cWindow = it.next();
		driver.switchTo().window(cWindow);
		driver.get("https://rahulshettyacademy.com/");
		String cName = driver.findElements(By.cssSelector("a[href='https://courses.rahulshettyacademy.com/courses\']"))
				.get(1).getText();
		driver.switchTo().window(pWindow);
		WebElement name = driver.findElement(By.cssSelector("[name='name']"));
		name.sendKeys(cName);
		File file = name.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("logo.png"));
		System.out.println(name.getRect().getDimension().getHeight());
		System.out.println(name.getRect().getDimension().getWidth());
		driver.quit();
	}

}
