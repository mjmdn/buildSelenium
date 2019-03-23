package week5.day1.Learningtestng;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Excel extends Base_Configuaration {

	public static String [][]get_Read_ExcelData(String fileName) throws IOException


	{ 

		XSSFWorkbook wBook= new XSSFWorkbook("./data/"+fileName+".xlsx");
		XSSFSheet sheet = wBook.getSheetAt(0);
		int lastRowNum = sheet.getLastRowNum();
		short lastCellNum = sheet.getRow(0).getLastCellNum();

		String[][] data= new String[lastRowNum][lastCellNum];

		for (int i =1; i <= lastRowNum; i++) {
			XSSFRow row = sheet.getRow(i);

			for (int j = 0; j <lastCellNum; j++) {
				data[i-1][j] = row.getCell(j).getStringCellValue();


			}
		}

		return data;

	}
}
