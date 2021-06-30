package com.shoppingapp.testscripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Ecommerce.Shoppingapp.genericlib.BaseTest;
import com.Ecommerce.Shoppingapp.genericlib.PropertyFile;
import com.Ecommerce.Shoppingapp.genericlib.Utilies;
import com.Ecommerce.Shoppngapp.PomPages.EveningDress;
import com.Ecommerce.Shoppngapp.PomPages.Login;

public class DeliveryTheProduct extends BaseTest{

	@Test
	public void productDelivery() throws FileNotFoundException, IOException {
		Login l=new Login(driver);
		Utilies.mouseHover(driver,l.getDresstab());
		l.eveningdressbtn();
		
		EveningDress e=new EveningDress(driver);
		e.deliverybtn();
		Assert.assertEquals(driver.getTitle(),PropertyFile.getPropertyfiledat("deliverypage"));
	}

}
