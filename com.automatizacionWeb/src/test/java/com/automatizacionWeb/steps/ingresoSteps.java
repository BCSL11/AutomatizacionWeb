package com.automatizacionWeb.steps;

import com.automatizacionWeb.pageobjects.Objetoslogin;

import net.thucydides.core.annotations.Step;

public class ingresoSteps {
	
	Objetoslogin objetoslogin;
	
	@Step
	public void login() {
		
		objetoslogin.open();
		objetoslogin.prueba();
	}


}
