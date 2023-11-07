package Login;

import org.testng.annotations.Test;

import generics.BaseClass;

public class DWS_01_Test extends BaseClass {
	@Test
	public void Login_with_valid_credentials() throws InterruptedException {
		login.getLoginLink().click();
		login.getEmailTextField().sendKeys("demo@gmail.com");
		login.getPasswordTextFiled().sendKeys("*******");
		Thread.sleep(2000);
		login.getRememberMeButton().click();
		login.getLoginbutton().click();
		login.getSearchTextFiled().sendKeys("gadgets");
		Thread.sleep(2005);
		login.getSearchButton().click();	
	}
}
