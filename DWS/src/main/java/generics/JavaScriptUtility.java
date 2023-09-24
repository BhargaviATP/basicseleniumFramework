package generics;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JavaScriptUtility extends BaseClass{
public void enteringdataintoElement(String data,WebElement element) {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].value='"+data+"'", element);
}
public void clickonElement(WebElement element) {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();", element);
}
}
