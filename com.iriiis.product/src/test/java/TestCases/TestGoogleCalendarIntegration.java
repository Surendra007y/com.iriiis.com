package TestCases;

import org.testng.annotations.Test;

public class TestGoogleCalendarIntegration extends TestIntegration
{

	@Test
	public void IntegrationVerification() throws Exception 
	{
		super.IntegrationVerification();
	}
	@Override
	public void verifyStatus()
	{
		ing.Integration_staus_googlecalendar();
		System.out.println("google calendar done");
		
	}

	@Override
	public void provideUserDetails() 
	{
		ing.Gmailuser("zivadhoni11@gmail.com");
		ing.Next();
		ing.Gmailpassword("msd@12345");
		ing.Next1();
		
	}

	@Override
	public void selectAccount() 
	{
		ing.CalendarTab();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ing.GoogleCalendarIcon();
		
	}

}
