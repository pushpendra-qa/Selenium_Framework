package applicationUtility;

import org.openqa.selenium.WebElement;

public interface AppliationUtility 
{
	public void doubleclickonelement(WebElement ele);
	public void rightclickonelement(WebElement ele);
    public void normalclickonelement(WebElement ele);
    public void movetoelement(WebElement ele);
    public void navigatetonewtab(int index);
    public void uploadfile(String file);
    public void selectbytext(WebElement ele, String text);
    public void selectbyindex(WebElement ele, int index);
    public void selectbyvalue(WebElement ele, String value);
    
}
