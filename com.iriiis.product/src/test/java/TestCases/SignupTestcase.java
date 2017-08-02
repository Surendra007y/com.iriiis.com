package TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.iriiis.product.com.iriiis.product.ChangePasswordPage;
import com.iriiis.product.com.iriiis.product.ProfilePage;
import com.iriiis.product.com.iriiis.product.Signup;

import BaseClass.BaseClass;

public class SignupTestcase extends BaseClass
{

	@Test
	public void Signup_Validation() throws Exception
	{
		Signup signupobj =PageFactory.initElements(driver, Signup.class);
		signupobj.Signup_Details("MsDhoni", "Mahi", "zivadhoni210411", "dhonisuri1990+00000000000012@gmail.com", "msd@1234");
		Thread.sleep(3000);
		ProfilePage profilePage1 = PageFactory.initElements(driver, ProfilePage.class);
		profilePage1.clickprofileicon();
		ChangePasswordPage obj1 = PageFactory.initElements(driver, ChangePasswordPage.class);
		obj1.Logout();
	}
	
}
