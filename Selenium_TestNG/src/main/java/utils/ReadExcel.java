package utils;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static String[][] getExcelData() {
		// TODO Auto-generated method stub
		
		String fileLocation = "./Excel-data/Login-Data1.xlsx";
		XSSFWorkbook wbook = null;
		try {
			wbook = new XSSFWorkbook(fileLocation);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		XSSFSheet sheet = wbook.getSheetAt(0);
		//Get the number of rows without Header
		int lastRowNum = sheet.getLastRowNum();
		// get the number of cells
		short lastCellNum = sheet.getRow(0).getLastCellNum();		
		String[][] data = new String[lastRowNum][lastCellNum];
		for (int i = 1; i <= lastRowNum; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < lastCellNum ; j++) {
				XSSFCell cell = row.getCell(j);
				
				//if get the cell value integer so convert string
				DataFormatter dft = new DataFormatter();
				String value = dft.formatCellValue(cell);
//				String cellValue = cell.getStringCellValue();
//				System.out.println(value);
				data[i-1][j] = value;
			}
		}
		try {
			wbook.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return data;
	}

}
