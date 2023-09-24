package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage{
	
	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindBy(linkText="Register")
	private WebElement registerLink;
	@FindBy(id="gender-female")
	private WebElement genderRadioButton;
	@FindBy(id="FirstName")
	private WebElement firstnameTF;
	@FindBy(id="LastName")
	private WebElement lastnameTextfield;
	@FindBy(id="Email")
	private WebElement emailTextfield;
	@FindBy(id="Password")
	private WebElement passwordTextfield;
	@FindBy(id="ConfirmPassword")
	private WebElement confirmpasswordTextfield;
	
	public WebElement getRegisterLink() {
		return registerLink;
	}
	public WebElement getGenderRadioButton() {
		return genderRadioButton;
	}
	public WebElement getFirstnameTF() {
		return firstnameTF;
	}
	public WebElement getLastnameTextfield() {
		return lastnameTextfield;
	}
	public WebElement getEmailTextfield() {
		return emailTextfield;
	}
	public WebElement getPasswordTextfield() {
		return passwordTextfield;
	}
	public WebElement getConfirmpasswordTextfield() {
		return confirmpasswordTextfield;
	}
}
	
	
	
	

