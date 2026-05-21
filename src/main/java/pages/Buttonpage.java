package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Baselibrary;

public class Buttonpage extends Baselibrary
{
	
	public Buttonpage() 
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[text()=\"×\"]")
	private WebElement close;
	
	@FindBy(xpath="//a[@href=\"newdemo.html\"]")
	private WebElement practice;
	
	@FindBy(xpath="//button[@class=\"btn btn-block p-0 text-left\"]")
	private WebElement element;
	
	@FindBy(xpath="//a[@href=\"#tab_5\"]")
	private WebElement button;
	
	@FindBy(xpath="//button[@ondblclick=\"doubletext()\"]")
	private WebElement doubleclick;
	
	@FindBy(xpath="//button[@oncontextmenu=\"righttext()\"]")
	private WebElement rightclick;
	
	@FindBy(xpath="//button[@onclick=\"clicktext()\"]")
	private WebElement clickme;
	
	public void clickonclose() 
	{
		waitforclick(close);
		//close.click();
	}
	
	public void clickonpractice() 
	{
		
		practice.click();
	}
	
	public void clickonelement() 
	{
		element.click();
	}
	
	public void clickonbutton() 
	{
		button.click();
	}
	
	public void doubleclick() 
	{
		doubleclickonelement(doubleclick);
	}
	
	public void rightclick() 
	{
		rightclickonelement(rightclick);
	}
	
	public void clickme() 
	{
		normalclickonelement(clickme);
	}

}
