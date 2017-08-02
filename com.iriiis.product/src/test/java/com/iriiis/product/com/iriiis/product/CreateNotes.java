package com.iriiis.product.com.iriiis.product;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CreateNotes
{
@FindBy(xpath="//div[3]/ir-card[2]/ir-card-header/div")
@CacheLookup
WebElement notes_Module;

@FindBy(xpath="//md-icon[@class='ng-scope md-font material-icons add']")
@CacheLookup
WebElement toogle_Button;

@FindBy(xpath="//button[@ng-click='createNotebook()']")
@CacheLookup
WebElement click_Notebook;

@FindBy(xpath="//input[@name='notebookName']")
@CacheLookup
WebElement notebook_name;


}