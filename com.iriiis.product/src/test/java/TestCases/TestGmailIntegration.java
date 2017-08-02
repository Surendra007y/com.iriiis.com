package TestCases;

import org.testng.annotations.Test;

public class TestGmailIntegration extends TestIntegration 
{

	@Test
	public void IntegrationVerification() throws Exception 
	{
		super.IntegrationVerification();
	}

	@Override
	public void verifyStatus() 
	{
		ing.Integration_staus_gmail();
		System.out.println("Gmail integration is done" + ":Testcase pass");

	}

	@Override
	public void provideUserDetails() 
	{

		ing.Gmailuser("surendra.n2125@gmail.com");
		ing.Next();
		ing.Gmailpassword("msd@123456");
		ing.Next1();
//		ing.AllowButton();

	}

	@Override
	public void selectAccount() 
	{
		 ing.Gmailaccount();
		 ing.Clickimport();
	}

}
