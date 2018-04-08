package org.testingmasters.dataReaders;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class ReadAnExcel {
	
	public static void main(String[] args) throws IOException, EncryptedDocumentException, InvalidFormatException {
			FileInputStream fis = new FileInputStream("./TestData/TestData.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sh = wb.getSheet("TestSheet");
			for(int i=0;i<=sh.getLastRowNum();i++) {
				Row row = sh.getRow(i);
				for(int j=0;j<row.getLastCellNum();j++) {
					Cell cell = row.getCell(j);
					String value = cell.getStringCellValue();
					System.out.println(value);
				}
				
						
			}
			
	}

}
