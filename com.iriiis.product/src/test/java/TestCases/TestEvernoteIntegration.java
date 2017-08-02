package TestCases;

import org.testng.annotations.Test;

public class TestEvernoteIntegration extends TestIntegration
{
 @Test
 public void IntegrationVerification() throws Exception
 {
	 super.IntegrationVerification();
 }
	@Override
	public void verifyStatus() 
	{
		ing.Integration_staus_Evernote();
		System.out.println("EverNote profile done");

	}

	@Override
	public void provideUserDetails() 
	{
		ing.EeverNoteUnameCredentails("surendra.n2125@gmail.com");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ing.EeverNotePsdCredentails("msd@123456");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ing.EeverNoteAuthorizeClick();
	}

	@Override
	public void selectAccount() 
	{
		ing.NoteTab();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ing.EverNoteoteIcon();
	}

}
