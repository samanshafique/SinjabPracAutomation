package Mobile;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.SinjabPracAutomation.PageObjects.MobileObjects.SinjabMobileObject;
import org.SinjabPracAutomation.drivers.MobileDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class NegativeMobileLogin {

    private AndroidDriver driver;

    public void setUp() {
        MobileDriverManager.setUpMobileDriver();

    }

    @Test
    public void testEmptyPhoneNumberField() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement startBtn = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.setpoint.android.dev:id/bStart")));
        startBtn.click();

        WebElement proceedBtn = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.setpoint.android.dev:id/btnProceed")));
        proceedBtn.click();

        WebElement signinBtn = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.setpoint.android.dev:id/bSignIn")));
        signinBtn.click(); // Click without entering a phone number

        WebElement errorMsg = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.setpoint.android.dev:id/tvError")));
        Assert.assertEquals(errorMsg.getText(), "Phone number is required", "Error message mismatch for empty phone number.");
    }

    @Test
    public void testInvalidPhoneNumberFormat() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement startBtn = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.setpoint.android.dev:id/bStart")));
        startBtn.click();

        WebElement proceedBtn = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.setpoint.android.dev:id/btnProceed")));
        proceedBtn.click();

        WebElement phoneInput = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.setpoint.android.dev:id/etPhone")));
        phoneInput.sendKeys("123ABC"); // Invalid phone number format

        WebElement signinBtn = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.setpoint.android.dev:id/bSignIn")));
        signinBtn.click();

        WebElement errorMsg = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.setpoint.android.dev:id/tvError")));
        Assert.assertEquals(errorMsg.getText(), "Invalid phone number", "Error message mismatch for invalid phone number.");
    }

    @Test
    public void testIncorrectOTP() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        // Assuming successful phone number entry and sign-in button click
        WebElement otp1 = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.setpoint.android.dev:id/one")));
        otp1.sendKeys("1");

        WebElement otp2 = driver.findElement(By.id("com.setpoint.android.dev:id/two"));
        otp2.sendKeys("2");

        WebElement otp3 = driver.findElement(By.id("com.setpoint.android.dev:id/three"));
        otp3.sendKeys("3");

        WebElement otp4 = driver.findElement(By.id("com.setpoint.android.dev:id/four"));
        otp4.sendKeys("4");

        WebElement otp5 = driver.findElement(By.id("com.setpoint.android.dev:id/five"));
        otp5.sendKeys("5");

        WebElement otp6 = driver.findElement(By.id("com.setpoint.android.dev:id/six"));
        otp6.sendKeys("6"); // Entering an incorrect OTP

        WebElement errorMsg = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.setpoint.android.dev:id/tvError")));
        Assert.assertEquals(errorMsg.getText(), "Incorrect OTP", "Error message mismatch for incorrect OTP.");
    }

    @Test
    public void testMultipleIncorrectOTPAttempts() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        for (int i = 0; i < 3; i++) { // Simulate 3 incorrect OTP attempts
            WebElement otp1 = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.setpoint.android.dev:id/one")));
            otp1.sendKeys("1");

            WebElement otp2 = driver.findElement(By.id("com.setpoint.android.dev:id/two"));
            otp2.sendKeys("1");

            WebElement otp3 = driver.findElement(By.id("com.setpoint.android.dev:id/three"));
            otp3.sendKeys("1");

            WebElement otp4 = driver.findElement(By.id("com.setpoint.android.dev:id/four"));
            otp4.sendKeys("1");

            WebElement otp5 = driver.findElement(By.id("com.setpoint.android.dev:id/five"));
            otp5.sendKeys("1");

            WebElement otp6 = driver.findElement(By.id("com.setpoint.android.dev:id/six"));
            otp6.sendKeys("1"); // Entering an incorrect OTP

            Thread.sleep(1000); // Wait for error message
        }

        WebElement errorMsg = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.setpoint.android.dev:id/tvError")));
        Assert.assertEquals(errorMsg.getText(), "Too many incorrect attempts. Please try later.",
                "Error message mismatch for multiple incorrect OTP attempts.");
    }

    @Test
    public void testNoInternetConnection() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        // Simulate disabling internet (manually or via code in the test setup)
        WebElement startBtn = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.setpoint.android.dev:id/bStart")));
        startBtn.click();

        WebElement proceedBtn = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.setpoint.android.dev:id/btnProceed")));
        proceedBtn.click();

        WebElement phoneInput = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.setpoint.android.dev:id/etPhone")));
        phoneInput.sendKeys("3083453514");

        WebElement signinBtn = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.setpoint.android.dev:id/bSignIn")));
        signinBtn.click();

        WebElement errorMsg = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.setpoint.android.dev:id/tvError")));
        Assert.assertEquals(errorMsg.getText(), "No internet connection", "Error message mismatch for no internet connection.");
    }




    // Add other test methods similarly

    @AfterTest
    public void tearDown() {
        if (driver != null) {
            driver.quit(); // End the session after the test
        }
    }
}

