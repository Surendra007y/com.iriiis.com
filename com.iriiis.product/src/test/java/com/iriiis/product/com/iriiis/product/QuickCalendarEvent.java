package com.iriiis.product.com.iriiis.product;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QuickCalendarEvent
{
	WebDriver driver;
	public QuickCalendarEvent(WebDriver Idriver)
	{
		PageFactory.initElements(Idriver, this);
		this.driver = Idriver;
	}
		@FindBy(xpath="//div[2]/ir-card[1]/ir-card-header/button/md-icon")
	    @CacheLookup
	    WebElement Quick_event;
		
		@FindBy(id="input_637")
		@CacheLookup
		WebElement Enter_event;
		
		@FindBy(xpath="//md-dialog-actions/button")
		@CacheLookup
		WebElement Click_create;
		
		@FindBy(xpath="//div[2]/ir-card[1]/ir-card-header")
		@CacheLookup
		WebElement Calendar_Module;
	
	public void EnterName(String Details)
{
	Quick_event.click();
	Enter_event.sendKeys(Details);
	Click_create.click();
}
	
}
