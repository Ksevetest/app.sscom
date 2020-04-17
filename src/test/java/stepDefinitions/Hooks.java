package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import testUI.Configuration;


import static com.codeborne.selenide.Selenide.close;
import static testUI.Configuration.addMobileDesiredCapabilities;
import static testUI.TestUIServer.stop;
import static testUI.UIOpen.open;

public class Hooks {

    @Before("@testApp")
    public void startApp() {
        Configuration.automationType = Configuration.ANDROID_PLATFORM;
        Configuration.androidAppPath = "/Users/vulros/Downloads/sscom.apk";
        addMobileDesiredCapabilities.setCapability("fullReset",  false);
        open();
    }

    @After("@testApp")
    public void stopApp() {
        stop();
    }

    @Before("@testMobileWeb")
    public void startMobileWeb() {
        Configuration.automationType = Configuration.ANDROID_PLATFORM;
        open("https://m.ss.com/");
    }

    @After("@testMobileWeb")
    public void stopMobileWeb() {
        close();
    }
}
