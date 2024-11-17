//package Mobile;
//
//import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.android.options.UiAutomator2Options;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//
//import java.net.MalformedURLException;
//import java.net.URL;
//import java.time.Duration;
//
//public class mobilelogin {
//
//    private AndroidDriver driver;
//
//    @BeforeTest
//    public void setUp() throws MalformedURLException {
//        UiAutomator2Options options = new UiAutomator2Options();
//        options.setDeviceName("Pixel2API");
//        options.setPlatformName("Android"); // Android platform
//        options.setAutomationName("UiAutomator2"); // Set the automation engine
//        options.setApp("C:/Users/PMLS/Downloads/example12/example12/src/test/resources/Mobile/sinjab-v109-3.3.2-Dev.apk");
//        options.setAppPackage("com.setpoint.android.dev");
//        options.setAppActivity("com.setpoint.android.ui.activity.SplashActivity");
//
//        // Create an instance of the Android driver
//        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), options);
//    }
//
//    @Test
//    public void AppiumTest()  {
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//
////        WebElement productImage = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.saucelabs.mydemoapp.android:id/productIV")));
////        productImage.click();
////        System.out.println("Clicked on the product image");
////
////        WebElement addToCartButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.saucelabs.mydemoapp.android:id/cartBt")));
////        addToCartButton.click();
////        System.out.println("Clicked on Add to Cart button");
////
////        // Click on the Cart icon to view the cart
////        driver.findElement(By.id("com.saucelabs.mydemoapp.android:id/cartIV")).click();
////        System.out.println("Clicked on Cart icon");
////
////        // Click on "Proceed to Checkout" button
////        WebElement cartButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.saucelabs.mydemoapp.android:id/cartBt")));
////        cartButton.click();
////        System.out.println("Clicked on Proceed to Checkout button");
////
////
////
////        // Click on the user to go to the login screen
////        WebElement usericon = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.saucelabs.mydemoapp.android:id/username3TV")));
////        usericon.click();
////        System.out.println("Clicked on the user icon");
////
////        // Click on the "Login" button
////        WebElement logibbtn = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.saucelabs.mydemoapp.android:id/loginBtn")));
////        logibbtn.click();
////
////        System.out.println("Clicked on Login button");
////
////        // Click on the "Full Name" input field and send keys to enter the username
////        WebElement Username = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.saucelabs.mydemoapp.android:id/fullNameET")));
////        Username.click();
////        Username.sendKeys("userAlpha");
////        System.out.println("Entered username 'userAlpha' in the Full Name field");
//
//
//    }
//
//    @AfterTest
//    public void tearDown() {
//        if (driver != null) {
//            driver.quit(); // End the session after the test
//        }
//    }
//}