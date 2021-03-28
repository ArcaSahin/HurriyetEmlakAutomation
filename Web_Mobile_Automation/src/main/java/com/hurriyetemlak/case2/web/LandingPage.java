package com.hurriyetemlak.case2.web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hurriyetemlak.case2.web.ForRentPage;

public class LandingPage {

		public WebDriver driver;
		WebElement element;
		
		@FindBy(xpath="//img[@src='/_nuxt/img/kiralik.1359811.svg']")
		WebElement kiralikBtn;
		
		public LandingPage(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		public ForRentPage click_forRent()
		{
			ForRentPage frp = new ForRentPage(driver);
			kiralikBtn.click();
			return frp;
		}
}
