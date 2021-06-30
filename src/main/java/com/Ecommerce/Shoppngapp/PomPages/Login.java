package com.Ecommerce.Shoppngapp.PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	@FindBy(xpath="//a[@class='login']")
	private WebElement loginBtn;
	
	@FindBy(id="email")
	private WebElement emailaddresstb;
	
	@FindBy(id="passwd")
	private WebElement passwordtb;
	
	@FindBy(id="SubmitLogin")
	private WebElement sumbit;
	
	@FindBy(xpath="(//a[@title='Dresses'])[2]")
	private WebElement dresstab;
	
	@FindBy(xpath="(//a[@title='Evening Dresses'])[2]")
	private WebElement eveningdress;
	
	public WebElement getDresstab() {
		return dresstab;
	}

	public Login(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void logincredtails(String email,String password) {
		loginBtn.click();
		emailaddresstb.sendKeys(email);
		passwordtb.sendKeys(password);
		sumbit.click();
	}
	
	public void eveningdressbtn() {
		eveningdress.click();
	}

}
