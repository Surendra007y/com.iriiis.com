package TestCases;

import org.openqa.selenium.support.PageFactory;

import com.iriiis.product.com.iriiis.product.QuickCalendarEvent;

import BaseClass.BaseClass;

public class QuickeventTesting extends BaseClass
{
   public void Event_validation()
   {
	   login("ziva1", "msd@12345");
	   QuickCalendarEvent QuickCalendarEvent=PageFactory.initElements(driver, QuickCalendarEvent.class);

   }
}
