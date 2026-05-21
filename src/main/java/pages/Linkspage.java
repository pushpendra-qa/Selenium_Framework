package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Baselibrary;

public class Linkspage extends Baselibrary
{
	public Linkspage() 
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[text()=\"×\"]")
	private WebElement close;
	
	@FindBy(xpath="//a[@href=\"newdemo.html\"]")
	private WebElement practice;
	
	@FindBy(xpath="//button[@data-target=\"#elements\"]")
	private WebElement element;
	
	@FindBy(xpath="//a[@href=\"#tab_6\"]")
	private WebElement links;
	
	@FindBy(xpath="//a[@target=\"_blank\" and @href=\"index.html\"]")
	private WebElement demo;
	
	public void clickonclose() throws InterruptedException 
	{
		close.click();
		Thread.sleep(2000);
	}
	
	public void clickonpractice() 
	{
		practice.click();
	}
	
	public void clickonelement() 
	{
		element.click();
	}
	
	public void clickonlinks() 
	{
		links.click();
	}
	
	public void clickondemo() 
	{
		demo.click();
	}
	
	public void clickonclosenewtab() throws InterruptedException 
	{
		navigatetonewtab(1);
		close.click();
		Thread.sleep(2000);
		navigatetonewtab(0);
		
	}

}
