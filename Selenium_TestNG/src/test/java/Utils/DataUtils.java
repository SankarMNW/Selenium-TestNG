package Utils;

import org.testng.annotations.DataProvider;

public class DataUtils {
	// if you want to execute particular username & password to use "indices" 
	
	@DataProvider(name = "login", indices = {0,2}, parallel = true)
	public String[][] data() {
		String[][] data = new String[3][2];  // String[3][2] ==> Represents 3-Rows and 2-Columns
		 
		// Row 1
		data[0][0] = "koushik350@gmail.com";
		data[0][1] ="Pass123$";
		
		// Row 2
		data[1][0] = "koushik1@letcode.in";
		data[1][1] ="Pass123$";
		
		// Row 3
		data[2][0] = "sankarmca1998@gmail.com";
		data[2][1] ="Sankar@123";
		
		return data;
	}
	

}
