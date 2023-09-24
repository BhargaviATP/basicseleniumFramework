package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.BaseClass;


public class LoginPage extends BaseClass{
		
	public  LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindBy(className="ico-login")
	private WebElement login;
	@FindBy(id="Email")
	private WebElement email;
	@FindBy(id="Password")
	private WebElement password;
	@FindBy(id="RememberMe")
	private WebElement RemMeButton;
	@FindBy(xpath="(//input[@type='submit'])[2]")
	private WebElement loginbtn;
	@FindBy(xpath="//input[@value='Search store']")
	private WebElement searchText;
	@FindBy(xpath="//input[@value='Search']")
	private WebElement searchButton;
	
	
	public WebElement getLoginLink() {
		return login;
	}
	public WebElement getEmailTextField() {
		return email;
	}
	public WebElement getPasswordTextFiled() {
		return password;
	}
	public WebElement getRememberMeButton() {
		return RemMeButton;
	}
	public WebElement getLoginbutton() {
		return loginbtn;
	}
	public WebElement getSearchTextFiled() {
		return searchText;
	}
	public WebElement getSearchButton() {
		return searchButton;
	}

}
	
		
	
	
	
		//js=new JavaScriptUtility();
		//WebElement element = driver.findElement(By.linkText("Log in"));
	
//		js.clickonElement(element);
//		
//		WebElement email = driver.findElement(By.id("Email"));
//		WebElement password = driver.findElement(By.id("Password"));
//		js.enteringdataintoElement("bhargavi@gmail.com",email);
//		js.enteringdataintoElement("abcd123",password);
//		
//		WebElement rembutton = driver.findElement(By.id("RememberMe"));
//		js.clickonElement(rembutton);
//		
//		WebElement loginbutton = driver.findElement(By.xpath(utility.readingDatafromPropertyFile("xpath")));
//		js.clickonElement(loginbutton);
//		Thread.sleep(2000);
	