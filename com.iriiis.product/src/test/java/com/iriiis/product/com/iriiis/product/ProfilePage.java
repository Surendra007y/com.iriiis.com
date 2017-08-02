/**
 * 
 */
package com.iriiis.product.com.iriiis.product;

import static org.testng.Assert.assertEquals;

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

public class ProfilePage

{

	WebDriver driver;

	public ProfilePage(WebDriver Idriver) 
	{
		PageFactory.initElements(Idriver, this);
		this.driver = Idriver;
	}

	@FindBy(xpath = "//md-menu[@class='profile-menu md-menu ng-scope _md']/button/md-icon")
	@CacheLookup
	WebElement ProfileIcon;

	@FindBy(xpath = "//md-menu-item[1]/a")
	@CacheLookup
	WebElement profile;

	@FindBy(xpath = "//div[@class='profile-dialog__label small ng-binding']")
	@CacheLookup
	WebElement profileName;

	@FindBy(xpath = "//*[@id='signin-password-error']")
	@CacheLookup
	WebElement Capture_InvalidPassword;

	public void clickprofileicon() 
	{
		ProfileIcon.click();

	}

	public void clickprofile() {
		profile.click();
		try {
			Thread.sleep(5000);
		} catch (Exception e) {

		}
		String username = profileName.getText();
		System.out.println("The user name is " + username);
		assertEquals(username, "sivagami@iriiisdev.com");

	}

	public void CaptureInvalidPassword() {
		Capture_InvalidPassword.getText();
	}

}
