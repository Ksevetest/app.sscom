package screens;

import testUI.elements.UIElement;

import static testUI.elements.TestUI.*;


public class CarPage {

    UIElement cars = Ex("//android.view.View[@resource-id='main']/android.view.View[1]"),
            audi = Ex("//android.view.View[contains(@text,'Audi')]");

    public void carChoise(String car) {
        cars.shouldBe().visible().click();
        audi.shouldBe()
                .visible()
                .scrollTo()
                .customSwipeUp(550, 4);
        Ex("//android.view.View[contains(@text,'" + car + "')]").click();
    }
}
