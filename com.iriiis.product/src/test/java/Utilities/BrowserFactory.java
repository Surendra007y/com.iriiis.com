package Utilities;

import java.util.concurrent.TimeUnit;

import org.omg.CORBA.TIMEOUT;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory 
{
	static WebDriver driver;
	public static WebDriver startbrowser(String browserName,String url)
	{
      if(browserName.equalsIgnoreCase("Firefox"))	
      {
    	  driver=new FirefoxDriver();
      }
      else if(browserName.equalsIgnoreCase("chrome"))
      {
    	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium chrome driver\\chromedriver.exe");
    	  driver=new ChromeDriver();
      }
    	else if(browserName.equalsIgnoreCase("IE"))
    	{
    		driver=new InternetExplorerDriver();
    	}
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
      driver.get(url);
      return driver;
	}
       public static void closeBrowser()
       {
    	   
    	 driver.quit();  
       }

	
}
