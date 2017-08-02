package TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestOutlookIntegration extends TestIntegration
{
	
	WebDriver driver;
	
	@Test
	public void IntegrationVerification() throws Exception
	{
		super.IntegrationVerification();
	}

	@Override
	public void verifyStatus()
	{
		ing.Integration_staus_OutlookMail();
		System.out.println("Outlook Mail Integration is done");

	}

	@Override
	public void provideUserDetails()
	{
		
	     ing.OutlookUnameCredentials("dhonisuri@outlook.com");
	     ing.Outlooksendemptykeys();
	     try 
	     {
			Thread.sleep(6000);
		 } 
	     catch (InterruptedException e) 
	     {
			// TODO Auto-generated catch block
			e.printStackTrace();
		 }
	   
	     ing.OutlookPsdnameCredentials("msd@1234");
	     ing.OutlookSignin();
	}

	@Override
	public void selectAccount() 
	{
	ing.OutlookIcon();
	}

}
