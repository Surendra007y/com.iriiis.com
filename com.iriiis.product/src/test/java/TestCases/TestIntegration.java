package TestCases;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.support.PageFactory;

import com.iriiis.product.com.iriiis.product.IntegrationPage;

import BaseClass.BaseClass;

public abstract class TestIntegration extends BaseClass 
{
	public IntegrationPage ing = null;
	public void IntegrationVerification() throws Exception 
	{
		login("sivagami", "msd@1234");
		ing = PageFactory.initElements(driver, IntegrationPage.class);
		String parent_window = driver.getWindowHandle();
		System.out.println("parent window is " + parent_window);
		ing.Hovermenu();
		ing.Ecosystem();
		selectAccount();
		Thread.sleep(3000);
		Set<String> s1 = driver.getWindowHandles();
		System.out.println("all windows are " + s1);
		Iterator<String> i1 = s1.iterator();
		while (i1.hasNext()) {
			String child_Window = i1.next();
			System.out.println("child wind is " + child_Window);
			if (!parent_window.equalsIgnoreCase(child_Window)) {
				driver.switchTo().window(child_Window);
				System.out.println("switched to child wind " + child_Window);
				Thread.sleep(5000);
				provideUserDetails();
				Thread.sleep(3000);
			}
		}
		driver.switchTo().window(parent_window);
		System.out.println("swithed to parentwindow");
		verifyStatus();
		}

	public abstract void verifyStatus();

	public abstract void provideUserDetails();

	public abstract void selectAccount();
	
}
