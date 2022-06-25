package com.test.my.learning;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 {
	
	@Test
	public void runChrome() throws MalformedURLException
	{
		ChromeOptions op = new ChromeOptions();
		op.setHeadless(true);
		URL url = new URL("http://localhost:4444/wd/hub");
		RemoteWebDriver driver = new RemoteWebDriver(url, op);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://google.com");
		Assert.assertTrue(driver.getTitle().contains("Google"));
		driver.quit();
		
	}

}
