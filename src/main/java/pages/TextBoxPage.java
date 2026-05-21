package pages;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import baselibrary.Baselibrary;

public class TextBoxPage extends Baselibrary
{
	String path = "C:\\Workspace\\AutomationPractice\\testData\\Untitled spreadsheet (2).xlsx";
	public TextBoxPage() 
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//button[text()='×']")
	private WebElement close;
	
	@FindBy(xpath="//a[@href=\"newdemo.html\"]")
	private WebElement practice;
	
	@FindBy(xpath="//button[@data-target=\"#elements\"]")
	private WebElement element;
	
	@FindBy(xpath="//a[text()='text box']")
	private WebElement textbox;
	
	@FindBy(xpath="//input[@id=\"fullname1\"]")
	private WebElement name;
	
	@FindBy(xpath="//input[@id=\"fullemail1\"]")
	private WebElement email;
	
	@FindBy(xpath="//textarea[@id=\"fulladdresh1\"]")
	private WebElement caddress;
	
	@FindBy(xpath="//textarea[@id=\"paddresh1\"]")
	private WebElement paddress;
	
	@FindBy(xpath="//input[@class=\"btn btn-success\"]")
	private WebElement submit;
	
	@FindBy(xpath="//div[@class=\"col-md-6 mt-5\"]/label")
	private List<WebElement>list;  //multiple web elements
	
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
	
	public void clickontextbox() 
	{
		textbox.click();
	}
	
	public void filldetails() 
	{
		//name.sendKeys("Aman");
		//email.sendKeys("aman@gmail.com");
		//caddress.sendKeys("Noida sector 63");
		//paddress.sendKeys("New Delhi Ashok Nagar");
		//submit.click();
		
		name.sendKeys(getReadData(path,0,1,0));
		email.sendKeys(getReadData(path,0,1,1));
		caddress.sendKeys(getReadData(path,0,1,2));
		paddress.sendKeys(getReadData(path,0,1,3));
		submit.click();
	}
	
	
	public void validate() 
	{
		SoftAssert sassert = new SoftAssert();
		ArrayList <String> expected = new ArrayList<>();
		ArrayList <String> actual = new ArrayList<>();
		
		for(int i = 0; i<4; i++) 
		{
			expected.add(getReadData(path,0,1,i));
		}
		
		//expected.add("java");
		for(int i = 1; i<list.size(); i=i+2) 
		{
			actual.add(list.get(i).getText());	
		}
		
		//System.out.println(actual);
		//System.out.println(expected);
		
		for(int i=0;i<expected.size();i++) 
		{
			 sassert.assertEquals(expected.get(i),actual.get(i));	 
		}
		
		System.out.println("validation complete");
		sassert.assertAll();//this line will show how many validation passed and how many failed
	}
	
}
