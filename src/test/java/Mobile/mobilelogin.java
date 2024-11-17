package Mobile;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class mobilelogin {

    private AndroidDriver driver;

    @BeforeTest
    public void setUp() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("Pixel2API");
        options.setPlatformName("Android"); // Android platform
        options.setAutomationName("UiAutomator2"); // Set the automation engine
        options.setApp("C:/Users/PMLS/Downloads/example12/example12/src/test/resources/Mobile/sinjab-v109-3.3.2-Dev.apk");
        options.setAppPackage("com.setpoint.android.dev");
        options.setAppActivity("com.setpoint.android.ui.activity.AuthActivity");

        // Create an instance of the Android driver
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), options);
    }

    @Test
    public void AppiumTest()  {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement fullname = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.setpoint.android.dev:id/etEmail")));
        fullname.click();
        fullname.sendKeys("userAlpha@gmail.com");
        System.out.println("User Email Entered");

        WebElement phone = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.setpoint.android.dev:id/etPhone")));
        phone.click();
        phone.sendKeys("3455");
        System.out.println("Phone Number Entered");


        WebElement signinBtn = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.setpoint.android.dev:id/bSignIn")));
        signinBtn.click();
        System.out.println("Click on SignIn");

//
//
//        // Click on the user to go to the login screen
//        WebElement usericon = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.saucelabs.mydemoapp.android:id/username3TV")));
//        usericon.click();
//        System.out.println("Clicked on the user icon");
//
//        // Click on the "Login" button
//        WebElement logibbtn = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.saucelabs.mydemoapp.android:id/loginBtn")));
//        logibbtn.click();
//
//        System.out.println("Clicked on Login button");
//
//        // Click on the "Full Name" input field and send keys to enter the username
//        WebElement Username = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.saucelabs.mydemoapp.android:id/fullNameET")));
//        Username.click();
//        Username.sendKeys("userAlpha");
//        System.out.println("Entered username 'userAlpha' in the Full Name field");


    }

    @AfterTest
    public void tearDown() {
        if (driver != null) {
            driver.quit(); // End the session after the test
        }
    }
}