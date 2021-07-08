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
	    private static WebDriver chrome;

	    @Before
	    public void setTheStage() {
	        OnStage.setTheStage(new OnlineCast());
	    }

	    @Given("^Juan star of page$")
		public void juanStarOfPage() throws Exception {
		theActorCalled("Juan").whoCan(BrowseTheWeb.with(chrome))
        .wasAbleTo(Open.url("https://www.travelocity.com/"));
	}

	    @When("^chose option Stay and complete of form$")
	public void choseOptionStayAndCompleteOfForm(List<DatosSolicitudIP> arg1){
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	    
	}

	    @Then("^look page in stay$")
	public void lookPageInStay()  {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Then("^search option cheap in page stay$")
	public void searchOptionCheapInPageStay()  {
	    // Write code here that turns the phrase above into concrete actions
	   
	}


	 @When("^chose option Cars and complete of form$")
		public void choseOptionCarsAndCompleteOfForm(List<DatosSolicitudIP> arg1) {
		    // Write code here that turns the phrase above into concrete actions
		   
		}

	@Then("^look page cars$")
	public void lookPageCars()  {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("^search option cheap in page cars$")
	public void searchOptionCheapInPageCars()  {
		// Write code here that turns the phrase above into concrete actions

	}
	
}
