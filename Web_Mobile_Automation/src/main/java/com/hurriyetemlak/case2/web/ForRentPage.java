package com.hurriyetemlak.case2.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.hurriyetemlak.case2.web.ForRentPage;
import com.hurriyetemlak.case2.web.ListingDetailPage;

public class ForRentPage {

	WebDriver driver;
	WebElement element;
	ForRentPage frp;
	
	@FindBy(xpath="//div[@class='he-select-base__container']")
	WebElement selectCityBar;
	
	@FindBy(xpath="//input[@placeholder='İl Ara']")
	WebElement selectCityList;
	
	@FindBy(xpath="//div[@class='he-radio he-select__radio']")
	WebElement selectCityRadioBtn;
	
	@FindBy(xpath="//*[contains(text(),'İlçe Seçiniz')]")
	WebElement selectCountyBar;
	
	@FindBy(xpath="//input[@placeholder='İlçe Ara']")
	WebElement selectCountyList;
	
	@FindBy(xpath="//div[@class='he-checkbox he-multiselect__checkbox']")
	WebElement selectCountyCheckBox;
	
	@FindBy(xpath="//*[@id=\"listPage\"]/div[2]/div[2]/div/div[2]/div[1]/section[2]/div/section[6]/section/div")
	WebElement selectRoomBar;
	
	@FindBy(xpath="//*[@id=\"listPage\"]/div[2]/div[2]/div/div[2]/div[1]/section[2]/div/section[6]/section/div/div[2]/div/div/ul/li[3]/label")
	WebElement selectRoomNumbers;
	
	@FindBy(xpath="//*[@id=\"listPage\"]/div[2]/div[2]/div/div[2]/div[1]/section[2]/div/section[22]/a[1]")
	WebElement clickSearchBtn;
	
	@FindBy(id="4110-2072")
	WebElement thirdOption;
	

	public ForRentPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public ForRentPage select_City() throws InterruptedException
	{
		selectCityBar.click();
		selectCityList.sendKeys("Ankara");
		selectCityRadioBtn.click();
		Thread.sleep(3000);
		return this;
	}
	
	public ForRentPage select_County() throws InterruptedException
	{
		selectCountyBar.click();
		selectCountyList.sendKeys("Çankaya");
		Thread.sleep(2000);
		selectCountyCheckBox.click();
		Thread.sleep(2000);
		return this;
	}
	
	public ForRentPage select_Room() throws InterruptedException
	{	
		Thread.sleep(6000);
		selectRoomBar.click();
		Thread.sleep(5000);
		selectRoomNumbers.click();
		return this;
	}
	
	public ForRentPage search_All() throws InterruptedException
	{	
		Thread.sleep(5000);
		clickSearchBtn.click();
		return this;
	}
	
	public ListingDetailPage goto_ListingPage() throws InterruptedException
	{
		ListingDetailPage ldp = new ListingDetailPage(driver);
		Thread.sleep(5000);
		thirdOption.click();
		return ldp;
	}
}
