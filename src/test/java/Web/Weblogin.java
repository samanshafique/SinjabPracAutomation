package Web;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.time.Duration;

public class Weblogin {

    WebDriver driver;

    @BeforeSuite
    public void setUp() {
        WebDriverManager.chromedriver().setup();
     //   WebDriverManager.chromedriver().browserVersion("130").setup();

        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @BeforeTest
    public void setUpTest() {
        driver.get("https://dev.sinjabapps.com/login");
    }

    public void scrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    @Test
    public void TC01_Login() throws InterruptedException {
        WebElement email = driver.findElement(By.cssSelector("input[placeholder='Email']"));
        scrollToElement(email);
        email.sendKeys("saman.shafiq@nextgeni.com");

        WebElement password = driver.findElement(By.cssSelector("input[placeholder='Password']"));
        scrollToElement(password);
        password.sendKeys("123456789");

        WebElement Loginbtn = driver.findElement(By.xpath("//button[normalize-space()='SIGN IN']"));
        scrollToElement(Loginbtn);
        Loginbtn.click();

    }

    @Test
    public void TC01_PackageCreation() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement club = driver.findElement(By.xpath("//p[normalize-space()='Club Management']"));
        scrollToElement(club);
        club.click();
        Thread.sleep(5000);

        WebElement packageMenu = driver.findElement(By.xpath("//p[normalize-space()='Packages']"));

       // WebElement packageMenu = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[normalize-space()='Packages']")));
       // scrollToElement(driver.findElement(By.xpath("//p[normalize-space()='Discount Codes']")));
       scrollToElement(packageMenu);
    //    Thread.sleep(5000);
       // System.out.println(driver.findElement(By.xpath("//p[normalize-space()='Packages']")).isDisplayed()); // Should return true
        packageMenu.click();

        WebElement createPackage = driver.findElement(By.xpath("//a[normalize-space()='Create New Package']"));
        scrollToElement(createPackage);
        createPackage.click();


        WebElement branchDropdown = driver.findElement(By.id("branchesDropdown"));
        scrollToElement(branchDropdown);
        branchDropdown.click();
        Thread.sleep(1000);
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.SPACE).perform();


        WebElement selectSport = driver.findElement(By.xpath("//textarea[@placeholder='Select Sports']"));
        scrollToElement(selectSport);
        selectSport.click();
        // Assuming you want to select the second option in the dropdown
        actions.sendKeys(Keys.ARROW_DOWN) // Navigate to the first option
                .sendKeys(Keys.ARROW_DOWN) // Navigate to the second option
                .sendKeys(Keys.ENTER)     // Select the second option
                .perform();



        WebElement expiryMonthDropdown = driver.findElement(By.id("expiry_date"));
        scrollToElement(expiryMonthDropdown);// Replace with actual ID
        new Select(expiryMonthDropdown).selectByVisibleText("3 Months");  // Replace "3 months" with the desired value


        WebElement packageCategory = driver.findElement(By.id("package_category"));
        scrollToElement(packageCategory);// Replace with actual ID
        new Select(packageCategory).selectByVisibleText("Court");  // Replace "3 months" with the desired value

        WebElement packageType = driver.findElement(By.id("type"));
        scrollToElement(packageType);// Replace with actual ID
        new Select(packageType).selectByVisibleText("gold");


        WebElement PackagetitleEng = driver.findElement(By.cssSelector("input[placeholder='Package Title'][name='title[5]']"));
        scrollToElement(PackagetitleEng);
        PackagetitleEng.sendKeys("Gold Super Package");

        WebElement PackagetitleArb = driver.findElement(By.cssSelector("input[placeholder='Package Title'][name='title[6]']"));
        scrollToElement(PackagetitleArb);
        PackagetitleArb.sendKeys("Gold Super Package");

        WebElement PackageDesEng = driver.findElement(By.id("description5"));
        scrollToElement(PackageDesEng);
        PackageDesEng.sendKeys("Gold Super Package provide user Extra benefits for booking");

        WebElement PackageDesArb = driver.findElement(By.id("description6"));
        scrollToElement(PackageDesArb);
        PackageDesArb.sendKeys("Gold Super Package provide user Extra benefits for booking");


        WebElement packageDuration = driver.findElement(By.id("duration_id"));
        scrollToElement(packageDuration);// Replace with actual ID
        new Select(packageDuration).selectByVisibleText("90");

        WebElement PackagePrice = driver.findElement(By.id("price"));
        scrollToElement(PackagePrice);
        PackagePrice.sendKeys("5");

        WebElement PackageUsageCount = driver.findElement(By.id("usage_count"));
        scrollToElement(PackageUsageCount);
        PackageUsageCount.sendKeys("4");

        WebElement BookingDiscount = driver.findElement(By.id("per_booking_discount"));
        scrollToElement(BookingDiscount);
        BookingDiscount.sendKeys("2");



        WebElement Draftbtn = driver.findElement(By.xpath("//div[@class='content-wrapper']//button[1]"));
        scrollToElement(Draftbtn);
        Draftbtn.click();

//        WebElement publishbtn = driver.findElement(By.xpath("//div[@class='content-wrapper']//button[1]"));
//        scrollToElement(publishbtn);
//        publishbtn.click();


    }



    @AfterSuite
    public void tearDown() {
//        if (driver != null) {
//            driver.quit();
//        }
    }
}