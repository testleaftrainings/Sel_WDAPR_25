package week5.day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataLibrary {

	public static String[][] readValesFromExcel() throws IOException {
		// step no 1 : get the total no of row and column
		XSSFWorkbook workBook = new XSSFWorkbook("./data/CreateLead.xlsx");
		XSSFSheet sheet = workBook.getSheetAt(0);
		XSSFRow rowNo1 = sheet.getRow(1);
		int totalRowCount = sheet.getLastRowNum();
		short totalColumnCount = rowNo1.getLastCellNum();
		// step no 2: Inside sendData() create 2-Dimensional array with number of rows and columns
		//                       [ rows ][columns]
		String[][] data = new String[totalRowCount][totalColumnCount];
		// step no 3: Initialize value to the 2-D array using nested for loop
		for (int i = 1; i <= totalRowCount; i++) { // i =1,2,3--> total iteration of loop is 3
			XSSFRow row = sheet.getRow(i);
			System.out.print(" | ");
			for (int j = 0; j < totalColumnCount; j++) {
				String stringCellValue = row.getCell(j).getStringCellValue();
				System.out.print(stringCellValue + " | ");
				data[i-1][j]=stringCellValue;
			}
			System.out.println();	
	}
	workBook.close();
	return data;
	}
	}
