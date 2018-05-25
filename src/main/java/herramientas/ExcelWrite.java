package herramientas;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {
	
 	String nombreArchivo = "Resultado.xlsx";
	String rutaArchivo = "D:\\natalia\\Documents\\Automatizacion\\Reto 2\\" + nombreArchivo;
	String hoja = "Vuelos";	
	
	XSSFWorkbook libro= new XSSFWorkbook();
	XSSFSheet hoja1 = libro.createSheet(hoja);
	 
	public void WriteExcel(String[][] precios) {
		
		//Titulos de la primera fila
		String [] header= new String[]{"Precio", "Aerolinea"};

		//Generar los datos para el archivo
		for(int i = 0; i <= precios.length; i++) {
			XSSFRow row=hoja1.createRow(i);
			for( int j = 0; j < header.length;j++) {
				if(i==0) {
					XSSFCell cell = row.createCell(j);//se crea las celdas para la cabecera, junto con la posición
					cell.setCellValue(header[j]);//se añade el contenido
					
				}
				
				
				else {
					XSSFCell cell = row.createCell(j);//se crea las celdas para la contenido, junto con la posición

					cell.setCellValue(precios[i-1][j]); //se añade el contenido				

				}
			}
			

		}
		
		XSSFCell cell2 = libro.getSheetAt(0).getRow(1).getCell(0);
		XSSFCellStyle  my_style = libro.createCellStyle();
		my_style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
		my_style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		cell2.setCellStyle(my_style);
		
		File file;
		file = new File(rutaArchivo);
		try (FileOutputStream fileOuS = new FileOutputStream(file)){						
			if (file.exists()) {// si el archivo existe se elimina
				file.delete();
				System.out.println("Archivo eliminado");
			}
			libro.write(fileOuS);
			fileOuS.flush();
			fileOuS.close();
			System.out.println("Archivo Creado");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}


	}

}