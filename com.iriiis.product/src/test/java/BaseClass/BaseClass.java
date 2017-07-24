package BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.iriiis.product.com.iriiis.product.ChangePasswordPage;
import com.iriiis.product.com.iriiis.product.LoginPage;

import Utilities.BrowserFactory;

public class BaseClass 
{
	public WebDriver driver;
	private LoginPage loginPage;

	@BeforeClass
	public void SetupApplication()
	{
		Reporter.log("=====Browser Session Started=====", true);
		driver = BrowserFactory.startbrowser("Chrome", "https://iriiis.com/#!/auth");
		// Created page object using page factory
		Reporter.log("=====Application Started=====", true);
	}

	public void login(String user, String password) 
	{
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		// Calling the method
		loginPage.login_Iriiis(user, password);
	}

	public LoginPage getLoginPage()
	{
		return loginPage;
	}

	@AfterClass
	public void closeApplication()
	{
		// ChangePasswordPage obj=PageFactory.initElements(driver,
		// ChangePasswordPage.class);
		// loginPage.clickprofileicon();
		// obj.Logout();
		BrowserFactory.closeBrowser();
		Reporter.log("=====Browser Session End=====", true);
	}

}
