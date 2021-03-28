package com.hurriyetemlak.case2.mobile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.hurriyetemlak.case2.mobile.MobileForRentPage;
import com.hurriyetemlak.case2.mobile.MobileListingDetailPage;

public class MobileForRentPage {

	public WebDriver driver;
	WebElement element;
	
	@FindBy(xpath="//button[@class='btn btn-white'][2]")
	WebElement clickFilterBar;
	
	@FindBy(xpath="//option[@value='ankara']")
	WebElement selectCity;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[2]/div[1]/div[2]/div/div[1]/section[4]/section/div/span")
	WebElement selectRooms;
	
	@FindBy(xpath="//*[@id=\"dropdown-lightbox-filter\"]/div[2]/ul/li[3]/label/span")
	WebElement selectRoomNumbers;
	
	@FindBy(xpath="/html/body/div[1]/div/div/div[2]/div[1]/div[2]/div/div[1]/section[4]/section/div[2]/button")
	WebElement clickApplyBtn;
	
	@FindBy(xpath="//*[contains(text(),'Sonuçları Göster')]")
	WebElement clickResultsBtn;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[2]/div[1]/div[2]/div[1]/div[3]/div[2]")
	WebElement clickThirdOption;
	
	
	public MobileForRentPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public MobileForRentPage click_FilterBar() throws InterruptedException
	{
		Thread.sleep(5000);
		clickFilterBar.click();
		return this;
	}
	
	public MobileForRentPage select_City() throws InterruptedException
	{
		Thread.sleep(5000);
		selectCity.click();
		return this;
	}
	
	public MobileForRentPage select_County() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.findElement(By.xpath("//section[@class='select-content']")).click();
		driver.findElement(By.xpath("//input[@class='district-search']")).sendKeys("Çankaya");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-red filter-close']")).click();
		return this;
	}
	
	
	public MobileForRentPage select_Rooms() throws InterruptedException
	{
		Thread.sleep(6000);
		selectRooms.click();
		Thread.sleep(2000);
		selectRoomNumbers.click();
		Thread.sleep(2000);
		clickApplyBtn.click();
		return this;
	}
	
	public MobileForRentPage select_Results() throws InterruptedException
	{
		Thread.sleep(3000);
		clickResultsBtn.click();
		return this;
	}
	
	public MobileListingDetailPage click_ThirdOption() throws InterruptedException
	{
		MobileListingDetailPage mldp = new MobileListingDetailPage(driver);
		Thread.sleep(9000);
		clickThirdOption.click();
		return mldp;
	}
}
