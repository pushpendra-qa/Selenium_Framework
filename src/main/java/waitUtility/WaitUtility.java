package waitUtility;

import org.openqa.selenium.WebElement;

public interface WaitUtility 
{
	
	public void waitforclick(WebElement ele);
	public void waitforsendkeys(WebElement ele, String text);
	public void waitforalert();

}
