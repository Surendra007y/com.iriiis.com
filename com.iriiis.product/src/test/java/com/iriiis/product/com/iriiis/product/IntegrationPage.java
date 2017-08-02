package com.iriiis.product.com.iriiis.product;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IntegrationPage 
{
	WebDriver driver;
	WebDriver wait;

	public IntegrationPage(WebDriver driver) 
	{
		this.driver = driver;
	}
	
	//Google mail Integration Process

	@FindBy(xpath="//*[@id='Map']/area")
	@CacheLookup
	WebElement hover_Menu;
	
	@FindBy(xpath="//div[2]/button[2]")
	@CacheLookup
	WebElement eco_System;
	
	@FindBy(xpath="//img[@src='img/gmail.png']")
	@CacheLookup
	WebElement gmail_Account;
	
	@FindBy(xpath="//button[text()='Yes']")
	@CacheLookup
	WebElement import_yes;
	
	@FindBy(xpath="//*[@id='identifierId']")
	@CacheLookup
	WebElement gmail_user;
	
	@FindBy(xpath="//*[@id='identifierNext']")
	@CacheLookup
	WebElement next;
	
	@FindBy(name="password")
	@CacheLookup
	WebElement gmail_password;
	
	@FindBy(id="passwordNext")
	@CacheLookup
	WebElement next1;
	
	@FindBy(xpath="//*[@id='submit_approve_access']/content/span")
	@CacheLookup
	WebElement allow_Button;
	
	//Integration Status for GoogleEmail
	@FindBy(xpath="//div/img[@ng-src='img/gmail.png'][@class='integrated-service__product-img']/following::div[5]")
	@CacheLookup
	WebElement gmail_Done;
	
	//Integration Status for OutlookMail
	
	@FindBy(xpath="//img[@src='img/outlook.png']")
	@CacheLookup
	WebElement outlook_Icon;
	
	@FindBy(xpath="//input[@name='login']")
	@CacheLookup
	WebElement outlookUname_Credentails;
	
		
	
	@FindBy(xpath="//input[@name='passwd']")
	@CacheLookup
	WebElement outlookpsd_credentials;

	@FindBy(xpath="//input[@type='password']")
	@CacheLookup
	WebElement outlookpsd1_credentials;

	
	@FindBy(xpath="//input[@id='idSIButton9']")
	@CacheLookup
	WebElement outlook_Signinbutton;
	
	@FindBy(xpath="//div/img[@ng-src='img/outlook.png'][@class='integrated-service__product-img']/following::div[5]")
	@CacheLookup
	WebElement outlook_Done;
	
	//Integration status for GoogleCalendar
	
	@FindBy(xpath="//md-pagination-wrapper/md-tab-item[6]")
	@CacheLookup
	WebElement calendar_Tab;
	
	@FindBy(xpath="//img[@src='img/google_calendar.png']")
	@CacheLookup
	WebElement google_CalendarIcon;
	
	@FindBy(xpath="//div/img[@ng-src='img/google_calendar.png'][@class='integrated-service__product-img']/following::div[5]")
	@CacheLookup
	WebElement gcal_Done;
	
	//Integration status for GoogleContacts
	
	@FindBy(xpath="//md-pagination-wrapper/md-tab-item[3]")
	@CacheLookup
	WebElement contacts_Tab;
	
	@FindBy(xpath="//img[@src='img/google_contacts.png']")
	@CacheLookup
	WebElement google_ContactsIcon;
	
	@FindBy(xpath="//div/img[@ng-src='img/google_contacts.png'][@class='integrated-service__product-img']/following::div[5]")
	@CacheLookup
	WebElement gcontact_Done;
	
	//Integration status for GoogleProfile
	
	@FindBy(xpath="//md-pagination-wrapper/md-tab-item[7]")
	@CacheLookup
	WebElement profile_Tab;
	
	@FindBy(xpath="//img[@src='img/google_profile.png']")
	@CacheLookup
	WebElement google_ProfileIcon;
	
	@FindBy(xpath="//div/img[@ng-src='img/google_profile.png'][@class='integrated-service__product-img']/following::div[5]")
    @CacheLookup
	WebElement gprofile_Done;
	
	//Google Drive Integration Process
	@FindBy(xpath="//md-pagination-wrapper/md-tab-item[2]")
	@CacheLookup
	WebElement documents_Tab;
	
	@FindBy(xpath="//img[@src='img/google_drive.png']")
	@CacheLookup
	WebElement google_DoucmentsIcon;
	
	@FindBy(xpath="//div/img[@ng-src='img/google_drive.png'][@class='integrated-service__product-img']/following::div[5]")
	@CacheLookup
	WebElement gdocs_Done;
	
	//Dropbox Integration process
	
	@FindBy(xpath="//input[@name='login_email']")
	@CacheLookup
	WebElement dropbox_Username;
	
	@FindBy(xpath="//input[@name='login_password']")
	@CacheLookup
	WebElement dropbox_Password;
	
	@FindBy(xpath="//div[text()='Sign in']")
	@CacheLookup
	WebElement dropbox_Clicksign;
	
	@FindBy(xpath="//img[@src='img/dropbox.png']")
	@CacheLookup
	WebElement dropbox_Icon;
	
	@FindBy(xpath="//div/img[@ng-src='img/dropbox.png'][@class='integrated-service__product-img']/following::div[5]")
	@CacheLookup
	WebElement dropbox_Done;
	
	//Box Integration Process
	
	@FindBy(xpath="//input[@id='login']")
	@CacheLookup
	WebElement box_Username;
	
	@FindBy(xpath="//input[@id='password']")
	@CacheLookup
	WebElement box_Password;
	
	@FindBy(xpath="//input[@title='Authorize']")
	@CacheLookup
	WebElement box_signclick;
	
	@FindBy(xpath="//span[text()='Grant access to Box']")
	@CacheLookup
	WebElement box_Grantaccess;
	
	@FindBy(xpath="//img[@src='img/box.png']")
	@CacheLookup
	WebElement box_Icon;
	
	@FindBy(xpath="//div/img[@ng-src='img/box.png'][@class='integrated-service__product-img']/following::div[5]")
	@CacheLookup
	WebElement box_Done;
	
	//Onedrive Integration Process
	
	@FindBy(xpath="//img[@src='img/one_drive.png']")
	@CacheLookup
	WebElement onedrive_Icon;
	
	@FindBy(xpath="//input[@name='loginfmt']")
	@CacheLookup
	WebElement onedrive_Uname;
	
	@FindBy(xpath="//input[@type='submit']")
	@CacheLookup
	WebElement onedrive_Next;
	
	@FindBy(xpath="//input[@name='passwd']")
	@CacheLookup
	WebElement onedrive_Psd;
	
	@FindBy(xpath="//input[@id='idSIButton9']")
	@CacheLookup
	WebElement onedrive_Signin;
	
	@FindBy(xpath="//div/img[@ng-src='img/one_drive.png'][@class='integrated-service__product-img']/following::div[5]")
	@CacheLookup
	WebElement onedrive_Done;
	
	//EverNote Integration Process
	@FindBy(xpath="//md-pagination-wrapper/md-tab-item[4]")
	@CacheLookup
	WebElement note_Tab;
	
	@FindBy(xpath="//img[@src='img/evernote.png']")
	@CacheLookup
	WebElement evernote_Icon;
	
	@FindBy(xpath="//input[@name='username']")
	@CacheLookup
	WebElement evernote_Username;
	
	@FindBy(xpath="//input[@id='loginButton']")
	@CacheLookup
	WebElement evernote_clickContinue;
	
	@FindBy(xpath="//input[@id='password']")
	@CacheLookup
	WebElement evernote_Password;
	
	@FindBy(xpath="//input[@id='loginButton']")
	@CacheLookup
	WebElement evernote_Signinbutton;
	
	@FindBy(xpath="//input[1][@name='reauthorize']")
	@CacheLookup
	WebElement evernote_authorizeClick;
	
	@FindBy(xpath="//div/img[@ng-src='img/evernote.png'][@class='integrated-service__product-img']/following::div[5]")
	@CacheLookup
	WebElement note_Done;
	
	
	
	//If needed click on credentials:If necessary use in test case
	@FindBy(xpath="//p[@role='presentation']")
	@CacheLookup
	WebElement credentails_click;
	
	public void Credentailsclick()
	{
		credentails_click.click();
	}

	public void Hovermenu()
	{
		hover_Menu.click();
	}
	public void Ecosystem()
	{
		eco_System.click();
	}
	public void Gmailaccount()
	{
		gmail_Account.click();
	}
	public void Clickimport()
	{
		import_yes.click();
	}
	
	public void Gmailuser(String gmailuname)
	{
		gmail_user.sendKeys(gmailuname);
	}
	public void Next()
	{
		next.click();
	}
	public void Gmailpassword(String gmailpsd)
	{
		gmail_password.sendKeys(gmailpsd);
	}
	public void Next1()
	{
		next1.click();
	}
	public void AllowButton()
	{
		allow_Button.click();
	}
	public void DoucmentsTab()
	{
		documents_Tab.click();
	}
	public void GoogleDocsIcon()
	{
		google_DoucmentsIcon.click();
	}
	public void ProfileTab()
	{
		profile_Tab.click();
	}
	public void GoogleProfileIcon()
	{
		google_ProfileIcon.click();
	}
	
	public void CalendarTab()
	{
		calendar_Tab.click();
	}
	
	public void GoogleCalendarIcon()
	{
		google_CalendarIcon.click();
	}
	
	public void ContactsTab()
	{
		contacts_Tab.click();
	}
	public void GoogleContactsIcon()
	{
		google_ContactsIcon.click();
	}
	public void DropboxIcon()
	{
		dropbox_Icon.click();
	}
	public void DropboxCredentails(String dbuname,String dbpsd)
	{
		dropbox_Username.sendKeys(dbuname);
		dropbox_Password.sendKeys(dbpsd);
		dropbox_Clicksign.click();
	}
	public void boxCredentails(String boxuname,String boxpsd)
	{
		box_Username.sendKeys(boxuname);
		box_Password.sendKeys(boxpsd);
		box_signclick.click();
	}
	
	public void ClickBoxGrantAccess()
	{
		box_Grantaccess.click();
	}
	public void BoxIcon()
	{
		box_Icon.click();
	}
	public void EeverNoteUnameCredentails(String noteuname)
	{
		evernote_Username.sendKeys(noteuname);
		evernote_clickContinue.click();
		
	}
	public void EeverNotePsdCredentails(String notepsd)
	{
	evernote_Password.sendKeys(notepsd);
	evernote_Signinbutton.click();
	}
	public void EeverNoteAuthorizeClick()
	{
		evernote_authorizeClick.click();
	}
	public void NoteTab()
	{
		note_Tab.click();
	}
	
	public void EverNoteoteIcon()
	{
	    evernote_Icon.click();
	}
	public void OnedriveIcon()
	{
		onedrive_Icon.click();
	}
	
	public void OnedriveUnameCredentials(String OneUname)
	{
		onedrive_Uname.sendKeys(OneUname);
	}
	
	public void OnedriveNext()
	{
		onedrive_Next.click();
	}
	public void OnedrivepsdCredentials(String Onepsd)
	{
		onedrive_Psd.sendKeys(Onepsd);
		onedrive_Signin.click();
	}
	public void OutlookIcon()
	{
	outlook_Icon.click();	
	}
	public void OutlookUnameCredentials(String OutUname)
	{
		outlookUname_Credentails.sendKeys(OutUname);
	}
	public void Outlooksendemptykeys()
	{
		outlookpsd_credentials.click();
	}
	public void OutlookPsdnameCredentials(String OutPsd)
	{
		outlookpsd1_credentials.sendKeys(OutPsd);
	}
	public void OutlookSignin()
	{
		outlook_Signinbutton.click();
	}
	
	public void Integration_staus_gmail()
	{
		
		WebDriverWait wait=new WebDriverWait(driver,160);
	    wait.until(ExpectedConditions.textToBePresentInElement(gmail_Done, "Done"));
	}
	public void Integration_staus_OutlookMail()
	{
		
		WebDriverWait wait=new WebDriverWait(driver,160);
	    wait.until(ExpectedConditions.textToBePresentInElement(outlook_Done, "Done"));
	}
	
	public void Integration_staus_googledrive()
	{
		WebDriverWait wait=new WebDriverWait(driver,160);
	    wait.until(ExpectedConditions.textToBePresentInElement(gdocs_Done, "Done"));
	}
	public void Integration_staus_googleprofile()
	{
		WebDriverWait wait=new WebDriverWait(driver,160);
	    wait.until(ExpectedConditions.textToBePresentInElement(gprofile_Done, "Done"));
	}
	public void Integration_staus_googlecontacts()
	{
		WebDriverWait wait=new WebDriverWait(driver,160);
	    wait.until(ExpectedConditions.textToBePresentInElement(gcontact_Done, "Done"));
	}
	
	public void Integration_staus_googlecalendar()
	{
		WebDriverWait wait=new WebDriverWait(driver,160);
	    wait.until(ExpectedConditions.textToBePresentInElement(gcal_Done, "Done"));
	}
    
	public void Integration_staus_dropbox()
	{
		WebDriverWait wait=new WebDriverWait(driver,160);
	    wait.until(ExpectedConditions.textToBePresentInElement(dropbox_Done, "Done"));
	}

	 public void Integration_staus_box()
	{
			WebDriverWait wait=new WebDriverWait(driver,160);
		    wait.until(ExpectedConditions.textToBePresentInElement(box_Done, "Done"));
	}
	 
	public void Integration_staus_Onedrive()
	 {
				WebDriverWait wait=new WebDriverWait(driver,160);
			    wait.until(ExpectedConditions.textToBePresentInElement(onedrive_Done, "Done"));
	 }
	public void Integration_staus_Evernote()
	 {
				WebDriverWait wait=new WebDriverWait(driver,160);
			    wait.until(ExpectedConditions.textToBePresentInElement(note_Done, "Done"));
	 }
	
}

	
	
	
	
	
	
	






