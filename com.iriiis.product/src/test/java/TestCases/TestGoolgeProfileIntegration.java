package TestCases;

import org.testng.annotations.Test;

public class TestGoolgeProfileIntegration extends TestIntegration
{
 @Test
 public void IntegrationVerification() throws Exception
 {
	 super.IntegrationVerification();
 }
	@Override
	public void verifyStatus() 
	{
		ing.Integration_staus_googleprofile();
		System.out.println("google profile done");
	}

	@Override
	public void provideUserDetails() 
	{
		ing.Gmailuser("dhonisuri1990@gmail.com");
		ing.Next();
		ing.Gmailpassword("msd@1234");
		ing.Next1();
	}

	@Override
	public void selectAccount() 
	{
		ing.ProfileTab();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ing.GoogleProfileIcon();
		
	}

}
