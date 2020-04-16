package pages;

import testUI.elements.UIElement;

import static testUI.elements.TestUI.*;
import static testUI.elements.TestUI.takeScreenshotsAllure;


public class Application {

    UIElement permissions = E("className", "android.widget.Button"),
            transports = Ex("//android.view.View[@resource-id='main']/android.view.View[2]"),
            cars = Ex("//android.view.View[@resource-id='main']/android.view.View[1]"),
            audi = Ex("//android.view.View[contains(@text,'Audi')]"),
            volvo = Ex("//android.view.View[contains(@text,'Volvo')]"),
            volvoPageTitle = Ex("//android.widget.TextView[contains(@text,'Vieglie auto - Volvo')]"),
            volvoXC = Ex("//android.view.View[contains(@text,'Volvo XC 70')]"),
            searchButton = Ex("//android.view.View[contains(@text,'Meklēt')]"),
            priceMin = Ex("//android.view.View[1]/android.widget.EditText"),
            priceMax = Ex("//android.view.View[3]/android.widget.EditText"),
            yearMin = Ex("//android.view.View[5]/android.view.View/android.view.View[1]/android.widget.Spinner"),
            yearMax = Ex("//android.view.View[5]/android.view.View/android.view.View[3]/android.widget.Spinner"),
            yearPick = Ex("//android.widget.CheckedTextView[contains(@text,'2008')]"),
            searchResults = Ex("//android.widget.Button[contains(@text,'Meklēt sludinājumus')]"),
            engine = Ex ("//android.view.View[8]/android.widget.Spinner"),
            engineType = Ex ("//android.widget.CheckedTextView[contains(@text,'Dīzelis')]"),
            transmission = Ex ("//android.view.View[9]/android.widget.Spinner"),
            transmissionType = Ex("//android.widget.CheckedTextView[contains(@text,'Automāts')]"),
            emptyDesc = Ex ("//android.view.View[2]/android.view.View[2]"),
            outputCheck = Ex("//android.widget.GridView/android.view.View[1]");

    public void acceptCookies() {
        permissions.click();
    }

    public void carModelChoise() {
        transports.click();
        takeScreenshotsAllure();
        cars.shouldBe().visible().click();
        audi.shouldBe()
                .visible()
                .scrollTo()
                .customSwipeUp(550, 4);
        volvo.click();
        volvoPageTitle.shouldBe()
                .visible()
                .scrollTo()
                .customSwipeUp(550, 4);
        volvoXC.click();
        takeScreenshotsAllure();
        searchButton.shouldBe().visible().click();
    }

    public void setPrice() {
        priceMin.shouldBe().visible().sendKeys("9000");
        priceMax.sendKeys("10000");
    }

    public void minimalPrice(){
        priceMin.shouldBe().visible().sendKeys("4000");
    }

    public void setYear() {
        yearMin.click();
        yearPick.click();
        yearMax.click();
        yearPick.click();
    }

    public void setEngineType(){
        engine.click();
        engineType.click();
    }

    public void  setTransmission(){
        transmission.click();
        transmissionType.click();
    }

    public void emptyBoardValidation() {
        searchResults.scrollTo().customSwipeUp(500, 1).click();
        emptyDesc.shouldHave().containText("Sludinājumi dotajā kategorijā nav atrasti");

    }

    public void searchOutputValidation() {
        searchResults.scrollTo().customSwipeUp(500, 1).click();
        outputCheck.waitFor(2).untilIsVisible();

    }
}
