package br.com.PhpProject.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class DriverBrowser {
	
public static WebDriver driver = null;
	
	private static final String HOME_PAG = "https://www.phptravels.net/admin";
	
	//Classe respons�vel por criar o Driver
	private static WebDriver setDriver() {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\Chrome\\chromedriver.exe");
		return driver = new ChromeDriver();
	}
	
	public static WebDriver getDriver() {
		if(driver == null) {
			driver = setDriver();
		}
		
		return driver;
	}
	
	//Classe respons�vel por iniciar o Driver do Google Chrome e logar na p�gina inicial
	public static void setUpWebDriver() {
		
		DriverBrowser.getDriver().manage().window().maximize();
		DriverBrowser.getDriver().get(HOME_PAG);
	}

	//M�todo para encerrar o Driver depois da execu��o
	public static void finaliza() {
			getDriver().quit();
			 
		}

}
