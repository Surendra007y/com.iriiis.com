package com.iriiis.product.com.iriiis.product;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signup 
{
WebDriver driver;
	public Signup(WebDriver Idriver)
	{
		PageFactory.initElements(Idriver, this);
		this.driver=Idriver;
	}

	@FindBy(linkText="Create yours now.")
	@CacheLookup
	WebElement create_Link;
	
	@FindBy(id="firstname")
	@CacheLookup
	WebElement firstName;
	
	@FindBy(id="secondname")
	@CacheLookup
	WebElement secondName;
	
	@FindBy(id="username")
	@CacheLookup
	WebElement user_Id;
	
	@FindBy(id="email")
	@CacheLookup
	WebElement current_Email_Address;
	
	@FindBy(id="password")
	@CacheLookup
	WebElement enter_Password;
	
	@FindBy(xpath="//button[contains(@class, 'md-raised md-primary btn-signup')]")
	@CacheLookup
	WebElement Signup_Button;
	
	@FindBy(xpath="//button[text()='Skip']")
	@CacheLookup
	WebElement Onboarding_skip;
	
	@FindBy(xpath="//div[@class='listOfItems__item-wrapper']")
	@CacheLookup
	WebElement mail_Welcometext;
	
	@FindBy(xpath="//div[@class='document-listOfItems__item-wrapper listOfItems__item-wrapper']")
	@CacheLookup
	WebElement document_welcometext;
	
	@FindBy(xpath="//div[@class='listOfItems__item__main-textL ng-binding ng-scope']")
	@CacheLookup
	WebElement contact_Text;
	
	@FindBy(xpath="//div[@class='capture-listOfItems__item-image capture-listOfItems__cell listOfItems__itemIcon']")
	@CacheLookup
	WebElement notes_Welcometext;
	
	public void Signup_Details(String fname,String sname, String uname, String currentemail, String signpwd) throws Exception
	{
		create_Link.click();
		firstName.sendKeys(fname);
		secondName.sendKeys(sname);
		user_Id.sendKeys(uname);
		current_Email_Address.sendKeys(currentemail);
		enter_Password.sendKeys(signpwd);
		Signup_Button.click();
		Thread.sleep(3000);
		Onboarding_skip.click();
		
		mail_Welcometext.isDisplayed();
		System.out.println("Mail welocme text is diplayed");
		document_welcometext.isDisplayed();
		System.out.println("Document welocme text is diplayed");
		contact_Text.isDisplayed();
		System.out.println("Contact is diplayed");
		notes_Welcometext.isDisplayed();
		System.out.println("Notes welocme text is diplayed");
		System.out.println("Provision is successfull");
		
	}
	
	
	
}
