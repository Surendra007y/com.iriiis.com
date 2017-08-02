package TestCases;

import org.testng.annotations.Test;

public class TestDropboxIntegartion extends TestIntegration
{
    @Test
	public void IntegrationVerification() throws Exception
	{
		super.IntegrationVerification();
	}
	@Override
	public void verifyStatus() 
	{
		ing.Integration_staus_dropbox();
		System.out.println("Dropbox done");
		
	}

	@Override
	public void provideUserDetails() 
	{
		ing.DropboxCredentails("surendra.n2125@gmail.com","msd@123456");
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
		ing.DropboxIcon();
		
	}

}
