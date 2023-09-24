package Register;
import org.testng.annotations.Test;

import generics.BaseClass;

public class DWS_01_Register extends BaseClass  {

	@Test
	public void registering_The_User() {
		register.getRegisterLink().click();
		register.getGenderRadioButton().click();
		register.getFirstnameTF().sendKeys("Bhargavi");
		register.getLastnameTextfield().sendKeys("Yadati");
		register.getEmailTextfield().sendKeys("demo@gmail.com");
		register.getPasswordTextfield().sendKeys("Bhargavi123");
		register.getConfirmpasswordTextfield().sendKeys("Bhargavi123");
	}
}

