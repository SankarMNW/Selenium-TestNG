package utils;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelSample {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String fileLocation = "./Excel-data/Login-Data1.xlsx";
		XSSFWorkbook wbook = new XSSFWorkbook(fileLocation);
		XSSFSheet sheet = wbook.getSheetAt(0);
		// Get the number of rows without Header
		int lastRowNum = sheet.getLastRowNum();
		System.out.println("Rows: "+lastRowNum);
		// Get the number of rows with header
//		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();

		// get the number of cells
		short lastCellNum = sheet.getRow(0).getLastCellNum();
		System.out.println("Cells: "+lastCellNum);
		for (int i = 1; i <= lastRowNum; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < lastCellNum; j++) {
				XSSFCell cell = row.getCell(j);

				// if get the cell value integer so convert string
				DataFormatter dft = new DataFormatter();
				String value = dft.formatCellValue(cell);
//				String cellValue = cell.getStringCellValue();
				System.out.println(value);
			}
		}
		wbook.close();
	}

}
