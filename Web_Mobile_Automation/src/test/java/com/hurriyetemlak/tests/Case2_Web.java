package com.hurriyetemlak.tests;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.hurriyetemlak.resources.Base;

import com.hurriyetemlak.case2.web.ForRentPage;
import com.hurriyetemlak.case2.web.LandingPage;
import com.hurriyetemlak.case2.web.ListingDetailPage;

public class Case2_Web extends Base{

	@Test
	public void BasePageNavigation() throws IOException 
	{
		driver = initializeDriver();
		driver.get("https://www.hurriyetemlak.com/");
	}
	
	@Test(priority=1)
	public void goTo_ForRentPage()
	{
		LandingPage lp = new LandingPage(driver);
		ForRentPage frp = lp.click_forRent();
	}
	
	@Test(priority=2)
	public void selectCity() throws InterruptedException
	{
		ForRentPage frp = new ForRentPage(driver);
		frp.select_City();
	}
	
	@Test(priority=3)
	public void selectCounty() throws InterruptedException
	{
		ForRentPage frp = new ForRentPage(driver);
		frp.select_County();
	}
	
	@Test(priority=4)
	public void selectRoom() throws InterruptedException
	{
		ForRentPage frp = new ForRentPage(driver);
		frp.select_Room();
	}
	
	@Test(priority=5)
	public void selectSearch() throws InterruptedException
	{
		ForRentPage frp = new ForRentPage(driver);
		frp.search_All();
	}
	
	@Test(priority=6)
	public void gotoListingPage() throws InterruptedException
	{
		ForRentPage frp = new ForRentPage(driver);
		ListingDetailPage ldp = frp.goto_ListingPage();
	}
	
	@Test(priority=7)
	public void showPhoneNumber() throws InterruptedException
	{
		ListingDetailPage ldp = new ListingDetailPage(driver);
		ldp.click_ShowPhoneNumber();
		Thread.sleep(2000);
		closeBrowser();
    }
}