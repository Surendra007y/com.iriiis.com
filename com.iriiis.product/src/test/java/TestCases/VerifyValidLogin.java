package TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.iriiis.product.com.iriiis.product.ProfilePage;

import BaseClass.BaseClass;

public class VerifyValidLogin extends BaseClass 
{
	@Test
	public void checkvaliduser() throws Exception
	{
		login("sivagami", "msd@1234");
		ProfilePage profilePage = PageFactory.initElements(driver, ProfilePage.class);
		profilePage.clickprofileicon();
		profilePage.clickprofile();
	
   }

}
