package br.com.PhpProject.cadastrar;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import br.com.PhpProject.utils.DriverBrowser;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/br/com/PhpProject/cadastrar", // caminho da feature


		strict = false, // Se tiver steps não mapeados a execução não deve falhar
		monochrome = true, // Visualização do resultado no console
		glue = { "br.com.PhpProject.cadastrar" }) // Ajuda o cucumber a localizar os passos definidos

public class RunnerPhp {

	@BeforeClass
	public static void iniciaDriver() throws Exception {
		DriverBrowser.setUpWebDriver();
	}

	@AfterClass
	public static void finalizaDriver() throws Throwable {
		DriverBrowser.finaliza();
	}

}
