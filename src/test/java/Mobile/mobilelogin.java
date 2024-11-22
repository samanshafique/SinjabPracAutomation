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

import javax.swing.text.html.Option;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class mobilelogin {

    private AndroidDriver driver;

    @BeforeTest
    public void setUp() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("Pixel6TestDevice");
        options.setPlatformName("Android"); // Android platform
        options.setAutomationName("UiAutomator2"); // Set the automation engine
      //  options.setApp("C:/Users/PMLS/Downloads/example12/example12/src/test/resources/Mobile/sinjab-v109-3.3.2-Dev.apk");
 options.setApp("D:/AutomationProjects/SinjabPracAutomation/src/test/resources/Mobile/sinjab-v109-3.3.2-Dev.apk");

        options.setAppPackage("com.setpoint.android.dev");
        options.setAppActivity("com.setpoint.android.ui.activity.SplashActivity");
        //options.setAppActivity("com.setpoint.android.ui.activity.AuthActivity");
options.setFullReset(true);
options.setNoReset(false);
options.setAutoGrantPermissions(true);



        // Create an instance of the Android driver
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), options);
    }

    @Test
    public void AppiumTest() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Thread.sleep(7000);

        WebElement startbtn = driver.findElement(By.id("com.setpoint.android.dev:id/bStart"));
        startbtn.click();

        WebElement donebtn = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.setpoint.android.dev:id/btnProceed")));
        donebtn.click();

        Thread.sleep(2000);

        WebElement fullname = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.setpoint.android.dev:id/etEmail")));
        fullname.sendKeys("UserAlpha");
        System.out.println("User Email Entered");


        WebElement phone = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.setpoint.android.dev:id/etPhone")));
        phone.sendKeys("3083453514");
        System.out.println("Phone Number Entered");

      //  WebElement signInBtn = driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.setpoint.android.dev:id/bSignIn\"]\n"));
        WebElement signinBtn = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.setpoint.android.dev:id/bSignIn")));
        signinBtn.click();
        System.out.println("Click on SignIn");
        Thread.sleep(2000);


        WebElement otp1 = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.setpoint.android.dev:id/one")));
        otp1.sendKeys("0");

        WebElement otp2 = driver.findElement(By.id("com.setpoint.android.dev:id/two"));
        otp2.sendKeys("0");
        WebElement otp3 = driver.findElement(By.id("com.setpoint.android.dev:id/three"));
        otp3.sendKeys("0");
        WebElement otp4 = driver.findElement(By.id("com.setpoint.android.dev:id/four"));
        otp4.sendKeys("0");
        WebElement otp5 = driver.findElement(By.id("com.setpoint.android.dev:id/five"));
        otp5.sendKeys("0");

        WebElement otp6 = driver.findElement(By.id("com.setpoint.android.dev:id/six"));
        otp6.sendKeys("0");
        System.out.println("OTP Entered");
        Thread.sleep(10000);

        WebElement exploreAllClubs = driver.findElement(By.id("com.setpoint.android.dev:id/tvHeadingEnd"));
        exploreAllClubs.click();
        System.out.println("Clicked on the Explore all clubs");

        try {
            WebElement popupOkButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.setpoint.android.dev:id/bPositive")));
            popupOkButton.click();
            System.out.println("Allowed location access popup.");
        } catch (Exception e) {
            System.out.println("Location access popup not displayed.");

        }

        try {
            // Wait for the popup button to appear and click it
            WebElement allowButton = wait.until(ExpectedConditions.presenceOfElementLocated(
                    By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button")));
            allowButton.click();
            System.out.println("Clicked on 'While using the app' to allow location access.");
        } catch (Exception e) {
            System.out.println("Permission popup not displayed or already handled.");
        }

        WebElement shahrukhclub = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.setpoint.android.dev:id/tvName\" and @text=\"Shahrukh - Testing- Shahrukh-Riyadh Branch\"]"));
        shahrukhclub.click();
        System.out.println("Clicked on Shahrukh club");

        Thread.sleep(2000);
        WebElement bookActivity = driver.findElement(By.id("com.setpoint.android.dev:id/bActivity"));
        bookActivity.click();
        System.out.println("Clicked on book club");

        Thread.sleep(3000);
        WebElement bookMatch = driver.findElement(By.id("com.setpoint.android.dev:id/tvBookMatch"));
        bookMatch.click();
        System.out.println("Clicked on Book a court");

        Thread.sleep(3000);
        WebElement selectDate = driver.findElement(By.xpath("(//android.widget.LinearLayout[@resource-id=\"com.setpoint.android.dev:id/container\"])[3]"));
        selectDate.click();
        System.out.println("Date Selected");

        Thread.sleep(2000);
        WebElement selectSport = driver.findElement(By.xpath("(//android.view.ViewGroup[@resource-id=\"com.setpoint.android.dev:id/customChipView\"])[3]/android.widget.LinearLayout"));
        selectSport.click();
        System.out.println("Sport Selected");


        WebElement timeselection = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//android.view.ViewGroup[@resource-id=\"com.setpoint.android.dev:id/tvTime\"])[7]/android.widget.LinearLayout")));
        timeselection.click();
        System.out.println("Clicked on time Slot");


        WebElement logibbtn = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.setpoint.android.dev:id/button")));
        logibbtn.click();
        System.out.println("Clicked on proceed button");


        try {
            // Locate the toggle switch
            WebElement toggleSwitch = wait.until(ExpectedConditions.presenceOfElementLocated(
                    By.id("com.setpoint.android.devid:id/switchBtn")));

            // Get the current state of the toggle
            String toggleState = toggleSwitch.getAttribute("checked");
            System.out.println("Current toggle state: " + toggleState);

            // If the toggle is OFF, click to turn it ON
            if (toggleState.equals("false")) {
                toggleSwitch.click();
                System.out.println("Toggle switched ON.");
            } else {
                System.out.println("Toggle is already ON.");
            }
        } catch (Exception e) {
            System.out.println("Failed to handle the toggle switch: " + e.getMessage());
        }

        Thread.sleep(2000);

        WebElement paybtn = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.setpoint.android.dev:id/bProceed")));
        paybtn.click();
        System.out.println("Payment Button Clicked");


    }

    @AfterTest
    public void tearDown() {
        if (driver != null) {
            driver.quit(); // End the session after the test
        }
    }
}