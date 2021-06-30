package com.Ecommerce.Shoppingapp.genericlib;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
/**
 * 
 * @author QSP
 *
 */
public class BaseTest implements AutoConstant{
	/**
	 * open the application
	 */
	public WebDriver driver;
	
	@BeforeMethod
	public void openApp() throws FileNotFoundException, IOException {
		System.setProperty(key, value);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(PropertyFile.getPropertyfiledat("url"));
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
	/**
	 * close the application
	 * @throws IOException 
	 */
	@AfterMethod
	public void closeApp(ITestResult r) throws IOException {
		int status = r.getStatus();
		String name = r.getName();
		if(status==2)
		{
			Photo.getPhoto(driver, name);
		}
		driver.close();
	}
 
}
