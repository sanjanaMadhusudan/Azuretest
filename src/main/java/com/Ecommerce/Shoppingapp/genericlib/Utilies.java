package com.Ecommerce.Shoppingapp.genericlib;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
/**
 * 
 * @author QSP
 *
 */
public class Utilies {
	/**
	 * To handle the webelements
	 * @param ele
	 * @param text
	 */
	
	public static void dropDown(WebElement ele,String text) {
		Select s=new Select(ele);
		s.selectByVisibleText(text);
	}
	
	public static void mouseHover(WebDriver driver,WebElement ele) {
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
	}
	
	
	public static void doubleClick(WebDriver driver,WebElement ele) {
		Actions a=new Actions(driver);
		a.doubleClick(ele).perform();
	}
	
	public static void scrollBar(WebDriver driver,int x,int y) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("windows.scrollBy("+x+","+y+")");
		
	}
	
	public static void alertpopup(WebDriver driver) {
		driver.switchTo().alert().accept();
		
	}
	
	public static void explicitlyWait(WebDriver driver,WebElement ele) {
		WebDriverWait w=new WebDriverWait(driver,10);
		w.until(ExpectedConditions.elementToBeClickable(ele));
		
		
	}
	

}
