package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Baselibrary;

public class WebTablePage extends Baselibrary
{
	String path = "C:\\Workspace\\AutomationPractice\\testData\\Untitled spreadsheet (3).xlsx";
	public WebTablePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[text()='×']")
	private WebElement close;
	
	@FindBy(xpath="//a[@href=\"newdemo.html\"]")
	private WebElement practice;
	
	@FindBy(xpath="//button[@data-target=\"#elements\"]")
	private WebElement element;
	
	@FindBy(xpath="//a[@href=\"#tab_4\"]")
	private WebElement webtable;
	
	@FindBy(xpath="//input[@pattern=\"^[a-zA-Z][\\sa-zA-Z]{2,32}\"]")
	private WebElement name;
	
	@FindBy(xpath="//input[@name=\"email\"]")
	private WebElement email;
	
	@FindBy(xpath="//button[@type=\"submit\"]")
	private WebElement save;
	
	@FindBy(xpath="//iframe[@src=\"Webtable.html\"]")
	private WebElement frame;
	
	@FindBy(xpath="//button[@class=\"btn btn-info btn-xs btn-edit\"]")
	private List<WebElement>edit;
	
	@FindBy(xpath="//input[@name=\"edit_name\"]")
	private WebElement editname;
	
	@FindBy(xpath="//input[@name=\"edit_email\"]")
	private WebElement editemail;
	
	@FindBy(xpath="//button[@class=\"btn btn-info btn-xs btn-update\"]")
	private WebElement update;
	

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
	
	public void clickonwebtable() 
	{
		webtable.click();
	}
	
	public void filldetails() 
	{
		driver.switchTo().frame(frame);
		for(int i=1; i<5; i++)
		{
			
		waitforsendkeys(name,getReadData(path,0,i,0) );	
		//name.sendKeys(getReadData(path,0,i,0));
		
		waitforsendkeys(email, getReadData(path,0,i,1));
		//email.sendKeys(getReadData(path,0,i,1));
		save.click();
		
		}
		//driver.switchTo().defaultContent();
		
	}
	
	public void updatedetails()
	{
		int j=1;
		for(int i=0; i<edit.size();i++) 
		{
			edit.get(i).click();
			editname.clear();
			waitforsendkeys(editname, getReadData(path,0,i,0));
			//editname.sendKeys(getReadData(path,0,j,0));
			editemail.clear();
			waitforsendkeys(editemail, getReadData(path,0,i,0));
			//editemail.sendKeys(getReadData(path,0,j,1));
			update.click();
			j++;
		}
		driver.switchTo().defaultContent();
	}
	
}
