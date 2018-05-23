package stepDefinitions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.BusquedaVuelosPage;
import pages.ListadoVuelosPage;


public class BusquedaVuelosSteps {
	
	private WebDriver driver;
	BusquedaVuelosPage buscarVuelo; 
	ListadoVuelosPage listaVuelos;
	
	@Before
	public void setUp(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\naanmuno\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		buscarVuelo = new BusquedaVuelosPage(driver);
		listaVuelos = new ListadoVuelosPage(driver);

	}
	
	@Given ("usuario esta en la pagina de despegar")
	public void ingresarPaginaPpal()  {
		driver.get("https://www.despegar.com.co/"); 
	}
	@When ("usuario selecciona la opcion de vuelos")
	public void seleccionarOpcionVuelos() {
		buscarVuelo.cerrarVentana();
		buscarVuelo.clickEnVuelos();

	}
	@And ("el usuario ingresa origen")
	public void ingresoOrigen() {
		buscarVuelo.ingresoCiudadOrigen("Medellín, Colombia");		
	}
	@And ("ingresa destino")
	public void ingresoDestino() {
		buscarVuelo.ingresoCiudadDestino("Cartagena de Indias, Bolívar, Colombia");
	}
	
	@And ("usuario ingresa fecha partida")
	public void ingresofechaPartida() {
		buscarVuelo.seleccionarFechaPartida();
	}
	@And ("el usuario selecciona fecha regreso")
	public void seleccionaFechaRegreso() {
		buscarVuelo.seleccionarFechaRegreso();
	}
	@And ("el usuario ingresa numero de adultos")
	public void ingresoNumeroAdultos() {
		buscarVuelo.seleccionarNumeroAdultos();
	}
	@And ("usuario da click en buscar")
	public void clickBuscar() {
		buscarVuelo.clickBuscarVuelos();
	}
	@And ("se exporta resultado a excel")
	public void exportaResultado() throws IOException {

		//String[] consulta = new String[7];

//		consulta[0] = driver.findElement(By.xpath(
//				"//*[@id=\"clusters\"]/span[1]/span/cluster/div/div/span/fare/span/span/div[1]/item-fare/p/span/flights-price/span/flights-price-element/span/span/em/span[2]"))
//				.getText();
//		consulta[1] = driver.findElement(By.xpath(
//				"//*[@id=\"clusters\"]/span[2]/span/cluster/div/div/span/fare/span/span/div[1]/item-fare/p/span/flights-price/span/flights-price-element/span/span/em/span[2]"))
//				.getText();
//		consulta[2] = driver.findElement(By.xpath(
//				"//*[@id=\"clusters\"]/span[3]/span[1]/cluster/div/div/span/fare/span/span/div[1]/item-fare/p/span/flights-price/span/flights-price-element/span/span/em/span[2]"))
//				.getText();
//		consulta[3] = driver.findElement(By.xpath(
//				"//*[@id=\"clusters\"]/span[4]/span/cluster/div/div/span/fare/span/span/div[1]/item-fare/p/span/flights-price/span/flights-price-element/span/span/em/span[2]"))
//				.getText();
//		consulta[4] = driver.findElement(By.xpath(
//				"//*[@id=\"clusters\"]/span[5]/span/cluster/div/div/span/fare/span/span/div[1]/item-fare/p/span/flights-price/span/flights-price-element/span/span/em/span[2]"))
//				.getText();
//		consulta[5] = driver.findElement(By.xpath(
//				"//*[@id=\"clusters\"]/span[6]/span/cluster/div/div/span/fare/span/span/div[1]/item-fare/p/span/flights-price/span/flights-price-element/span/span/em/span[2]"))
//				.getText();
//		consulta[6] = driver.findElement(By.xpath(
//				"//*[@id=\"clusters\"]/span[7]/span/cluster/div/div/span/fare/span/span/div[1]/item-fare/p/span/flights-price/span/flights-price-element/span/span/em/span[2]"))
//				.getText(); 
		
//		String consulta = driver.findElement(By.xpath(
//				"//*[@id=\"clusters\"]/span[1]/span/cluster/div/div/span/fare/span/span/div[1]/item-fare/p/span/flights-price/span/flights-price-element/span/span/em/span[2]"))
//				.getText();
		
		String consulta = "Hola Mundo";
		
		listaVuelos.EscribirExcel("D:\\natalia\\Documents\\Automatizacion\\Reto 2", "Resultado.xlsx", "Vuelos", consulta);
	}
	
	@Then ("se marca en verde el mas economico")
	public void marcacionMasEconomico() {
		
	}
	

}
