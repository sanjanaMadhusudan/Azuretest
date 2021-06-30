package com.Ecommerce.Shoppingapp.genericlib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * 
 * @author QSP
 *
 */
public class Exceldata {
	/**
	 * To read the data from excelsheet
	 * @param sheetname
	 * @param rownum
	 * @param cellnum
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws InvalidFormatException
	 * @throws IOException
	 */
	
	public static String getExceldata(String sheetname,int rownum,int cellnum) throws EncryptedDocumentException, InvalidFormatException, IOException {
FileInputStream f=new FileInputStream(AutoConstant.excelfilepath);
Workbook wb = WorkbookFactory.create(f);
String s = wb.getSheet(sheetname).getRow(rownum).getCell(cellnum).getStringCellValue();
return s;
		
	}

}
