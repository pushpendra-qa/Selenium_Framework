package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Baselibrary;

public class SelectMenuPage extends Baselibrary
{
	
	public SelectMenuPage() 
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[text()=\"×\"]")
	private WebElement close;
	
	@FindBy(xpath="//a[@href=\"newdemo.html\"]")
	private WebElement practice;
	
	@FindBy(xpath="//button[@data-target=\"#widget\"]")
	private WebElement widget;
	
	@FindBy(xpath="//a[@href=\"#tab_24\"]")
	private WebElement selectmenu;
	
	@FindBy(xpath="//label[text()='Select Value']/../select")
	private WebElement dropdown1;
	
	public void clickonclose() 
	{
		waitforclick(close);
	}
	
	public void clickonpractice() 
	{
		
		waitforclick(practice);
	}
	
	public void clickonwidget() 
	{
		waitforclick(widget);
	}
	
	public void clickonselectmenu() 
	{
		waitforclick(selectmenu);
	}
	
	public void clickondropdown() 
	{
		waitforclick(dropdown1);
		//selectbytext(dropdown1, "Group 1, Option 2");
		selectbyindex(dropdown1, 3);
	}

}
