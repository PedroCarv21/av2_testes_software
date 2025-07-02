package sistemadetestes.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import sistemadetestes.pageObject.ProductPO;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ProductTest extends BaseTestProduct{

	
	private static ProductPO productPage;
	
	@Before
	public void prepararTestes() {
		productPage = new ProductPO(driver);
	}
	
	/**
	 * Tentar criar um novo produto, porem sem preencher
	 * qualquer campo.
	 */
	
	@Test
	public void TC001_tentarSalvarUmProdutoSemCamposPreenchidos() {
		
		productPage.btn_adicionar.click();
		productPage.btn_adicionar.click();
		
		productPage.btn_salvar.click();
		String mensagem = productPage.mensagem.getText();
		
		assertEquals(mensagem, "Todos os campos são obrigatórios para o cadastro!");
		
	}
	
	/**
	 * Tenta criar um produto ao preencher todos
	 * os seus campos exceto a data.
	 */
	
	@Test
	public void TC002_tentarSalvarUmProdutoComApenasUmCampoNaoPreenchido() {
		
		productPage.btn_adicionar.click();
		productPage.btn_adicionar.click();
		
		productPage.codigo.sendKeys("1");
		productPage.nome.sendKeys("televisao");
		productPage.quantidade.sendKeys("23");
		productPage.valor.sendKeys("1450.00");
		
		productPage.btn_salvar.click();
		String mensagem = productPage.mensagem.getText();
		
		assertEquals(mensagem, "Todos os campos são obrigatórios para o cadastro!");
		
	}
	
	/**
	 * Cria um novo produto ao preencher todos os
	 * dados e verifica se o produto foi criado
	 * ao verificar a existencia do botao 'Editar'
	 */
	
	@Test
	public void TC003_criarUmProdutoComTodosOsCamposPreenchidos() {
		
		productPage.btn_adicionar.click();
		productPage.btn_adicionar.click();
		
		productPage.codigo.sendKeys("1");
		productPage.nome.sendKeys("televisao");
		productPage.quantidade.sendKeys("23");
		productPage.valor.sendKeys("1450.00");
		productPage.data.sendKeys("02022025");
		
		productPage.btn_salvar.click();
		productPage.btn_sair.click();
		
		
		WebDriverWait aguardo = new WebDriverWait(driver, 5);
		WebElement linkEditar = aguardo.until(ExpectedConditions.presenceOfElementLocated(By.id("btn_editar")));
		
		String tituloBtnEditar = linkEditar.getText();
		assertEquals(tituloBtnEditar, "Editar");
		
	}

}
