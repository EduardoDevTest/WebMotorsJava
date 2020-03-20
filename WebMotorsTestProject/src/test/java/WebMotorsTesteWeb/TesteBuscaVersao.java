package WebMotorsTesteWeb;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TesteBuscaVersao {

	@Test

	public void TestVersao() throws InterruptedException {
		// diretorio local do drive
		System.setProperty("Webdriver.gecko.driver", "C:\\driver");

		// driver utilizado no teste estanciado
		WebDriver navegador = new FirefoxDriver();

		// abertura do navegador
		navegador.get("http://www.webmotors.com.br/");

		// espera para preparação de elementos
		navegador.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		// escrevendo sobre o campo de pesquisa
		navegador.findElement(By.xpath("//*[@id=\"searchBar\"]")).sendKeys("Honda city");
		Thread.sleep(3000);

		// escolha do veiculo desejado
		List<WebElement> test = navegador.findElements(
				By.xpath("/html/body/div[1]/main/div[2]/div[2]/div[1]/div[2]/div/div/div/div/div/div/a/div[2]"));

		for (WebElement webElement : test) {
			if (webElement.getText().trim().equals("Honda City"))
				;
			// clicar sobre a opção desejada
			webElement.click();
		}
		//clicando no ano desejado
		Thread.sleep(3000);		
		navegador.findElement(By
				.xpath("/html/body/div[1]/main/div[1]/div[2]/div/div[1]/div[2]/div[2]/div/form/div[3]/div[2]/label[1]"))
				.click();

		//clicando sobre o veiculo desejado
		Thread.sleep(3000);
		navegador
				.findElement(By
						.xpath("/html/body/div[1]/main/div[1]/div[3]/div[2]/div/div[1]/div/div[1]/div/div[1]/a[1]/img"))
				.click();

	}

}
