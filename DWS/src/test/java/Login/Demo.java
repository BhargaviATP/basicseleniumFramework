package Login;

import static org.testng.Assert.assertFalse;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import generics.BaseClass;
import generics.ITestlistenerUtility;

@Listeners(ITestlistenerUtility.class)
public class Demo extends BaseClass{
		@Test
		public void demo1() {
			assertFalse(true);
		}
	}

