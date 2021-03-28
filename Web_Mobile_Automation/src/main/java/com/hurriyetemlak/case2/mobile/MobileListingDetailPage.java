package com.hurriyetemlak.case2.mobile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hurriyetemlak.case2.mobile.MobileListingDetailPage;

public class MobileListingDetailPage {

	public WebDriver driver;
	WebElement element;
	
	@FindBy(xpath="/html/body/div[1]/div/div/div[2]/div/div/div[3]/div[4]/div/div[1]/a")
	WebElement clickCallOwner;
	
	public MobileListingDetailPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public MobileListingDetailPage click_CallOwner() throws InterruptedException
	{
		Thread.sleep(5000);
		clickCallOwner.click();
		return this;
	}
	
	public void close_Browser()
	{
		driver.close();
	}
}
