package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Baselibrary;

public class AlertPage extends Baselibrary
{
	public AlertPage() 
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[text()=\"×\"]")
	private WebElement close;
	
	@FindBy(xpath="//a[@href=\"newdemo.html\"]")
	private WebElement practice;
	
	@FindBy(xpath="//button[@data-target=\"#alerts\"]")
	private WebElement alert;
	
	@FindBy(xpath="//a[@href=\"#tab_12\"]")
	private WebElement alerts;
	
	@FindBy(xpath="//button[@onclick=\"myalert()\"]")
	private WebElement simplealert;
	
	@FindBy(xpath="//button[@onclick=\"aftersec5()\"]")
	private WebElement timealert;
	
	@FindBy(xpath="//button[@onclick=\"myconfirm()\"]")
	private WebElement confirmationalert;
	
	@FindBy(xpath="//button[@onclick=\"myprompt()\"]")
	private WebElement promptalert;
	
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
	
	public void clickonalerts() 
	{
		waitforclick(alerts);
	}
	
	public void clickonsimplealert() 
	{
		waitforclick(simplealert);
		driver.switchTo().alert().accept();
	}
	
	public void clickontimealert() 
	{
		waitforclick(timealert);
		waitforalert();
		driver.switchTo().alert().accept();
	}
	
	public void clickonconfirmationalert() 
	{
		waitforclick(confirmationalert);
		driver.switchTo().alert().dismiss();
	}
	
	public void clickonpromtalert() 
	{
		waitforclick(promptalert);
		Alert prmptalert=driver.switchTo().alert();
		
		prmptalert.sendKeys("welcome");
		prmptalert.accept();
		
	}

}
