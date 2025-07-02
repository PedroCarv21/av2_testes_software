package sistemadetestes.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Classe utilizada para a manipulacao
 * de elementos da pagina produtos.html
 */

public class ProductPO extends BasePOProduct{
	
	@FindBy(id = "btn-adicionar")
	public WebElement btn_adicionar;
	
	@FindBy(id = "codigo")
	public WebElement codigo;
	
	@FindBy(id = "nome")
	public WebElement nome;
	
	@FindBy(id = "quantidade")
	public WebElement quantidade;
	
	@FindBy(id = "valor")
	public WebElement valor;
	
	@FindBy(id = "data")
	public WebElement data;
	
	@FindBy(id = "btn-salvar")
	public WebElement btn_salvar;
	
	@FindBy(id = "btn-sair")
	public WebElement btn_sair;
	
	@FindBy(id = "mensagem")
	public WebElement mensagem;
	
	public ProductPO(WebDriver driver) {
		super(driver);
	}

}
