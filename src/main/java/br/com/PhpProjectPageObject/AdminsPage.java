package br.com.PhpProjectPageObject;

import org.openqa.selenium.By;

public class AdminsPage {
	
	private By MenuAccounts = By.xpath("//*[@id=\"social-sidebar-menu\"]/li[5]/a");
	private By MenuAdmins = By.xpath("//*[@id=\"ACCOUNTS\"]/li[1]/a");
	private By btnAdd = By.xpath("//*[@id=\"content\"]/div/form/button");
	private By txtFirstName = By.xpath("//*[@id=\"content\"]/form/div/div[2]/div/div[1]/div/input");
	private By txtLastName = By.xpath("//*[@id=\"content\"]/form/div/div[2]/div/div[2]/div/input");
	private By txtEmail = By.xpath("//*[@id=\"content\"]/form/div/div[2]/div/div[3]/div/input");
	private By txtPassword = By.xpath("//*[@id=\"content\"]/form/div/div[2]/div/div[4]/div/input");
	private By lblCountry = By.cssSelector("#s2id_autogen1 > a > span.select2-chosen");
	private By btnSubmit = By.cssSelector("#content > form > div > div.panel-footer > button");  
	private By msgCadastro = By.xpath("/html/body/div[3]/div/h4"); 
	
	
	public By getMenuAccounts() {
		return MenuAccounts;
	}
	
	public By getMenuAdmins() {
		return MenuAdmins;
	}
	
	public By getBtnAdd() {
		return btnAdd;
	}
	
	
	public By getTxtFirstName() {
		return txtFirstName;
	}
	
	public By getTxtLastName() {
		return txtLastName;
	}
	
	public By getTxtEmail() {
		return txtEmail;
	}
	
	public By getTxtPassword() {
		return txtPassword;
	}
	
	public By getLblCountry() {
		return lblCountry;
		
	}
	
	public By getBtnSubmit() {
		return btnSubmit;
	}
	
	public By getMsgCadastro() {
		return msgCadastro;
	}
	
}

