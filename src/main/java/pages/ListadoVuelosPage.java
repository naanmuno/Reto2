package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import herramientas.EscribirExcel;



public class ListadoVuelosPage {

	static WebDriver driver;
	EscribirExcel archivoExcel;

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
		
		esperarSegundos(driver, 4);
		
		String[] precios = new String [7];
		String[] aerolinea = new String [7];
		
		precios[0] = driver.findElement(By.xpath("//*[@id=\"clusters\"]/span[1]/span/cluster/div/div/span/fare/span/span/div[1]/item-fare/p/span/flights-price/span/flights-price-element/span/span/em/span[2]")).getText();
		precios[1] = driver.findElement(By.xpath("//*[@id=\"clusters\"]/span[2]/span/cluster/div/div/span/fare/span/span/div[1]/item-fare/p/span/flights-price/span/flights-price-element/span/span/em/span[2]")).getText();
		precios[2] = driver.findElement(By.xpath("//*[@id=\"clusters\"]/span[3]/span[1]/cluster/div/div/span/fare/span/span/div[1]/item-fare/p/span/flights-price/span/flights-price-element/span/span/em/span[2]")).getText();
		precios[3] = driver.findElement(By.xpath("//*[@id=\"clusters\"]/span[4]/span/cluster/div/div/span/fare/span/span/div[1]/item-fare/p/span/flights-price/span/flights-price-element/span/span/em/span[2]")).getText();
		precios[4] = driver.findElement(By.xpath("//*[@id=\"clusters\"]/span[5]/span/cluster/div/div/span/fare/span/span/div[1]/item-fare/p/span/flights-price/span/flights-price-element/span/span/em/span[2]")).getText();
		precios[5] = driver.findElement(By.xpath("//*[@id=\"clusters\"]/span[6]/span/cluster/div/div/span/fare/span/span/div[1]/item-fare/p/span/flights-price/span/flights-price-element/span/span/em/span[2]")).getText();
		precios[6] = driver.findElement(By.xpath("//*[@id=\"clusters\"]/span[7]/span/cluster/div/div/span/fare/span/span/div[1]/item-fare/p/span/flights-price/span/flights-price-element/span/span/em/span[2]")).getText(); 

		aerolinea[0] = driver.findElement(By.xpath("//*[@id=\"clusters\"]/span[1]/span/cluster/div/div/span/div/div/span[1]/route-choice/ul/li[1]/route/itinerary/div/span/itinerary-element[2]/span/itinerary-element-airline/span/span/span/span[2]")).getText();
		aerolinea[1] = driver.findElement(By.xpath("//*[@id=\"clusters\"]/span[2]/span/cluster/div/div/span/div/div/span[1]/route-choice/ul/li/route/itinerary/div/span/itinerary-element[2]/span/itinerary-element-airline/span/span/span/span[2]")).getText();
		aerolinea[2] = driver.findElement(By.xpath("//*[@id=\"clusters\"]/span[3]/span[1]/cluster/div/div/span/div/div/span[1]/route-choice/ul/li[1]/route/itinerary/div/span/itinerary-element[2]/span/itinerary-element-airline/span/span/span/span[2]")).getText();
		aerolinea[3] = driver.findElement(By.xpath("//*[@id=\"clusters\"]/span[4]/span/cluster/div/div/span/div/div/span[1]/route-choice/ul/li[1]/route/itinerary/div/span/itinerary-element[2]/span/itinerary-element-airline/span/span/span/span[2]")).getText();	
		aerolinea[4] = driver.findElement(By.xpath("//*[@id=\"clusters\"]/span[5]/span/cluster/div/div/span/div/div/span[1]/route-choice/ul/li/route/itinerary/div/span/itinerary-element[2]/span/itinerary-element-airline/span/span/span/span[2]")).getText();
		aerolinea[5] = driver.findElement(By.xpath("//*[@id=\"clusters\"]/span[6]/span/cluster/div/div/span/div/div/span[1]/route-choice/ul/li/route/itinerary/div/span/itinerary-element[2]/span/itinerary-element-airline/span/span/span/span[2]")).getText();
		aerolinea[6] = driver.findElement(By.xpath("//*[@id=\"clusters\"]/span[7]/span/cluster/div/div/span/div/div/span[1]/route-choice/ul/li/route/itinerary/div/span/itinerary-element[2]/span/itinerary-element-airline/span/span/span/span[2]")).getText();
		
		archivoExcel.EscribirArchivoExcel("D:\\natalia\\Documents\\Automatizacion\\Reto 2", "Resultado.xlsx", "Vuelos", precios);
		
	}




}
