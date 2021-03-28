package com.hurriyetemlak.tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.hurriyetemlak.case1.web.ForSalePage;
import com.hurriyetemlak.case1.web.LandingPage;
import com.hurriyetemlak.resources.Base;
import junit.framework.Assert;

public class Case1_Web extends Base{

	@Test
	public void BasePageNavigation() throws IOException 
	{
		driver = initializeDriver();
		driver.get("https://www.hurriyetemlak.com/");
	}
	
	@Test(priority=1)
	public void goTo_ForSalePage()
	{
		LandingPage lp = new LandingPage(driver);
		ForSalePage fsp = lp.click_forSale();
	}
	
	@Test(priority=2)
	public void selectCityAndCounty() throws InterruptedException
	{
		ForSalePage fsp = new ForSalePage(driver);
		fsp.select_City_County();
	}
	
	@Test(priority=3)
	public void selectPrices() throws InterruptedException
	{
		ForSalePage fsp = new ForSalePage(driver);
		fsp.select_Prices("100000", "2000000");
	}
	
	@Test(priority=4)
	public void selectBuildingAge() throws InterruptedException
	{
		ForSalePage fsp = new ForSalePage(driver);
		fsp.select_BuildingAge();
	}
	
	@Test(priority=5)
	public void clickSearch() throws InterruptedException
	{
		ForSalePage fsp = new ForSalePage(driver);
		fsp.click_Search();
	}
	
	@Test(priority=6)
	public void Assertions()
	{
		ForSalePage fsp = new ForSalePage(driver);
		Assert.assertTrue(fsp.verify_Filters().isDisplayed());
	}
	
	@AfterTest
    public void after() 
	{
	    closeBrowser();
	}

	
}
