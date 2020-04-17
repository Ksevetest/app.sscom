package screens;

import testUI.elements.UIElement;

import static testUI.elements.TestUI.Ex;

public class FilterPage {

    UIElement searchButton = Ex("//android.view.View[contains(@text,'Meklēt')]"),
            priceMin = Ex("//android.view.View[1]/android.widget.EditText"),
            priceMax = Ex("//android.view.View[3]/android.widget.EditText"),
            yearMin = Ex("//android.view.View[5]/android.view.View/android.view.View[1]/android.widget.Spinner"),
            yearMax = Ex("//android.view.View[5]/android.view.View/android.view.View[3]/android.widget.Spinner"),
            yearPick = Ex("//android.widget.CheckedTextView[contains(@text,'2008')]"),
            searchResults = Ex("//android.widget.Button[contains(@text,'Meklēt sludinājumus')]"),
            engine = Ex("//android.view.View[8]/android.widget.Spinner"),
            engineType = Ex("//android.widget.CheckedTextView[contains(@text,'Dīzelis')]"),
            transmission = Ex("//android.view.View[9]/android.widget.Spinner"),
            transmissionType = Ex("//android.widget.CheckedTextView[contains(@text,'Automāts')]");

    public void setPrice() {
        searchButton.shouldBe().visible().click();
        priceMin.shouldBe().visible().sendKeys("9000");
        priceMax.sendKeys("10000");
    }

    public void minimalPrice() {
        searchButton.shouldBe().visible().click();
        priceMin.shouldBe().visible().sendKeys("4000");
    }

    public void setYear() {
        yearMin.click();
        yearPick.click();
        yearMax.click();
        yearPick.click();
    }

    public void setEngineType() {
        engine.click();
        engineType.click();
    }

    public void setTransmission() {
        transmission.click();
        transmissionType.click();
    }

    public void confirmSearch() {
        searchResults.scrollTo().customSwipeUp(500, 1);
        searchResults.click();
    }
}
