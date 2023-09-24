package generics;

import java.io.File;
//import java.io.IOException;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ITestlistenerUtility extends BaseClass implements ITestListener {
	
/****** RIGHTCLICK--SOURCE-OVERRIDE/IMPLEMENTmETHODS************/
	
	public void onTestFailure(ITestResult result) {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File Photo=ts.getScreenshotAs(OutputType.FILE);
		File file= new File("./errorshots/"+result.getName()+".png");
		try {
			FileUtils.copyFile(Photo, file);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
