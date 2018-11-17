package br.com.PhpProjectPageObject;

import org.openqa.selenium.By;

public class LoginPhpPage {
	
	
	private By txtEmail = By.xpath("/html/body/div/form[1]/div[1]/input[1]");
	private By txtSenha = By.xpath("/html/body/div/form[1]/div[1]/input[2]");
	private By BtnLogin = By.xpath("/html/body/div/form[1]/button");
	
	
	public By getTxtEmail() {
		return txtEmail;
	}
	
	public By getTxtSenha() {
		return txtSenha;
	}
	
	public By getBtnLogin() {
		return BtnLogin;
	}
	

}
