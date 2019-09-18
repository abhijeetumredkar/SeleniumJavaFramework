package utility;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelutility {

	public static String projectpath;
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;

	public excelutility(String workbookName, String sheetname) {

		try {

			workbook = new XSSFWorkbook(workbookName);
			sheet = workbook.getSheet(sheetname);

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

	public static int getrowCount() throws IOException {

		int rowCount = sheet.getPhysicalNumberOfRows();
		return rowCount;

	}

	public static int getcolumnCount() throws IOException {

		int coulumnCount = sheet.getRow(0).getPhysicalNumberOfCells();
		return coulumnCount;

	}

	public static String getcellString(int rowNum, int cellNum) {

		String cellstringValue = sheet.getRow(rowNum).getCell(cellNum).getStringCellValue();
		return cellstringValue;

	}

	public static void getcellNumber(int rownum, int cellNum) {

		double cellnumValue = sheet.getRow(rownum).getCell(cellNum).getNumericCellValue();
		System.out.println(cellnumValue);

	}
}
