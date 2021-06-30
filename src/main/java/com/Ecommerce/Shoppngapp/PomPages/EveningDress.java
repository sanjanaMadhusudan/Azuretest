package com.Ecommerce.Shoppngapp.PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EveningDress {
	
	@FindBy(id="layered_id_attribute_group_1")
	private WebElement sizecb;
	
	@FindBy(id="layered_id_feature_16")
	private WebElement stylecb;
	
	@FindBy(xpath="//a[@title='Delivery']")
	private WebElement delivery;
	
	public EveningDress(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void deliverybtn() {
		sizecb.click();
		stylecb.click();
		delivery.click();
	}
	

}
