package herramientas;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class EscribirExcel {
	
	public void EscribirArchivoExcel(String filePath, String fileName, String sheetName, String[] precios)
			throws IOException {

		// Identificación del archivo

		File file = new File(filePath + "\\" + fileName);

		// Instanciar el objeto archivo

		FileInputStream inputStream = new FileInputStream(file);

		Workbook libro = new XSSFWorkbook(inputStream); // Instanciar un libro de trabajo; 

		// Read excel sheet by sheet name

		Sheet sheet = libro.getSheet(sheetName);
	

		// Get the current count of rows in excel file

		int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum();

		// Get the first row from the sheet

		Row row = sheet.getRow(0);

		// Create a new row and append it at last of sheet

		Row newRow = sheet.createRow(rowCount + 1);

		// Create a loop over the cell of newly created Row

		for (int j = 0; j < row.getLastCellNum(); j++) {

			// Fill data in row

			Cell cell = newRow.createCell(j);

			cell.setCellValue(precios[j]);
		}

		// Close input stream

		inputStream.close();

		// Create an object of FileOutputStream class to create write data in excel file

		FileOutputStream outputStream = new FileOutputStream(file);

		// write data in the excel file

		libro.write(outputStream);

		// close output stream

		outputStream.close();

	}

}
