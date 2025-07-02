package sistemadetestes.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/** 
 * Classe que deve ser herdada
 * para a criacao de uma fabrica de elementos
 * atraves do metodo construtor
 * */

public class BasePOProduct {

protected WebDriver driver;
	
	public BasePOProduct(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
