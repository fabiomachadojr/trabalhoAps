package test;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TrabalhoApsTest {

    public static WebDriver driver;

	public TrabalhoApsTest() {
    }
	
	@BeforeClass
	public static void setUp() {
		System.setProperty("webdriver.chrome.driver", 
				"c:\\chromedriver\\chromedriver.exe");

		driver = new ChromeDriver();
	}
	
	@Test
	public void testSexoMasculino(){
		driver.get("C:\\TrabalhoAps\\src\\trabalhoaps\\trabalhoAps.html");
		WebElement campoNome = driver.findElement(By.id("nome"));
		WebElement campoEndereco = driver.findElement(By.id("endereco"));
		WebElement campoSexo = driver.findElement(By.id("sexo"));
		WebElement campoIdade= driver.findElement(By.id("idade"));
		WebElement botaoSalvar = driver.findElement(By.id("botao_somar"));
		campoNome.sendKeys("teste");
		campoEndereco.sendKeys("123");
		campoSexo.sendKeys("Masculino");
		campoIdade.sendKeys("18");
		botaoSalvar.click();
		Alert alert = driver.switchTo().alert();
		Assert.assertTrue(alert.getText().equals("Cadastro realizado com sucesso"));
		alert.accept();
	}

	@Test
	public void testSexoFeminino(){
		driver.get("C:\\TrabalhoAps\\src\\trabalhoaps\\trabalhoAps.html");		
		WebElement campoNome = driver.findElement(By.id("nome"));
		WebElement campoEndereco = driver.findElement(By.id("endereco"));
		WebElement campoSexo = driver.findElement(By.id("sexo"));
		WebElement campoIdade= driver.findElement(By.id("idade"));
		WebElement botaoSalvar = driver.findElement(By.id("botao_somar"));;
		campoNome.sendKeys("teste");
		campoEndereco.sendKeys("Avenida Suarez, 185");
		campoSexo.sendKeys("Feminino");
		campoIdade.sendKeys("18");
		botaoSalvar.click();
		Alert alert = driver.switchTo().alert();
		Assert.assertTrue(alert.getText().equals("Cadastro realizado com sucesso"));
		alert.accept();
	}
	
	@Test
	public void testSexoVazio(){
		driver.get("C:\\TrabalhoAps\\src\\trabalhoaps\\trabalhoAps.html");		
		WebElement campoNome = driver.findElement(By.id("nome"));
		WebElement campoEndereco = driver.findElement(By.id("endereco"));
		WebElement campoSexo = driver.findElement(By.id("sexo"));
		WebElement campoIdade= driver.findElement(By.id("idade"));
		WebElement botaoSalvar = driver.findElement(By.id("botao_somar"));
		WebElement campoResultado= driver.findElement(By.id("resultado"));
		campoNome.sendKeys("teste");
		campoEndereco.sendKeys("Avenida Suarez, 185");
		campoSexo.sendKeys("");
		campoIdade.sendKeys("18");
		botaoSalvar.click();
		String resultado =  "Selecione um valor para o campo sexo";
		Assert.assertTrue(campoResultado.getText().equals(resultado));
	}

	@Test
	public void testNome(){
		driver.get("C:\\TrabalhoAps\\src\\trabalhoaps\\trabalhoAps.html");				
		WebElement campoNome = driver.findElement(By.id("nome"));
		WebElement campoEndereco = driver.findElement(By.id("endereco"));
		WebElement campoSexo = driver.findElement(By.id("sexo"));
		WebElement campoIdade= driver.findElement(By.id("idade"));
		WebElement botaoSalvar = driver.findElement(By.id("botao_somar"));;
		campoNome.sendKeys("Marcelo");
		campoEndereco.sendKeys("Avenida Suarez, 185");
		campoSexo.sendKeys("Feminino");
		campoIdade.sendKeys("18");
		botaoSalvar.click();
		Alert alert = driver.switchTo().alert();
		Assert.assertTrue(alert.getText().equals("Cadastro realizado com sucesso"));
		alert.accept();
	}
	
	
	@Test
	public void testNomeVazio(){
		driver.get("C:\\TrabalhoAps\\src\\trabalhoaps\\trabalhoAps.html");		
		WebElement campoNome = driver.findElement(By.id("nome"));
		WebElement campoEndereco = driver.findElement(By.id("endereco"));
		WebElement campoSexo = driver.findElement(By.id("sexo"));
		WebElement campoIdade= driver.findElement(By.id("idade"));
		WebElement botaoSalvar = driver.findElement(By.id("botao_somar"));
		WebElement campoResultado= driver.findElement(By.id("resultado"));
		campoNome.sendKeys("");
		campoEndereco.sendKeys("Avenida Suarez, 185");
		campoSexo.sendKeys("Masculino");
		campoIdade.sendKeys("18");
		botaoSalvar.click();
		String resultado = "Preencha o campo nome";
		Assert.assertTrue(campoResultado.getText().equals(resultado));
	}

	@Test
	public void testEnderecoVazio(){
		driver.get("C:\\TrabalhoAps\\src\\trabalhoaps\\trabalhoAps.html");		
		WebElement campoNome = driver.findElement(By.id("nome"));
		WebElement campoEndereco = driver.findElement(By.id("endereco"));
		WebElement campoSexo = driver.findElement(By.id("sexo"));
		WebElement campoIdade= driver.findElement(By.id("idade"));
		WebElement botaoSalvar = driver.findElement(By.id("botao_somar"));
		WebElement campoResultado= driver.findElement(By.id("resultado"));
		campoNome.sendKeys("teste");
		campoEndereco.sendKeys("");
		campoSexo.sendKeys("Masculino");
		campoIdade.sendKeys("18");
		botaoSalvar.click();
		String resultado = "Preencha o campo endereco";
		Assert.assertTrue(campoResultado.getText().equals(resultado));
	}

	@Test
	public void testIdadeVazio(){
		driver.get("C:\\TrabalhoAps\\src\\trabalhoaps\\trabalhoAps.html");		
		WebElement campoNome = driver.findElement(By.id("nome"));
		WebElement campoEndereco = driver.findElement(By.id("endereco"));
		WebElement campoSexo = driver.findElement(By.id("sexo"));
		WebElement campoIdade= driver.findElement(By.id("idade"));
		WebElement botaoSalvar = driver.findElement(By.id("botao_somar"));
		WebElement campoResultado= driver.findElement(By.id("resultado"));
		campoNome.sendKeys("teste");
		campoEndereco.sendKeys("Avenida Suarez, 185");
		campoSexo.sendKeys("Masculino");
		campoIdade.sendKeys("");
		botaoSalvar.click();
		String resultado = "Preencha o campo idade, somente com numeros";
		Assert.assertTrue(campoResultado.getText().equals(resultado));
	}

	@Test
	public void testIdadeNegativo(){
		driver.get("C:\\TrabalhoAps\\src\\trabalhoaps\\trabalhoAps.html");		
		WebElement campoNome = driver.findElement(By.id("nome"));
		WebElement campoEndereco = driver.findElement(By.id("endereco"));
		WebElement campoSexo = driver.findElement(By.id("sexo"));
		WebElement campoIdade= driver.findElement(By.id("idade"));
		WebElement botaoSalvar = driver.findElement(By.id("botao_somar"));
		WebElement campoResultado= driver.findElement(By.id("resultado"));
		campoNome.sendKeys("teste");
		campoEndereco.sendKeys("Avenida Suarez, 185");
		campoSexo.sendKeys("Masculino");
		campoIdade.sendKeys("-5");
		botaoSalvar.click();
		String resultado = "Preencha o campo idade com valores acima de 0";
		Assert.assertTrue(campoResultado.getText().equals(resultado));
	}

	@Test
	public void testIdade(){
		driver.get("C:\\TrabalhoAps\\src\\trabalhoaps\\trabalhoAps.html");		
		WebElement campoNome = driver.findElement(By.id("nome"));
		WebElement campoEndereco = driver.findElement(By.id("endereco"));
		WebElement campoSexo = driver.findElement(By.id("sexo"));
		WebElement campoIdade= driver.findElement(By.id("idade"));
		WebElement botaoSalvar = driver.findElement(By.id("botao_somar"));
		campoNome.sendKeys("teste");
		campoEndereco.sendKeys("Avenida Suarez, 185");
		campoSexo.sendKeys("Masculino");
		campoIdade.sendKeys("0");
		botaoSalvar.click();
		Alert alert = driver.switchTo().alert();
		Assert.assertTrue(alert.getText().equals("Cadastro realizado com sucesso"));
		alert.accept();
	}

	@Test
	public void testIdadeString(){
		driver.get("C:\\TrabalhoAps\\src\\trabalhoaps\\trabalhoAps.html");				
		WebElement campoNome = driver.findElement(By.id("nome"));
		WebElement campoEndereco = driver.findElement(By.id("endereco"));
		WebElement campoSexo = driver.findElement(By.id("sexo"));
		WebElement campoIdade= driver.findElement(By.id("idade"));
		WebElement botaoSalvar = driver.findElement(By.id("botao_somar"));
		WebElement campoResultado= driver.findElement(By.id("resultado"));
		campoNome.sendKeys("teste");
		campoEndereco.sendKeys("Avenida Suarez, 185");
		campoSexo.sendKeys("Masculino");
		campoIdade.sendKeys("Teste");
		botaoSalvar.click();
		String resultado = "Preencha o campo idade, somente com numeros";
		Assert.assertTrue(campoResultado.getText().equals(resultado));
	}

	@Test
	public void testTituloPaginaLogin(){
		driver.get("C:\\TrabalhoAps\\src\\trabalhoaps\\trabalhoAps.html");		
		String tituloExperado ="Trabalho 2-1"; 

		Assert.assertEquals(tituloExperado,driver.getTitle());
	}


	@AfterClass
	public static void tearDown() {

		driver.quit();
	}

}
	
	

