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
	@And ("^el usuario ingresa origen (.*)$")
	public void ingresoOrigen(String origen) {
		buscarVuelo.ingresoCiudadOrigen(origen);		
	}
	@And ("^ingresa destino (.*)$")
	public void ingresoDestino(String Destino) {
		buscarVuelo.ingresoCiudadDestino(Destino);
	}
	
	@And ("usuario ingresa fecha partida")
	public void ingresofechaPartida() {
		buscarVuelo.seleccionarFechaPartida();
	}
	@And ("el usuario selecciona fecha regreso")
	public void seleccionaFechaRegreso() {
		buscarVuelo.seleccionarFechaRegreso();
	}
	@And ("^el usuario ingresa numero de adultos (.*)$")
	public void ingresoNumeroAdultos(String NroAdultos) {
		buscarVuelo.seleccionarNumeroAdultos(NroAdultos);
	}
	@And ("usuario da click en buscar")
	public void clickBuscar() {
		buscarVuelo.clickBuscarVuelos();
	}
	
	@And ("usuario ordena vuelos")
	public void ordenarVuelos() {
		listaVuelos.ordenarPorPrecio();
	}
	
	@And ("se exporta resultado a excel")
	public void exportaResultado() throws IOException {
		listaVuelos.crearExcel();

	//String consulta = "Hola Mundo";
		
		//listaVuelos.crearExcel("D:\\natalia\\Documents\\Automatizacion\\Reto 2", "Resultado.xlsx", "Vuelos", consulta);
	}
	
	@Then ("se marca en verde el mas economico")
	public void marcacionMasEconomico() {
		
	}
	

}
