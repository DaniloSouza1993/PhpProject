package br.com.PhpProject.cadastrar;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.PhpProject.utils.DriverBrowser;
import br.com.PhpProjectPageObject.AdminsPage;
import br.com.PhpProjectPageObject.CustomersPage;
import br.com.PhpProjectPageObject.LoginPhpPage;

public class BusinessPhp {

	private LoginPhpPage login;
	private CustomersPage cadastroCustomers;
	private AdminsPage cadastroAdmins;
	private static WebDriverWait wait;

	public BusinessPhp() {

		login = new LoginPhpPage();
		cadastroCustomers = new CustomersPage();
		cadastroAdmins = new AdminsPage();
		wait = new WebDriverWait(DriverBrowser.getDriver(), 10);
	}

	public void acessarSistemaEmail(String email) {
		// Aguardo o campo de texto de Email ficar visivel
		wait.until(ExpectedConditions.visibilityOf(DriverBrowser.getDriver().findElement(login.getTxtEmail())));

		// Aqui insiro o Email'
		DriverBrowser.getDriver().findElement(login.getTxtEmail()).sendKeys(email);

	}

	public void acessarSistemaSenha(String senha) {

		// Aqui insiro a senha
		DriverBrowser.getDriver().findElement(login.getTxtSenha()).sendKeys(senha);

	}

	public void clicarBotaoLogin() {
		// Aqui clico em Logar
		DriverBrowser.getDriver().findElement(login.getBtnLogin()).click();
	}

	public void menuAccountsCustomers() {
		// Aguardo o menu Accounts ficar visivel
		wait.until(ExpectedConditions.visibilityOfElementLocated(cadastroCustomers.getMenuAccounts()));

		DriverBrowser.getDriver().findElement(cadastroCustomers.getMenuAccounts()).click();
		wait.until(ExpectedConditions
				.visibilityOf(DriverBrowser.getDriver().findElement(cadastroCustomers.getmenuCustomers())));
		DriverBrowser.getDriver().findElement(cadastroCustomers.getmenuCustomers()).click();
	}

	public void clicarBotaoADDCustomers() {
		DriverBrowser.getDriver().findElement(cadastroCustomers.getbtnAdd()).click();

	}

	public void firstNameCustomers() {
		DriverBrowser.getDriver().findElement(cadastroCustomers.gettxtFirstName()).sendKeys("Felipe");
	}

	public void lastNameCustomers() {
		DriverBrowser.getDriver().findElement(cadastroCustomers.gettxtLastname()).sendKeys("Dudu");
	}

	public void emailCustomers() {
		DriverBrowser.getDriver().findElement(cadastroCustomers.gettxtEmail()).sendKeys("teste@dudu.com");
	}

	public void passwordCustomers() {
		DriverBrowser.getDriver().findElement(cadastroCustomers.gettxtPassword()).sendKeys("123456");
	}

	public void countryCustomers() {
		DriverBrowser.getDriver().findElement(By.cssSelector("#s2id_autogen1 > a > span.select2-chosen")).click();
		DriverBrowser.getDriver().findElement(By.className("select2-input")).sendKeys("Brazil");
		DriverBrowser.getDriver().findElement(By.className("select2-input")).sendKeys(Keys.ARROW_DOWN);
		DriverBrowser.getDriver().findElement(By.className("select2-input")).sendKeys(Keys.ENTER);
	}

	public void submitCustomers() {

		DriverBrowser.getDriver().findElement(cadastroCustomers.getbtnSubmit()).click();
	}

	public void msgCustomers() {

		String texto = DriverBrowser.getDriver().findElement(cadastroCustomers.getmsgCadastro()).getText();
		assertEquals("CHANGES SAVED!", texto);
	}

	public void menuAccountsAdmins() {
		// Aguardo o menu Accounts ficar visivel
		wait.until(ExpectedConditions.visibilityOfElementLocated(cadastroAdmins.getMenuAccounts()));

		DriverBrowser.getDriver().findElement(cadastroAdmins.getMenuAccounts()).click();
		wait.until(ExpectedConditions
				.visibilityOf(DriverBrowser.getDriver().findElement(cadastroAdmins.getMenuAccounts())));
		DriverBrowser.getDriver().findElement(cadastroAdmins.getMenuAdmins()).click();
	}

	public void clicarBotaoADDAdmins() {
		DriverBrowser.getDriver().findElement(cadastroAdmins.getBtnAdd()).click();

	}

	public void firstNameAdmins() {
		DriverBrowser.getDriver().findElement(cadastroAdmins.getTxtFirstName()).sendKeys("Danilo");
	}

	public void lastNameAdmins() {
		DriverBrowser.getDriver().findElement(cadastroAdmins.getTxtLastName()).sendKeys("Souza");
	}

	public void emailAdmins() {
		DriverBrowser.getDriver().findElement(cadastroAdmins.getTxtEmail()).sendKeys("danilo@souza.com");
	}

	public void passwordAdmins() {
		DriverBrowser.getDriver().findElement(cadastroAdmins.getTxtPassword()).sendKeys("123456");
	}

	public void countryAdmins() {
		DriverBrowser.getDriver().findElement(By.cssSelector("#s2id_autogen1 > a > span.select2-chosen")).click();
		DriverBrowser.getDriver().findElement(By.className("select2-input")).sendKeys("Brazil");
		DriverBrowser.getDriver().findElement(By.className("select2-input")).sendKeys(Keys.ARROW_DOWN);
		DriverBrowser.getDriver().findElement(By.className("select2-input")).sendKeys(Keys.ENTER);
	}

	public void submitAdmins() {

		DriverBrowser.getDriver().findElement(cadastroAdmins.getBtnSubmit()).click();
	}

	public void msgAdmins() {
		// Aguardo o menu Accounts ficar visivel
				wait.until(ExpectedConditions.visibilityOfElementLocated(cadastroAdmins.getMsgCadastro()));
				
		String texto = DriverBrowser.getDriver().findElement(cadastroAdmins.getMsgCadastro()).getText();
		assertEquals("CHANGES SAVED!", texto);
	}

}
