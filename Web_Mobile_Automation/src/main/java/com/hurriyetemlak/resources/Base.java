package com.hurriyetemlak.resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {

	public WebDriver driver;
    public Properties prob;

    public WebDriver initializeDriver() throws IOException
	{
		prob = new Properties();
		FileInputStream fis = new FileInputStream("src/main/java/com/hurriyetemlak/resources/data.properties");
		prob.load(fis);
		
		String browserName = prob.getProperty("browser");
		
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Documents\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.setExperimentalOption("useAutomationExtension", false);
			driver = new ChromeDriver(options);
		}
		else if(browserName.equals("firefox"))
		{
			// I chose to execute in Chrome so I left here empty
		}
		else if(browserName.equals("IE"))
		{
			// I chose to execute in Chrome so I left here empty
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
    
        public void closeBrowser()
        {
		driver.close();
	    }
}
