package com.co.devco.stepDefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

import java.util.List;

import org.openqa.selenium.WebDriver;

import com.co.devco.models.DatosSolicitudIP;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;

public class TravelocityStepDefinition {

	 @Managed
	    private static WebDriver suNavegador;

	    @Before
	    public void setTheStage() {
	        OnStage.setTheStage(new OnlineCast());
	    }
	
	    @Given("^que Juan ingresa a la pagina travelocity$")
	public void queIngresaALaPaginaTravelocity() {
		theActorCalled("Juan").whoCan(BrowseTheWeb.with(suNavegador))
        .wasAbleTo(Open.url("https://www.travelocity.com/"));
	}

	    @When("^escoge la opcion stay y llena el formulario$")
	public void escogeLaOpcionStayYLlenaElFormulario(List<DatosSolicitudIP> arg1){
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	    
	}

	    @Then("^vera la pagina de estadias$")
	public void veraLaPaginaDeEstadias()  {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Then("^buscara la opcion mas economica$")
	public void buscaraLaOpcionMasEconomica()  {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@When("^escoge la opcion Cars y llena el formulario$")
	public void escogeLaOpcionCarsYLlenaElFormulario(List<DatosSolicitudIP> arg1) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	    
	}
	
	 @Then("^vera la pagina de carros$")
		public void veraLaPaginaDeCarros()  {
		    // Write code here that turns the phrase above into concrete actions
		   
		}
	
	@Then("^buscara la opcion mas economica de carros$")
	public void buscaraLaOpcionMasEconomicaDeCarrros()  {
	    // Write code here that turns the phrase above into concrete actions
	   
	}
	
}
