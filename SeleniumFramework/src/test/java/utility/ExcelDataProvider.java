package utility;

import java.io.IOException;

public class ExcelDataProvider {

	public Object[][] testData(String workbookName, String sheetname) throws IOException {

		excelutility excel = new excelutility(workbookName, sheetname);

		int rowCount = excel.getrowCount();
		int columnCount = excel.getcolumnCount();

		Object data[][] = new Object[rowCount - 1][columnCount];

		for (int i = 1; i < rowCount; i++) {

			for (int j = 0; j < columnCount; j++) {

				String celldata = excel.getcellString(i, j);
				data[i - 1][j] = celldata;
			}

		}
		return data;
	}

}
