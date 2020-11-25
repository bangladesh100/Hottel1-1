package com.action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.element.Elementhotels;

import utilities.SetupDriver;

public  class ActionClass {
    
	Elementhotels loginTest;
	
     WebDriver driver;
     
	public ActionClass( ) {
		
		this.loginTest = new Elementhotels();
		PageFactory.initElements(SetupDriver.driver, loginTest);

	}

	// application URL

	public void hotelsbooking() {
		SetupDriver.driver.get("https://www.hotels.com/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		//String title = SetupDriver.driver.getTitle();
		//return title;

	}

	
	public void selectDestination() {
		loginTest.destination.click();
	}
	
	
	public void closeDestination() {
		loginTest.destinationclose.click();
		
	}
	
	public void selectCheckin() {
		loginTest.checkin.click();
	}
	
	public void closeCheckin() {
		loginTest.checkinclose.click();
	}
	
	public void selectChechOut() {
		loginTest.checkout.click();
	}
	
	public void closeChechOut() {
		loginTest.checkoutclose.click();
	}
	
	public void selectSearch() {
		loginTest.Searchbutton.click();
	}
	
	
	
	
	
	
}


