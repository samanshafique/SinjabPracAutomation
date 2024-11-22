
import org.SinjabPracAutomation.PageObjects.WebObjects.SinjabWebObject;
import org.testng.annotations.*;

import static org.SinjabPracAutomation.drivers.WebDriverManager.*;

public class SinjabPageObjectModelTestCase {

    SinjabWebObject sinjabwebpage;

    @BeforeSuite
    public void setUp() {
        setUpWebDriver();
        maximizeWindow();
        sinjabwebpage = new SinjabWebObject();
    }

    @BeforeTest
    public void setUpTest() {
        sinjabwebpage.navigateToSinjabWeb();
    }

    @Test
    public void TC01_LoginForm() throws InterruptedException {

        sinjabwebpage.fillUserEmail();
        sinjabwebpage.fillPassword();
        sinjabwebpage.SigninBtn();

//        WebElement genderMale = driver.findElement(By.cssSelector("label[for='gender-radio-1']"));
//        scrollToElement(genderMale);
//        genderMale.click();
//
//        WebElement userNumber = driver.findElement(By.id("userNumber"));
//        scrollToElement(userNumber);
//        userNumber.sendKeys("03002677522");
//
//        WebElement dobInput = driver.findElement(By.id("dateOfBirthInput"));
//        scrollToElement(dobInput);
//        dobInput.sendKeys("07 Oct 2024");
//        dobInput.sendKeys(Keys.ENTER);
//
//        WebElement subjectsInput = driver.findElement(By.id("subjectsInput"));
//        scrollToElement(subjectsInput);
//        subjectsInput.sendKeys("math");
//        subjectsInput.sendKeys(Keys.ENTER);
//
//        WebElement hobbiesCheckbox = driver.findElement(By.xpath("//label[normalize-space()='Sports']"));
//        scrollToElement(hobbiesCheckbox);
//        Thread.sleep(1000);
//        hobbiesCheckbox.click();
//
//        WebElement uploadPicture = driver.findElement(By.id("uploadPicture"));
//        Thread.sleep(2000);
//        uploadPicture.sendKeys("/Users/umair/IdeaProjects/example12/src/test/resources/48.jpeg");
//
//        WebElement currentAddress = driver.findElement(By.id("currentAddress"));
//        scrollToElement(currentAddress);
//        currentAddress.sendKeys("xyz Karachi");
//
//        WebElement stateDropdown = driver.findElement(By.xpath("//div[contains(text(),'Select State')]"));
//        scrollToElement(stateDropdown);
//        stateDropdown.click();
//        Thread.sleep(1000);
//        Actions actions = new Actions(driver);
//        actions.sendKeys(Keys.SPACE).perform();
//
//        WebElement cityDropdown = driver.findElement(By.xpath("//div[contains(text(),'Select City')]"));
//        scrollToElement(cityDropdown);
//        cityDropdown.click();
//        Thread.sleep(1000);
//        actions.sendKeys(Keys.SPACE).perform();
//
//        WebElement submitButton = driver.findElement(By.id("submit"));
//        scrollToElement(submitButton);
//        Thread.sleep(1000);
//        submitButton.sendKeys(Keys.ENTER);
    }




    @AfterTest
    public void TearDown() {
        closeWebDriver();
    }

    @AfterSuite
    public void tearDown() {
        sinjabwebpage = null;
        quitWebDriver();
    }
}