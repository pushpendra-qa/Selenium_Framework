package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Baselibrary;

public class ModalPage extends Baselibrary
{
	public ModalPage() 
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[text()=\"×\"]")
	private WebElement close;
	
	@FindBy(xpath="//a[@href=\"newdemo.html\"]")
	private WebElement practice;
	
	@FindBy(xpath="//button[@data-target=\"#alerts\"]")
	private WebElement alert;
	
	@FindBy(xpath="//a[@href=\"#tab_15\"]")
	private WebElement modal;
	
	@FindBy(xpath="//button[@data-target=\"#exampleModal1\"]")
	private WebElement smallmodal;
	
	@FindBy(xpath="//h5[text()='Small Modal']/ancestor::div[@class=\"modal-content\"]//button[@class=\"close\"]")
	private WebElement closesmall;
	
	public void clickonclose() 
	{
		waitforclick(close);
	}
	
	public void clickonpractice() 
	{
		waitforclick(practice);
	}
	
	public void clickonalert() 
	{
		waitforclick(alert);
	}
	
	public void clickonmodal() 
	{
		waitforclick(modal);
	}
	
	public void clickonsmallmodal() 
	{
		waitforclick(smallmodal);
	}
	
	public void clickonsmallclose() 
	{
		waitforclick(closesmall);
	}

}
