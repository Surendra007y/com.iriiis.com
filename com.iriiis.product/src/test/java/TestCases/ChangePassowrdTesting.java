package TestCases;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.iriiis.product.com.iriiis.product.ChangePasswordPage;
import com.iriiis.product.com.iriiis.product.ProfilePage;

import BaseClass.BaseClass;

public class ChangePassowrdTesting extends BaseClass 
{

	@Test(description = "Changing the User Password")
	public void Changepassword() throws Exception {
		String user = "ziva1";
		String oldPassword = "msd@12345";
		login(user, oldPassword);
		ProfilePage profilePage = PageFactory.initElements(driver, ProfilePage.class);
		profilePage.clickprofileicon();

		//System.out.println("profile clicked");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Calling the change password page method

		ChangePasswordPage obj = PageFactory.initElements(driver, ChangePasswordPage.class);
		String newpsd = "msd@1234";
		obj.EnterDetails(oldPassword, newpsd);
		System.out.println("Password Reset Successfull");
		profilePage.clickprofileicon();
		obj.Logout();
		try 
		{
			Thread.sleep(3000);
		} catch (Exception e) 
		{

		}
		login(user, oldPassword);
        Thread.sleep(5000);
		getLoginPage().CaptureInvalidPassword();
		Thread.sleep(3000);
		login(user, newpsd);
		System.out.println("Login with new passowrd successfull");
		Thread.sleep(3000);
		ProfilePage profilePage1 = PageFactory.initElements(driver, ProfilePage.class);
		profilePage1.clickprofileicon();
		Thread.sleep(3000);
		ChangePasswordPage obj1 = PageFactory.initElements(driver, ChangePasswordPage.class);
		obj1.Logout();
		}

}
