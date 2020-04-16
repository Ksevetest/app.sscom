package stepDefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Application;


public class AppStepDefs {

    private Application app = new Application();


    @Given("client opens ss.com application")
    public void clientOpensSsComApplication() {
        System.out.println("App launched");
        app.acceptCookies();
    }


    @Given("client opens ss.com mobile web")
    public void clientOpensSsComMobileWeb() {
        System.out.println("App launched");
    }

    @When("client chooses car model")
    public void clientChoosesCarModel() {
        app.carModelChoise();
    }

    @And("client sets up car filter")
    public void clientSetsAppCarFilter() {
        app.setPrice();
        app.setYear();
        app.setEngineType();
        app.setTransmission();
    }

    @And("client sets up car filter with minimal price")
    public void carFilterWithMinimalPrice() {
       app.minimalPrice();
    }

    @Then("client sees board with no results")
    public void emptyBoard() {
        app.emptyBoardValidation();
    }

    @Then("client sees search results")
    public void clientSeesSearchResults() {
        app.searchOutputValidation();
    }
}
