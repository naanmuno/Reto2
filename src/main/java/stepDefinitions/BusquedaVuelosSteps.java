package stepDefinitions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.BusquedaVuelosPage;
import pages.ListadoVuelosPage;
import static org.junit.Assert.*;


public class BusquedaVuelosSteps {
	
	private WebDriver driver;
	BusquedaVuelosPage buscarVuelo; 
	ListadoVuelosPage resultadoVuelos;
	
	@Before
	public void setUp(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\naanmuno\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		buscarVuelo = new BusquedaVuelosPage(driver);
		resultadoVuelos = new ListadoVuelosPage(driver);

	}
	
	@After
	public void TearDown() {
		driver.quit();
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
		resultadoVuelos.ordenarPorPrecio();
	}
	
	@Then ("se exporta resultado a excel y marca el valor mas economico")
	public void exportaResultado() throws IOException {
		resultadoVuelos.crearExcel();
	}
	
	@When("selecciona la opcion de vuelos")
	public void seleccionarOpcion() {
		buscarVuelo.cerrarVentana();
		buscarVuelo.clickEnVuelos();
	
	}

	@Then ("sale mensaje de error")
	public void validacionMensajeErrorCiudad(){
		String resultado =	buscarVuelo.mensajeErrorCiudad();
		System.out.print(resultado);
		assertEquals("El destino debe ser diferente del origen", resultado);
	}
	
}
