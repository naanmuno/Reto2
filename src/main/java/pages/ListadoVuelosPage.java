package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import herramientas.ExcelWrite;



public class ListadoVuelosPage {

	static WebDriver driver;
	ExcelWrite excel = new ExcelWrite();

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
	
	public void ordenarPorPrecio() {
		
		esperarSegundos(driver, 4);
		//driver.findElement(By.xpath("//*[@id=\"results-visualization-bar-position\"]/results-visualization-bar/visualization-module-touch/div/div[2]/p[1]/span/span/label/span")).click();
	}
	
	public void crearExcel() throws IOException {
		
		esperarSegundos(driver, 7);
		
		String[][] precios = new String [7][7];

		precios[0][0] = driver.findElement(By.xpath("//*[@id=\"clusters\"]/span[1]/span/cluster/div/div/span/fare/span/span/div[1]/item-fare/p/span/flights-price/span/flights-price-element/span/span/em/span[2]")).getText();
		precios[0][1] = driver.findElement(By.xpath("//*[@id=\"clusters\"]/span[1]/span/cluster/div/div/span/div/div/span[1]/route-choice/ul/li[1]/route/itinerary/div/span/itinerary-element[2]/span/itinerary-element-airline/span/span/span/span[2]")).getText();
		
		precios[1][0] = driver.findElement(By.xpath("//*[@id=\"clusters\"]/span[2]/span/cluster/div/div/span/fare/span/span/div[1]/item-fare/p/span/flights-price/span/flights-price-element/span/span/em/span[2]")).getText();
		precios[1][1] = driver.findElement(By.xpath("//*[@id=\"clusters\"]/span[2]/span/cluster/div/div/span/div/div/span[1]/route-choice/ul/li/route/itinerary/div/span/itinerary-element[2]/span/itinerary-element-airline/span/span/span/span[2]")).getText();
		
		precios[2][0] = driver.findElement(By.xpath("//*[@id=\"clusters\"]/span[3]/span[1]/cluster/div/div/span/fare/span/span/div[1]/item-fare/p/span/flights-price/span/flights-price-element/span/span/em/span[2]")).getText();
		precios[2][1] = driver.findElement(By.xpath("//*[@id=\"clusters\"]/span[3]/span[1]/cluster/div/div/span/div/div/span[1]/route-choice/ul/li[1]/route/itinerary/div/span/itinerary-element[2]/span/itinerary-element-airline/span/span/span/span[2]")).getText();
		
		precios[3][0] = driver.findElement(By.xpath("//*[@id=\"clusters\"]/span[4]/span/cluster/div/div/span/fare/span/span/div[1]/item-fare/p/span/flights-price/span/flights-price-element/span/span/em/span[2]")).getText();
		precios[3][1] = driver.findElement(By.xpath("//*[@id=\"clusters\"]/span[4]/span/cluster/div/div/span/div/div/span[1]/route-choice/ul/li[1]/route/itinerary/div/span/itinerary-element[2]/span/itinerary-element-airline/span/span/span/span[2]")).getText();	
		
		precios[4][0] = driver.findElement(By.xpath("//*[@id=\"clusters\"]/span[5]/span/cluster/div/div/span/fare/span/span/div[1]/item-fare/p/span/flights-price/span/flights-price-element/span/span/em/span[2]")).getText();
		precios[4][1] = driver.findElement(By.xpath("//*[@id=\"clusters\"]/span[5]/span/cluster/div/div/span/div/div/span[1]/route-choice/ul/li/route/itinerary/div/span/itinerary-element[2]/span/itinerary-element-airline/span/span/span/span[2]")).getText();
		
		precios[5][0] = driver.findElement(By.xpath("//*[@id=\"clusters\"]/span[6]/span/cluster/div/div/span/fare/span/span/div[1]/item-fare/p/span/flights-price/span/flights-price-element/span/span/em/span[2]")).getText();
		precios[5][1] = driver.findElement(By.xpath("//*[@id=\"clusters\"]/span[6]/span/cluster/div/div/span/div/div/span[1]/route-choice/ul/li/route/itinerary/div/span/itinerary-element[2]/span/itinerary-element-airline/span/span/span/span[2]")).getText();
		
		precios[6][0] = driver.findElement(By.xpath("//*[@id=\"clusters\"]/span[7]/span/cluster/div/div/span/fare/span/span/div[1]/item-fare/p/span/flights-price/span/flights-price-element/span/span/em/span[2]")).getText(); 
		precios[6][1] = driver.findElement(By.xpath("//*[@id=\"clusters\"]/span[7]/span/cluster/div/div/span/div/div/span[1]/route-choice/ul/li/route/itinerary/div/span/itinerary-element[2]/span/itinerary-element-airline/span/span/span/span[2]")).getText();

		
		excel.WriteExcel(precios);
		
	}
	



}
