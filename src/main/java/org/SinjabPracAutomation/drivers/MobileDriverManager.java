package org.SinjabPracAutomation.drivers;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.SinjabPracAutomation.Utilities.CapabilitiesManager;

import java.net.MalformedURLException;
import java.net.URL;

public class MobileDriverManager {

    private static AppiumDriver driver;

    /**
     * Sets up the Appium driver with capabilities loaded from the config.json.
     */
    public static void setUpMobileDriver() {
        if (driver == null) {
            DesiredCapabilities capabilities = CapabilitiesManager.getCapabilities();
            String serverURL = CapabilitiesManager.getServerURL();
            System.out.println("Loaded Capabilities: " + capabilities);
            System.out.println("Server URL: " + serverURL);
            try {
                driver = new AndroidDriver(new URL(serverURL), capabilities);
                System.out.println("Driver initialized successfully.");
            } catch (MalformedURLException e) {
                throw new RuntimeException("Invalid Appium server URL: " + e.getMessage());
            }
        }
    }


    /**
     * Returns the initialized Appium driver instance.
     * @return AppiumDriver instance
     */
    public static AppiumDriver getMobileDriver() {
        if (driver == null) {
            throw new IllegalStateException("Driver not initialized. Call setUpMobileDriver() first.");
        }
        return driver;
    }

    /**
     * Quits the Appium driver.
     */
    public static void quitMobileDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
