package qsp;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class DemoB {
@Test
	public void testA() throws MalformedURLException {
	
			String path = "./Drivers/chromedriver.exe";
			String value = "webdriver.chrome.driver";
			System.setProperty(value, path);
		URL r = new URL("http://localhost:4444//wd/hub");
		DesiredCapabilities d = new DesiredCapabilities();
		d.setBrowserName("chrome");
			WebDriver driver = new RemoteWebDriver(r,d);
			driver.close();

	}

}