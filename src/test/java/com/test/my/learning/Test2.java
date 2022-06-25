package com.test.my.learning;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test2 {
	
	@Test
	public void runEdge() throws MalformedURLException
	{
		EdgeOptions op = new EdgeOptions();
		op.setHeadless(true);
		URL url = new URL("http://localhost:4444/wd/hub");
		RemoteWebDriver driver = new RemoteWebDriver(url, op);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bbc.co.uk/");
		Assert.assertTrue(driver.getTitle().contains("BBC"));
		driver.quit();
		
	}

}
