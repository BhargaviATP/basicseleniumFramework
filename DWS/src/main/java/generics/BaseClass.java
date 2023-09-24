package generics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepository.LoginPage;
import objectRepository.RegisterPage;

public class BaseClass {

	//	WebDriverManager.chromedriver().clearDriverCache().setup();
	//	WebDriverManager.chromedriver().clearResolutionCache().setup();
	/************ Above two lines are used, 
	 * if old version of browser is not updating due to old cache, 
	 * to clear the cache, we use these lines*******/

	public static WebDriver driver;
	public static JavaScriptUtility js;
	public static PropertyUtility utility;
	public static LoginPage login;
	public static RegisterPage register;
	@BeforeClass
	public void launchingtheBrowser() {
		utility = new PropertyUtility(); // Initialize the utility object
		if(utility.readingDatafromPropertyFile("browser").equalsIgnoreCase("Chrome")){
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}else if(utility.readingDatafromPropertyFile("browser").equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}else if(utility.readingDatafromPropertyFile("browser2").equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		register=new RegisterPage(driver);
		login=new LoginPage(driver);
	}

	@BeforeMethod
	public void navigateToApplication() {
		driver.get(utility.readingDatafromPropertyFile("url"));
	}

	@AfterClass
	public void tearDowntheBrowser() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
}

//@Test
//	public void logintask() throws InterruptedException {
//		js=new JavaScriptUtility();
//		WebElement element = driver.findElement(By.linkText("Log in"));
//		js.clickonElement(element);
//		WebElement ele = driver.findElement(By.id("Email"));
//		WebElement ele1 = driver.findElement(By.id("Password"));
//		js.enteringdataintoElement("bhargavi",ele);
//		js.enteringdataintoElement("abcdefg123",ele1);
//		WebElement rembutton = driver.findElement(By.id("RememberMe"));
//		js.clickonElement(rembutton);
//		WebElement ele2 = driver.findElement(By.xpath("//input[@value='Log in']"));
//		js.clickonElement(ele2);
//		Thread.sleep(3000);
//	}
//	



