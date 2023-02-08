package genericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class a07_02_02_ExcelUtility {
	public String fetchDataFromExcel(String sheetName, int rowNo, int cellNo) throws EncryptedDocumentException, IOException {
		FileInputStream fis= new FileInputStream("./testdata/ExcelData.xlsx");
		Workbook workbook=WorkbookFactory.create(fis);
		
		return workbook.getSheet(sheetName).getRow(rowNo).getCell(cellNo).toString();
		
	}

}
