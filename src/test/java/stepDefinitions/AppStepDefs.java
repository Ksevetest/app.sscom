package stepDefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import screens.*;


public class AppStepDefs {

    private MainPage mainPage = new MainPage();
    private CarPage carPage = new CarPage();
    private CarModelPage carModelPage = new CarModelPage();
    private FilterPage filterPage = new FilterPage();
    private ResultPage resultPage = new ResultPage();
    private Settings settings = new Settings();


    @Given("client opens ss.com application")
    public void clientOpensSsComApplication() {
        mainPage.acceptCookies();
    }


    @Given("client opens ss.com mobile web")
    public void clientOpensSsComMobileWeb() {
        System.out.println("App launched");
    }

    @When("client chooses (.*) car model")
    public void clientChoosesCarModel(String car) {
        mainPage.chooseFilterType();
        carPage.carChoise(car);
        carModelPage.carModelChoise();
    }

    @And("client sets up car filter")
    public void clientSetsAppCarFilter() {
        filterPage.setPrice();
        filterPage.setYear();
        filterPage.setEngineType();
        filterPage.setTransmission();
        filterPage.confirmSearch();
    }

    @And("client sets up car filter with minimal price")
    public void carFilterWithMinimalPrice() {
        filterPage.minimalPrice();
    }

    @Then("client sees board with no results")
    public void emptyBoard() {
        resultPage.emptyBoardValidation();
    }

    @Then("client sees search results")
    public void clientSeesSearchResults() {
        resultPage.searchOutputValidation();
    }

    @When("client opens settings")
    public void clientOpensSettings() {
        settings.settingsPage();
    }

    @Then("client chooses (.*) language")
    public void clientChoosesRussianLanguage(String language) {
        settings.languageChange(language);
    }
}
