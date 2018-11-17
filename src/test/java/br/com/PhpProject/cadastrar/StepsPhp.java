package br.com.PhpProject.cadastrar;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepsPhp {

	private BusinessPhp page;

	public StepsPhp() {
		page = new BusinessPhp();
	}

	@Given("^Quando eu acesso o sistema com o email \"([^\"]*)\"$")
	public void acessarSistema(String email) throws Throwable {
		page.acessarSistemaEmail(email);
	}

	@When("^Quando eu acesso com a senha \"([^\"]*)\"$")
	public void quando_eu_acesso_com_a_senha(String senha) throws Throwable {
		page.acessarSistemaSenha(senha);
	}

	@Then("^eu clico no botao login para acessar o sistema$")
	public void eu_clico_no_botao_login_para_acessar_o_sistema() throws Throwable {
		page.clicarBotaoLogin();
	}

	@And("^clico no menu ACCOUNTS e no sub menu CUSTOMERS$")
	public void clico_no_menu_ACCOUNTS_e_no_sub_menu_CUSTOMERS() throws Throwable {
		page.menuAccountsCustomers();
	}

	@And("^sistema carrega a tela de CUSTOMERS MANAGEMENT$")
	public void sistema_carrega_a_tela_de_CUSTOMERS_MANAGEMENT() throws Throwable {
		System.out.println("TELA CUSTOMERS MANAGEMENT apresentada com sucesso!");
	}

	@And("^clico no botao ADD$")
	public void clico_no_botao_ADD() throws Throwable {
		page.clicarBotaoADDCustomers();
	}

	@And("^preencho os campos First Name$")
	public void preencho_os_campos_First_Name() throws Throwable {
		page.firstNameCustomers();
	}

	@And("^Preencho o campo Last name$")
	public void preencho_o_campo_Last_name() throws Throwable {
		page.lastNameCustomers();
	}

	@And("^Preencho o campo email$")
	public void preencho_o_campo_email() throws Throwable {
		page.emailCustomers();
	}

	@And("^Preencho o campo password$")
	public void preencho_o_campo_password() throws Throwable {
		page.passwordCustomers();
	}

	@And("^Preencho o campo country$")
	public void preencho_o_campo_country() throws Throwable {
		page.countryCustomers();
	}

	@And("^clico no botao submit$")
	public void clico_no_botao_submit() throws Throwable {
		page.submitCustomers();
	}

	@Then("^conta cadastro efetuado com sucesso$")
	public void conta_cadastro_efetuado_com_sucesso() throws Throwable {
		page.msgCustomers();
	}

	@And("^clico no menu ACCOUNTS e no sub menu ADMINS$")
	public void clico_no_menu_ACCOUNTS_e_no_sub_menu_ADMINS() throws Throwable {
		page.menuAccountsAdmins();
	}

	@And("^sistema carrega a tela de ADMINS MANAGEMENT$")
	public void sistema_carrega_a_tela_de_ADMINS_MANAGEMENT() throws Throwable {
		System.out.println("PÁGINA ADMINS MANAGEMENT");
	}

	@And("^clico no botao ADD em admins$")
	public void clico_no_botao_ADD_em_admins() throws Throwable {
		page.clicarBotaoADDAdmins();
		
	}

	@And("^preencho os campos First Name em admins$")
	public void preencho_os_campos_First_Name_em_admins() throws Throwable {
		page.firstNameAdmins();
	}

	@And("^Preencho o campo Last name em admins$")
	public void preencho_o_campo_Last_name_em_admins() throws Throwable {
		page.lastNameAdmins();
	}

	@And("^Preencho o campo email em admins$")
	public void preencho_o_campo_email_em_admins() throws Throwable {
		page.emailAdmins();
	}

	@And("^Preencho o campo password em admins$")
	public void preencho_o_campo_password_em_admins() throws Throwable {
		page.passwordAdmins();
	}

	@And("^Preencho o campo country em admins$")
	public void preencho_o_campo_country_em_admins() throws Throwable {
		page.countryAdmins();
	}

	@And("^clico no botao submit em admins$")
	public void clico_no_botao_submit_em_admins() throws Throwable {
		page.submitAdmins();
	}

	@Then("^conta cadastro efetuado com sucesso em admins$")
	public void conta_cadastro_efetuado_com_sucesso_em_admins() throws Throwable {
		page.msgAdmins();
	}

}
