package baselibrary;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

import applicationUtility.AppliationUtility;
import excelutility.ExcelUtility;
import propertyUtility.PropertyUtility;
import screenshotUtility.ScreenshotUtility;
import waitUtility.WaitUtility;

public class Baselibrary implements ExcelUtility, PropertyUtility, AppliationUtility, WaitUtility, ScreenshotUtility
{
	public static WebDriver driver = null;
	public void launchUrl()
	{
	String path = "C:\\Workspace\\AutomationPractice\\webdriver\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver",path);
	driver = new ChromeDriver();
	driver.get("https://www.testingbaba.com/old/");
	driver.manage().window().maximize();
	
	}
	@Override
	public String getReadData(String path, int sheetno, int rowno, int colno)
	{
		
		String value = "";
		//String path = "C:\\Workspace\\AutomationPractice\\testData\\Untitled spreadsheet (2).xlsx";
		
		try 
		{
			FileInputStream fis = new FileInputStream(path);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sheet = wb.getSheetAt(sheetno);
			value = sheet.getRow(rowno).getCell(colno).getStringCellValue();
		}
		
		catch(Exception e) 
		{
			System.out.println("issue in get read data: " +e);
		}
		
		return value;
	}
	@Override
	public String getReadData(String key)    //overloading happening
	{
		String value ="";
		String path = "C:\\Workspace\\AutomationPractice\\testData\\config.properties";
		try 
		{
			FileInputStream fis = new FileInputStream(path);
			Properties prop = new Properties();
			prop.load(fis);
			value=prop.getProperty(key);
			
		}
		catch(Exception e) 
		{
			System.out.println("issue in get read data : " +e);
		}
		
		return value;
	}
	@Override
	public void doubleclickonelement(WebElement ele)
	{
		Actions act = new Actions(driver);
		act.doubleClick(ele).perform();
		
	}
	@Override
	public void rightclickonelement(WebElement ele) 
	{
		Actions act = new Actions(driver);
		act.contextClick(ele).perform();
		
	}
	@Override
	public void normalclickonelement(WebElement ele) 
	{
		Actions act = new Actions(driver);
		act.click(ele).perform();
		
	}
	@Override
	public void movetoelement(WebElement ele)
	{
		Actions act = new Actions(driver);
		act.moveToElement(ele).build().perform();
		
	}
	@Override
	public void navigatetonewtab(int index) 
	{
		Set<String>set=driver.getWindowHandles();
		ArrayList<String>Listofhandles=new ArrayList<>(set);
		driver.switchTo().window((Listofhandles.get(index)));
		
	}
	@Override
	public void waitforclick(WebElement ele) 
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		ele.click();
	}
	@Override
	public void waitforsendkeys(WebElement ele, String value) 
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(ele));
		ele.sendKeys(value);
		
	}
	@Override
	public void waitforalert() 
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.alertIsPresent());
		
	}
	@Override
	public void uploadfile(String file) 
	{
		//copy>>paste>>enter
		StringSelection sel = new StringSelection(file);
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(sel, null);
		
		try 
		{
			Robot rob = new Robot();
			rob.delay(250);
			rob.keyPress(KeyEvent.VK_ENTER);
			rob.keyRelease(KeyEvent.VK_ENTER);
			
			rob.keyPress(KeyEvent.VK_CONTROL);
			rob.keyPress(KeyEvent.VK_V);
			rob.keyRelease(KeyEvent.VK_CONTROL);
			rob.keyRelease(KeyEvent.VK_V);
			
			rob.keyPress(KeyEvent.VK_ENTER);
			rob.delay(250);
			rob.keyRelease(KeyEvent.VK_ENTER);
			
		}
		
		catch(Exception e) 
		{
			System.out.println("issue in upload file: " +e);
		}
		
	}
	@Override
	public void getscreenshot(String folderName, String fileName)
	{
		String loc= System.getProperty("user.dir");
		String path= loc + "//screenshot//"+ folderName + "//" + fileName + ".png";
		
		try 
		{
			EventFiringWebDriver efw = new EventFiringWebDriver(driver);
			File source= efw.getScreenshotAs(OutputType.FILE);
			File Destination = new File(path);
			FileUtils.copyFile(source, Destination);
			
		}
		
		catch(Exception e) 
		{
			System.out.println("issue in get screenshot: " +e);
		}
		
	}
	
	@AfterMethod
	public void resultAnalysis(ITestResult result) 
	{
		String methodName=result.getMethod().getMethodName();
		if(result.getStatus()==ITestResult.SUCCESS)
		{
			getscreenshot("Pass", methodName);
		}
		else if(result.getStatus()==ITestResult.FAILURE) 
		{
			getscreenshot("Fail", methodName);
		}
	}
	@Override
	public void selectbytext(WebElement ele, String text) 
	{
		// TODO Auto-generated method stub
		Select sel = new Select(ele);
		sel.selectByVisibleText(text);
	}
	@Override
	public void selectbyindex(WebElement ele, int index) 
	{
		// TODO Auto-generated method stub
		Select sel = new Select(ele);
		sel.selectByIndex(index);
	}
	@Override
	public void selectbyvalue(WebElement ele, String value) 
	{
		// TODO Auto-generated method stub
		Select sel = new Select(ele);
		sel.deselectByValue(value);
	}
	
}
