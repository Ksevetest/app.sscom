package screens;

import testUI.elements.UIElement;

import static testUI.elements.TestUI.Ex;
import static testUI.elements.TestUI.takeScreenshotsAllure;

public class CarModelPage {

    UIElement volvoPageTitle = Ex("//android.widget.TextView[contains(@text,'Vieglie auto - Volvo')]"),
            volvoXC = Ex("//android.view.View[contains(@text,'Volvo XC 70')]");

    public void carModelChoise() {
        volvoPageTitle.shouldBe()
                .visible()
                .scrollTo()
                .customSwipeUp(550, 4);
        volvoXC.click();
        takeScreenshotsAllure();
    }
}
