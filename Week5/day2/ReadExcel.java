package week5.day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		// Step no 1: Set path for workbook
		XSSFWorkbook workBook = new XSSFWorkbook("./data/CreateLead.xlsx");
		// step2-> Get into the sheet
		XSSFSheet sheet = workBook.getSheetAt(0);
		// Step3-> Get into Row values
		XSSFRow rowNo1 = sheet.getRow(1);
		// Step4-> Get into cell values
		XSSFCell cellNo1 = rowNo1.getCell(0);
		XSSFCell cellNo2 = rowNo1.getCell(1);
		// Step5-> Read Data from workbook and print
		String stringCellValueA2 = cellNo1.getStringCellValue();
		String stringCellValueB2 = cellNo2.getStringCellValue();
		System.out.println(stringCellValueA2);
		System.out.println(stringCellValueB2);
		int TotalRowCount = sheet.getLastRowNum();
		short TotalColumnCount = rowNo1.getLastCellNum();
		System.out.println("Total Row Count in the excel : " + TotalRowCount);
		System.out.println("Total Column Count in the excel : " + TotalColumnCount);
		// outer For Loop represent my row inside the excel wookbook
		for (int i = 0; i <= TotalRowCount; i++) { // i =0,1,2,3--> total iteration of loop is 4
			XSSFRow row = sheet.getRow(i);
			System.out.print(" | ");
			// inner For Loop represent my column inside the specific Row
			for (int j = 0; j < TotalColumnCount; j++) {
				String stringCellValue = row.getCell(j).getStringCellValue();
				System.out.print(stringCellValue + " | ");
			}
			System.out.println();
		}
		// Step6-> close the workbook
		workBook.close();
	}

}
