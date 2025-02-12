package Utility;

import java.io.File;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WebDriver_Utility {
	public void maximize(WebDriver driver) {
		driver.manage().window().maximize();
	 	
	}

	public void backward(WebDriver driver) {
		driver.navigate().back();
	}
	public void WaitForpageToLoad(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}
	public void windowSwitching(WebDriver driver, String partialValue) {
		Set<String> set = driver.getWindowHandles();
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			String window = itr.next();
			driver.switchTo().window(window);
			if(window.contains("partialValue")) {
				break;
		}
		}
	}
	public void windowSwitching1(WebDriver driver, String partialValue1) throws Throwable {

	Set<String> set1 = driver.getWindowHandles();
	Iterator<String> itr1= set1.iterator();

	while (itr1.hasNext()) {
		String window1 = itr1.next();
		Thread.sleep(2000);	
		driver.switchTo().window(window1);
		Thread.sleep(2000);
		if(window1.contains(" partialValue1")) {
			break;
	}
	}
	}
	public void moveToElement(WebDriver driver,WebElement ele) {
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
		
	}
	public void acceptAlert(WebDriver driver) {
		driver.switchTo().alert().accept();
	}


	public static String takeScreenShotEx(WebDriver driver,String screenShotName) throws Throwable {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("D:\\WORKSPACE\\SELENIUM\\Advance-selenium-learning\\selenium" +screenShotName+".png");
		FileUtils.copyFile(src,dest);
		return dest.getAbsolutePath();
		
	}
}
