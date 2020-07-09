package com.automatizacionWeb.definition;

import com.automatizacionWeb.steps.ingresoSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
public class ingresoDefinition {
	
	@Steps
	ingresoSteps ingresoSteps;
	
	@Given("^Ingreso a Ebay$")
	public void ingreso_a_Ebay() throws Throwable {
		ingresoSteps.login();

	}

	@When("^I complete action$")
	public void i_complete_action() throws Throwable {

	}

	@Then("^I validate the outcomes$")
	public void i_validate_the_outcomes() throws Throwable {
	
	}


}
