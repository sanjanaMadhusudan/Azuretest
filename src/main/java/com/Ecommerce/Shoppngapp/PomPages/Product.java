package com.Ecommerce.Shoppngapp.PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Product {
	@FindBy(id="selectProductSort")
	private WebElement sortdd;
	
	public WebElement getSortdd() {
		return sortdd;
	}

	@FindBy(xpath="(//a[@title='Printed Chiffon Dress'])[2]")
	private WebElement dress;
	
	public Product(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void dresimg() {
		dress.click();
	}

	

}
