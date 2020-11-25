package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetupDriver {
	

	public static WebDriver driver;

	public static void getChromeDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\md200\\eclipse-workspace\\HotelsDemo\\chromedriver.exe");
		driver = new ChromeDriver();
		SetupDriver.driver.manage().window().maximize();
		SetupDriver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	public static WebDriver getDriver() {
		return driver;
}
}
