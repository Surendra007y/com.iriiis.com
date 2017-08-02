
package TestCases;

import org.testng.annotations.Test;

public class TestGoogleContactIntegration extends TestIntegration
{
 @Test
 public void IntegrationVerification() throws Exception
 {
	 super.IntegrationVerification();
 }
	@Override
	public void verifyStatus() 
	{
		ing.Integration_staus_googlecontacts();
		System.out.println("google contacts done");

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
		ing.ContactsTab();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ing.GoogleContactsIcon();
		
	}

}
