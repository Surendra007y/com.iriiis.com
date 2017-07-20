/**
 * 
 */
package com.iriiis.product.com.iriiis.product;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Surendra
 *
 */

public class LoginPage

{

	WebDriver driver;

	public LoginPage(WebDriver Idriver) {
		PageFactory.initElements(Idriver, this);
		this.driver = Idriver;
	}

	@FindBy(id = "signInUsername")
	@CacheLookup
	WebElement Username;

	@FindBy(id = "signInPassword")
	@CacheLookup
	WebElement Password;

	@FindBy(how = How.XPATH, using = "//button[@type='submit']")
	@CacheLookup
	WebElement login;

	@FindBy(xpath = "//*[@id='signin-password-error']")
	@CacheLookup
	WebElement Capture_InvalidPassword;

	public void login_Iriiis(String uid, String psd) 
	{
		Username.clear();
		Password.clear();
		Username.sendKeys(uid);
		Password.sendKeys(psd);
		login.click();

	}

	public void CaptureInvalidPassword() {
		String msg = Capture_InvalidPassword.getText();
		System.out.println("TestCase Passed"+msg);
	}

}
