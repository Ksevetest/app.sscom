package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import testUI.Configuration;

import static testUI.Configuration.addMobileDesiredCapabilities;
import static testUI.TestUIServer.stop;
import static testUI.UIOpen.open;
import static testUI.elements.TestUI.setScreenshotTaken;
import static testUI.elements.TestUI.takeScreenshotsAllure;

public class Hooks {

    @Before()
    public void startApp() {
        Configuration.automationType = Configuration.ANDROID_PLATFORM;
        Configuration.androidAppPath = "/Users/vulros/Downloads/sscom.apk";
        addMobileDesiredCapabilities.setCapability("fullReset", false);
        setScreenshotTaken(true);
        takeScreenshotsAllure();
        open();
    }

    @After()
    public void stopApp() {
        stop();
    }
}
