package TestCases;

import org.testng.annotations.Test;

public class TestOnedriveIntegration extends TestIntegration
{
	@Test
	public void IntegrationVerification() throws Exception
	{
		super.IntegrationVerification();
	}

	@Override
	public void verifyStatus()
	{
		ing.Integration_staus_Onedrive();
		System.out.println("Onedrive Integration is done");
	}

	@Override
	public void provideUserDetails()
	{
	
		ing.OnedriveUnameCredentials("dhonisuri@outlook.com");
		ing.OnedriveNext();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ing.OnedrivepsdCredentials("msd@1234");
	}

	@Override
	public void selectAccount() 
	{
	ing.DoucmentsTab();
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	ing.OnedriveIcon();
		
	}

}
