package com.element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Elementhotels {

	@FindBy(xpath = ("//*[@name='q-destination']"))
	public WebElement destination;

	@FindBy(xpath = ("//body[@data-os-imp='pageImpression']"))
	public WebElement destinationclose;

	@FindBy(name=("q-localised-check-in"))
	  
	public WebElement checkin;

	@FindBy(xpath=("//body[@class='LTR']"))
	
	public WebElement checkinclose;

	@FindBy( id=("widget-query-label-4"))
	public WebElement checkout;
	
	@FindBy(xpath=("//body[@class='LTR']"))
	public WebElement checkoutclose;
     
	@FindBy(xpath=("//*[@class='cta cta-strong']"))
	public WebElement Searchbutton;

}
