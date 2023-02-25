package Utils;

import org.testng.annotations.DataProvider;

import utils.ReadExcel;

public class ExcelDataUtils {
	
	@DataProvider(name = "login",indices = {0,1})
	public String[][] data() {
		String[][] excelData = ReadExcel.getExcelData();
		
		
		return excelData;
	}

}
