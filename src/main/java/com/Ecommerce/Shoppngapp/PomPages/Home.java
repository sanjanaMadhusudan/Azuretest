package com.Ecommerce.Shoppngapp.PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	@FindBy(id="search_query_top")
	private WebElement serachtb;
	
	@FindBy(name="submit_search")
	private WebElement go;
	
	public Home(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void productserach(String product) {
		serachtb.sendKeys(product);
		go.click();
	}
	

}
