package com.Ecommerce.Shoppingapp.genericlib;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
/**
 * 
 * @author QSP
 *
 */
public class Photo {
	/**
	 * Photo class
	 * @param driver
	 * @param name
	 * @return
	 * @throws IOException
	 */
	
	public static String getPhoto(WebDriver driver,String name) throws IOException {
		Date d=new Date();
		String date = d.toString().replaceAll(":","-");
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(AutoConstant.photopath+date+name+".png");
		FileUtils.copyFile(src, dest);
		return date;
		
	}

}
