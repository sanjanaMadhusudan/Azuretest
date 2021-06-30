package com.shoppingapp.testscripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.Ecommerce.Shoppingapp.genericlib.BaseTest;
import com.Ecommerce.Shoppingapp.genericlib.PropertyFile;
import com.Ecommerce.Shoppingapp.genericlib.Utilies;
import com.Ecommerce.Shoppngapp.PomPages.AddtoCart;
import com.Ecommerce.Shoppngapp.PomPages.Home;
import com.Ecommerce.Shoppngapp.PomPages.Login;
import com.Ecommerce.Shoppngapp.PomPages.Product;

public class Addingtocart extends BaseTest{
	@Test
	public void addtocart() throws FileNotFoundException, IOException {
	Login l=new Login(driver);
	l.logincredtails(PropertyFile.getPropertyfiledat("username"),PropertyFile.getPropertyfiledat("password"));
		
	Home h=new Home(driver);
	h.productserach(PropertyFile.getPropertyfiledat("product"));
	
	Product p=new Product(driver);
	Utilies.dropDown(p.getSortdd(),PropertyFile.getPropertyfiledat("sort"));
	p.dresimg();
	
	AddtoCart a=new AddtoCart(driver);
	a.addbtn();
	Utilies.dropDown(a.getSizedd(),PropertyFile.getPropertyfiledat("sizedd"));
	a.addtocartbtn();
	
	
	}

}
