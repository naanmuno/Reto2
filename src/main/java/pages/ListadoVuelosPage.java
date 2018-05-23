package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.io.File;

import java.io.FileInputStream;

import java.io.FileOutputStream;

import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import org.apache.poi.ss.usermodel.Cell;

import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.ss.usermodel.Sheet;

import org.apache.poi.ss.usermodel.Workbook;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ListadoVuelosPage {

	static WebDriver driver;

	// CONSTRUCTOR
	public ListadoVuelosPage(WebDriver driver) {
		ListadoVuelosPage.driver = driver;
	}

	public void esperarSegundos(WebDriver driver, int segundos) {
		synchronized (driver) {
			try {
				driver.wait(segundos * 1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	

	public void EscribirExcel(String filePath, String fileName, String sheetName, String consulta)
			throws IOException {

		esperarSegundos(driver, 4);

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

			cell.setCellValue(consulta);
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
