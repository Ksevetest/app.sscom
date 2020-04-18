package stepDefinitions;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.qameta.allure.Allure;
import testUI.Configuration;

import static testUI.Configuration.*;
import static testUI.TestUIDriver.takeScreenshot;
import static testUI.TestUIServer.stop;
import static testUI.UIOpen.open;


public class Hooks {

    @Before()
    public void startApp() {
        Configuration.automationType = Configuration.ANDROID_PLATFORM;
        Configuration.androidAppPath = "/Users/vulros/Downloads/sscom.apk";
        addMobileDesiredCapabilities.setCapability("fullReset", false);
        open();
    }

    @After() // RETURNS SCREENSHOT IN BYTE TYPE
    public void takeScreenshotAfterFailure(Scenario scenario) {
        if (scenario.isFailed()) {
            byte[] screenshot = takeScreenshot();
            Allure.getLifecycle()
                    .addAttachment(
                            "Screenshot",
                            "image/png",
                            "png",
                            screenshot);
        }
        stop();
    }
}
