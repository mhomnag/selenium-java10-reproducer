package my.module;

import java.time.Duration;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dummy {

	public static void main(String... args) {
		RemoteWebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.at");

		WebElement element = new WebDriverWait(driver, 30)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofMillis(500))
				.ignoring(NoSuchElementException.class)
				.ignoring(StaleElementReferenceException.class)
				.until(driver -> driver.findElement("lst-ib"));

	}

}
