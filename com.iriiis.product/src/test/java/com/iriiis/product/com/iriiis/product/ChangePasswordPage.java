/**
 * 
 */
package com.iriiis.product.com.iriiis.product;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.BrowserFactory;

/**
 * @author Surendra
 *
 */
public class ChangePasswordPage 
{
	WebDriver driver;
	WebDriver wait;

	public ChangePasswordPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = "//md-menu-item[2]/a")
	@CacheLookup
	WebElement Preferences;

	@FindBy(xpath = "//section[1]/ul/li[2]")
	@CacheLookup
	WebElement Account;

	// Send keys for current password
	@FindBy(xpath = "//article[2]/form/p/input[1]")
	@CacheLookup
	WebElement Current_passowrd;

	// Send keys for New password
	@FindBy(xpath = "//article[2]/form/p/input[2]")
	@CacheLookup
	WebElement New_password;

	// Click on save button
	@FindBy(xpath = "//article[2]/form/div/button")
	@CacheLookup
	WebElement Save_button;

	// WebElement for Logout
	@FindBy(xpath = "//md-menu-item[5]/button")
	@CacheLookup
	WebElement Log_out;

	public void EnterDetails(String oldpsd, String newpsd) {
		Preferences.click();
		Account.click();
		Current_passowrd.sendKeys(oldpsd);
		New_password.sendKeys(newpsd);
		Save_button.click();
	}

	public void Logout()

	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Log_out.click();
	}

}
