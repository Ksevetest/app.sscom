package screens;

import testUI.elements.UIElement;

import static testUI.elements.TestUI.*;

public class MainPage {
    UIElement permissions = E("className", "android.widget.Button"),
            transports = Ex("//android.view.View[@resource-id='main']/android.view.View[2]");

    public void acceptCookies() {
        System.out.println("App launched");
        permissions.click();
    }

    public void chooseFilterType() {
        transports.click();
            }
}
