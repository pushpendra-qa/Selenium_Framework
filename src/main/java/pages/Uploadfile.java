package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Baselibrary;

public class Uploadfile extends Baselibrary
{
	
	String path="C:\\Workspace\\AutomationPractice\\testData\\config.properties";
	public Uploadfile() 
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[text()=\"×\"]")
	private WebElement close;
	
	@FindBy(xpath="//a[@href=\"newdemo.html\"]")
	private WebElement practice;
	
	@FindBy(xpath="//button[@data-target=\"#elements\"]")
	private WebElement element;
	
	@FindBy(xpath="//a[@href=\"#tab_8\"]")
	private WebElement uploadbutton;
	
	@FindBy(xpath="//input[@id=\"File1\"]")
	private WebElement choosebutton;
	
	public void clickonclose() 
	{
		waitforclick(close);
	}
	
	public void clickonpractice() 
	{
		
		waitforclick(practice);
	}
	
	public void clickonelement() 
	{
		waitforclick(element);
		
	}
	
	public void clickonupload() 
	{
		waitforclick(uploadbutton);
	}
	
	public void clickonchoose() 
	{
		//waitforclick(choosebutton);
		//here it does not work because we need action class to handle this.
		normalclickonelement(choosebutton);
	}
	
	public void uploadfile() 
	{
		uploadfile(path);
	}

}
