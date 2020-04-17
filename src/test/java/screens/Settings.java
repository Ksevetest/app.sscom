package screens;

import testUI.elements.UIElement;

import static testUI.elements.TestUI.*;

public class Settings {

    UIElement moreOptions = E("More options"),
            settings = Ex("//android.widget.TextView[contains(@text,'Settings')]"),
            languageOption = Ex("//android.widget.TextView[contains(@text,'language')]"),
            ruTextValidation = Ex("//android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.TextView[1]");

    public void settingsPage() {
        moreOptions.shouldBe().visible().click();
        settings.shouldBe().visible().click();
    }

    public void languageChange(String language) {
        languageOption.shouldBe().visible().click();
        Ex("//android.widget.CheckedTextView[contains(@text,'" + language + "')]").shouldBe().visible().click();
        ruTextValidation.shouldHave().containText("Язык");
        takeScreenshotsAllure();
    }
}
