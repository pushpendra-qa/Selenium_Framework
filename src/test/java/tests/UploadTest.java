package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import pages.Uploadfile;

public class UploadTest extends Baselibrary
{
	Uploadfile obj=null;
	
	@BeforeTest
	public void launchurl() 
	{
		launchUrl();
		obj=new Uploadfile();
	}
	

	@Test(priority=1)
	public void clickonclose() 
	{
		obj.clickonclose();
	}
	
	@Test(priority=2)
	public void clickonpractice() 
	{
		obj.clickonpractice();
	}
	
	@Test(priority=3)
	public void clickonelement()
	{
		obj.clickonelement();
	}
	
	
	@Test(priority =4)
	public void clickonupload() 
	{
		obj.clickonupload();
	}
	
	@Test(priority=5)
	public void clickonChoose() 
	{
		obj.clickonchoose();
		//here it does not work because we need action class to handle this.
	}
	
	@Test(priority=6)
	public void uploadfile() 
	{
		obj.uploadfile();
	}


}
