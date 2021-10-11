package stepDefinitions;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.qameta.allure.Allure;
import io.qameta.allure.Attachment;
import testUI.Configuration;

import static testUI.Configuration.*;
import static testUI.TestUIDriver.takeScreenshot;
import static testUI.TestUIServer.stop;
import static testUI.UIOpen.open;


public class Hooks {

    @Before()
    public void startApp() {
        Configuration.automationType = Configuration.ANDROID_PLATFORM;
        Configuration.androidAppPath = "src/test/resources/sscom.apk";
        addMobileDesiredCapabilities.setCapability("fullReset", false);
        open();
    }

    @After()
    public void stopApp(Scenario scenario) {
        takeScreenshotAfterFailure(scenario);
        stop();
    }

    @Attachment
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
}}
