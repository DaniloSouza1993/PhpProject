package br.com.PhpProjectPageObject;

import org.openqa.selenium.By;

public class CustomersPage {

	private By menuAccounts = By.xpath("//*[@id=\"social-sidebar-menu\"]/li[5]/a");
	private By menuCustomers = By.xpath("//*[@id=\"ACCOUNTS\"]/li[3]/a");
	private By btnAdd = By.xpath("//*[@id=\"content\"]/div/form/button");
	private By txtFirstName = By.xpath("//*[@id=\"content\"]/form/div/div[2]/div/div[1]/div/input");
	private By txtLastname = By.xpath("//*[@id=\"content\"]/form/div/div[2]/div/div[2]/div/input");
	private By txtEmail = By.xpath("//*[@id=\"content\"]/form/div/div[2]/div/div[3]/div/input");
	private By txtPassword = By.xpath("//*[@id=\"content\"]/form/div/div[2]/div/div[4]/div/input");
	private By lblCountry = By.cssSelector("#s2id_autogen1 > a > span.select2-chosen");
	private By btnSubmit = By.cssSelector("#content > form > div > div.panel-footer > button");
	private By msgCadastro = By.xpath("/html/body/div[3]/div/h4");

	public By getMenuAccounts() {
		return menuAccounts;
	}

	public By getmenuCustomers() {
		return menuCustomers;
	}

	public By getbtnAdd() {
		return btnAdd;
	}

	public By gettxtFirstName() {
		return txtFirstName;
	}

	public By gettxtLastname() {
		return txtLastname;
	}

	public By gettxtEmail() {
		return txtEmail;
	}

	public By gettxtPassword() {
		return txtPassword;
	}

	public By getlblCountry() {
		return lblCountry;
	}

	public By getbtnSubmit() {
		return btnSubmit;
	}

	public By getmsgCadastro() {
		return msgCadastro;
	}

}
