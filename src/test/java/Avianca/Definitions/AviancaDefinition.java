package Avianca.Definitions;

import Avianca.Steps.AviancaHomeSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.WebDriver;

public class AviancaDefinition {

    @Steps
    AviancaHomeSteps aviancaHomeSteps;

    @Given("^that costumer open up avianca page$")
    public void that_costumer_open_up_avianca_page() {
        aviancaHomeSteps.openAviancaHomePage();
    }


    @When("^He searches for a fly in the home page$")
    public void he_searches_for_a_fly_in_the_home_page() {

    }

    @Then("^He should see the list of fly and select the second item$")
    public void he_should_see_the_list_of_fly_and_select_the_second_item() {


    }
}