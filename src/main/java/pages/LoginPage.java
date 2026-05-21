package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Baselibrary;

public class LoginPage extends Baselibrary
{
	
	public LoginPage() 
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[text()='×']")
	private WebElement close;
	
	public void clickonclose() 
	{
		close.click();
	}
	
	public void gettitle()   //by this method we get title without locating on DOM
	{
		String title = driver.getTitle();  //method to get title driver.gettitle()
		System.out.println(title);
	}
}

