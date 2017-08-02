package TestCases;

import org.testng.annotations.Test;

public class TestGoogleDriveIntegration extends TestIntegration
{
 @Test
 public void IntegrationVerification() throws Exception
 {
	 super.IntegrationVerification();
 }
	@Override
	public void verifyStatus() 
	{
		ing.Integration_staus_googledrive();
		System.out.println("google drive done");

	}

	@Override
	public void provideUserDetails() 
	{
		ing.Gmailuser("surendra.n2125@gmail.com");
		ing.Next();
		ing.Gmailpassword("msd@123456");
		ing.Next1();
	}

	@Override
	public void selectAccount() 
	{
		ing.DoucmentsTab();
		ing.GoogleDocsIcon();
	}

}
