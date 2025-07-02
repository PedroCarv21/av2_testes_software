package sistemadetestes.test;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTestProduct {

	
	protected static WebDriver driver;
	private static final String URL_BASE = "C:\\Users\\36129382023.2n\\Desktop\\Java 2\\av2_testes_software\\sistema\\produtos.html";
	private static final String PATH_DRIVE = "src/test/resources/chromedriver.exe";
	
	/**
	 * Metodo responsavel por iniciar navegador chrome,
	 * maximizar a tela e acessar a pagina produtos.html.
	 */
	@Before
	public void iniciar() {
		System.setProperty("webdriver.chrome.driver", PATH_DRIVE);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL_BASE);
	}
	
	
	/**
	 * Metodo responsavel por fechar o navegador.
	 */
	@After
	public void finalizar() {
		driver.quit();
	}
}
