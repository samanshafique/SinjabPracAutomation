package org.SinjabPracAutomation.Utilities;

import org.json.JSONObject;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.nio.file.Files;
import java.nio.file.Paths;

public class CapabilitiesManager {

    private static final String CONFIG_FILE = "src/test/resources/Mobile/config/config.json";

    public static DesiredCapabilities getCapabilities() {
        try {
            // Read the config file content
            String content = new String(Files.readAllBytes(Paths.get(CONFIG_FILE)));

            // Parse the JSON content
            JSONObject config = new JSONObject(content);

            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("deviceName", config.getString("deviceName"));
            capabilities.setCapability("platformName", config.getString("platformName"));
            capabilities.setCapability("automationName", config.getString("automationName"));
            capabilities.setCapability("app", config.getString("app"));
            capabilities.setCapability("appPackage", config.getString("appPackage"));
            capabilities.setCapability("appActivity", config.getString("appActivity"));
            capabilities.setCapability("fullReset", config.getBoolean("fullReset"));
            capabilities.setCapability("noReset", config.getBoolean("noReset"));
            capabilities.setCapability("autoGrantPermissions", config.getBoolean("autoGrantPermissions"));

            return capabilities;
        } catch (Exception e) {
            throw new RuntimeException("Failed to load capabilities from config file: " + e.getMessage());
        }
    }

    public static String getServerURL() {
        try {
            // Read the config file content
            String content = new String(Files.readAllBytes(Paths.get(CONFIG_FILE)));

            // Parse the JSON content
            JSONObject config = new JSONObject(content);

            return config.getString("serverURL");
        } catch (Exception e) {
            throw new RuntimeException("Failed to load server URL from config file: " + e.getMessage());
        }
    }
}
