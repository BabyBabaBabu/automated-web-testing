package shared;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig {
	
	XSSFWorkbook wb;
	XSSFSheet sheet;
	
	public ExcelDataConfig(String excelFile) {
		
		File src = new File(excelFile);
		
		try {
			FileInputStream fis = new FileInputStream(src);
			wb = new XSSFWorkbook(fis);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public String getData(int sheetNumber, int row, int column) {
		
		sheet = wb.getSheetAt(sheetNumber);
		String data = sheet.getRow(row).getCell(column).getStringCellValue();
		return data;
		
	}

}
