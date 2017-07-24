package com.iriiis.product.com.iriiis.product;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateTodo 
{
	WebDriver driver;
	public CreateTodo(WebDriver Idriver)
	{
		PageFactory.initElements(Idriver, this);
		this.driver = Idriver;
		
	}
	
@FindBy(xpath="//div[2]/ir-card[2]/ir-card-header/button/md-icon")
@CacheLookup
WebElement Todo_Toggle;

@FindBy(xpath="//input[@ng-model='todo.name']")
@CacheLookup
WebElement Todo_Name;

@FindBy(xpath="//textarea[@ng-model='todo.deliverables']")
@CacheLookup
WebElement Deliverables;

@FindBy(xpath="//input[@name='assignee']")
@CacheLookup
WebElement Assignee;

@FindBy(xpath="//div[contains(@class, 'external-invite-tmpl')][1]")
@CacheLookup
WebElement Assignee_contactchip;

@FindBy(xpath="//form/md-dialog-actions/button[2]")
@CacheLookup
WebElement Save_Todo;

public void TodoDetails(String Title, String Description, String Assign_name) throws Exception
{
	Todo_Toggle.click();
	Todo_Name.sendKeys(Title);
	Deliverables.sendKeys(Description);
	Assignee.clear();
	Assignee.sendKeys(Assign_name);
	Thread.sleep(3000);
	Assignee_contactchip.click();
    Thread.sleep(3000);
	try {
		Alert A=driver.switchTo().alert();
		WebDriverWait wait=new WebDriverWait(driver,20);
	    if(wait.until(ExpectedConditions.alertIsPresent())!= null)
	    {
	    	A.accept();
	    }
	    } 
	catch (Exception e) 
	    {
		System.out.println("no alert is displayed");
	    }
	Save_Todo.click();
	
}
}

