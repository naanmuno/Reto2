package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class BusquedaVuelosPage {
	WebDriver driver;
	
	//CONSTRUCTOR
	public BusquedaVuelosPage(WebDriver driver) {
		this.driver = driver;  
	}
	
	public void esperarSegundos(WebDriver driver, int segundos){
	      synchronized(driver){
	         try {
	            driver.wait(segundos * 1000);
	         } catch (InterruptedException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	         }
	      }
	   } 

	public void cerrarVentana() {

		esperarSegundos(driver, 3);
		driver.findElement(By.xpath("/html/body/div[16]/div/div[1]/span")).click();
	}
	
    public void clickEnVuelos() {
    	esperarSegundos(driver, 3);
        driver.findElement(By.xpath("/html/body/div[8]/div[2]/div/ul/li[2]")).click();
}
    
    public void ingresoCiudadOrigen(String Origen) {
    	
    	esperarSegundos(driver,2);
    	driver.findElement(By.xpath("//*[@id=\"searchbox-sbox-all-boxes\"]/div[2]/div/div/div[3]/div[2]/div[1]/div[1]/div/div[1]/div/div/div/input")).clear();
    	driver.findElement(By.xpath("//*[@id=\"searchbox-sbox-all-boxes\"]/div[2]/div/div/div[3]/div[2]/div[1]/div[1]/div/div[1]/div/div/div/input")).click();
    	driver.findElement(By.xpath("//*[@id=\"searchbox-sbox-all-boxes\"]/div[2]/div/div/div[3]/div[2]/div[1]/div[1]/div/div[1]/div/div/div/input")).sendKeys(Origen);

    }
    
   public void ingresoCiudadDestino(String Destino) {
 
	    esperarSegundos(driver,2);
	    driver.findElement(By.xpath("//*[@id=\"searchbox-sbox-all-boxes\"]/div[2]/div/div/div[3]/div[2]/div[1]/div[1]/div/div[1]/div/div/div/input")).clear();
    	driver.findElement(By.xpath("//*[@id=\"searchbox-sbox-all-boxes\"]/div[2]/div/div/div[3]/div[2]/div[1]/div[1]/div/div[2]/div/div/div/div/input")).click();
    	driver.findElement(By.xpath("//*[@id=\"searchbox-sbox-all-boxes\"]/div[2]/div/div/div[3]/div[2]/div[1]/div[1]/div/div[2]/div/div/div/div/input")).sendKeys(Destino);
    	esperarSegundos(driver,2);
    	driver.findElement(By.xpath("//*[@id=\"searchbox-sbox-all-boxes\"]/div[2]/div/div/div[3]/div[2]/div[1]/div[1]/div/div[2]/div/div/div/div/input")).sendKeys(Keys.ENTER);
   }
   
   public void seleccionarFechaPartida() {
 	  
	   driver.findElement(By.xpath("//*[@id=\"searchbox-sbox-all-boxes\"]/div[2]/div/div/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/input")).click();
	   esperarSegundos(driver, 2);
	   driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div[2]/i")).click();
	   driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div[2]/i")).click();
	   driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div[2]/i")).click();
	   driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div[5]/div[4]/span[1]")).click();
   
   }
   
   public void seleccionarFechaRegreso() {
	   
	   esperarSegundos(driver, 2);
	   driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div[5]/div[4]/span[29]")).click();
   }
   
   public void seleccionarNumeroAdultos() {
	   
	   esperarSegundos(driver, 1);
	   driver.findElement(By.xpath("//*[@id=\"searchbox-sbox-all-boxes\"]/div[2]/div/div/div[3]/div[2]/div[1]/div[2]/div[2]/div[6]/div[2]/div/input")).click();
	   driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div[2]/div/div[1]/div/div[1]/div[2]/div/a[2]")).click();
	   driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/a")).click();
	   
   }
   
   public void clickBuscarVuelos() {
	   
	   esperarSegundos(driver, 1);
	   driver.findElement(By.xpath("//*[@id=\"searchbox-sbox-all-boxes\"]/div[2]/div/div/div[3]/div[2]/div[4]/div/a/em")).click();
   }

}
