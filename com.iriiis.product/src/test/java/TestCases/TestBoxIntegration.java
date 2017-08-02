package TestCases;

import org.testng.annotations.Test;

public class TestBoxIntegration extends TestIntegration
{
  @Test
 public void IntegrationVerification() throws Exception
  {
	  super.IntegrationVerification();
  }
	@Override
	public void verifyStatus() 
	{
	
		ing.Integration_staus_box();
		System.out.println("box done");
	}

	@Override
	public void provideUserDetails() 
	{
		ing.boxCredentails("surendra.n2125@gmail.com", "msd@123456");
		ing.ClickBoxGrantAccess();
	}

	@Override
	public void selectAccount() 
	{
	ing.DoucmentsTab();
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	ing.BoxIcon();
		
	}

}
