package my.module;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Dummy {

	public static void main(String... args) throws Exception {
		RemoteWebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.at");

		Thread.sleep(10000);

		WebElement element = driver.findElement(By.id("lst-ib"));
		element.sendKeys("google");
		element.sendKeys(Keys.ENTER);
	}

}
