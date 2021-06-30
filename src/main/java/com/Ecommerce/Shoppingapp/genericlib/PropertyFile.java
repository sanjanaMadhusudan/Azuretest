package com.Ecommerce.Shoppingapp.genericlib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
/**
 * 
 * @author QSP
 *
 */

public class PropertyFile implements AutoConstant {
	/**
	 * Read the data from property file
	 * @param keys
	 * @return
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	
	public static String getPropertyfiledat(String keys) throws FileNotFoundException, IOException {
		Properties p=new Properties();
		p.load(new FileInputStream(propertyfilepath));
		return p.getProperty(keys);
	}

}
