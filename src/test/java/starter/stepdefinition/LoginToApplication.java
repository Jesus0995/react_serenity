package starter.stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import page.HomePage;

public class LoginToApplication {
	
	@Steps
	HomePage home;
	
	
	

	@Given("usuario en la pagina principal")
	public void usuario_en_la_pagina_principal() {
	  home.openApplication();
	}

	@When("usuario digita una palabra")
	public void usuario_digita_una_palabra() {
	    home.enterText();
	}

	@Then("el usuario debe poder ver el resultado")
	public void el_usuario_debe_poder_ver_el_resultado() {
		home.clickOnLoginButton();
	}
}
