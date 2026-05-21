package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Baselibrary;

public class CheckBoxPage extends Baselibrary
{
	public CheckBoxPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[text()='×']")
	private WebElement close;
	
	@FindBy(xpath="//a[@href=\"newdemo.html\"]")
	private WebElement practice;
	
	@FindBy(xpath="//button[@data-target=\"#elements\"]")
	private WebElement element;
	
	@FindBy(xpath="//a[@href=\"#tab_2\"]")
	private WebElement checkbox;
	
	@FindBy(xpath="//input[@id=\"myCheck\"]")
	private WebElement mobilecheckbox;
	
	@FindBy(xpath="//iframe[@src=\"Checkbox.html\"]")
	private WebElement frame;
	
	@FindBy(xpath="//h6[@id=\"text\"]")
	private WebElement mobiletext;
	
	public void clickonclose() 
	{
		close.click();
	}
	
	public void clickonpractice() 
	{
		practice.click();
	}
	
	public void clickonelement() 
	{
		element.click();
	}
	
	public void clickoncheckbox() 
	{
		checkbox.click();
	}
	
	public void clickonmobilecheckbox() 
	{
		//String expected = getReadData("mobile");
		//String actual = mobiletext.getText();
		
		driver.switchTo().frame(frame);
		mobilecheckbox.click();
		String expected = getReadData("mobile");  //this line can be used above as written
		String actual = mobiletext.getText();
		Assert.assertEquals(actual, expected);
		driver.switchTo().defaultContent();
		System.out.println("validation complete");  //change spelling in property file get failed result
	}
	
}
