import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;

public class DemoQATestCase {

    WebDriver driver;

    @BeforeSuite
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @BeforeTest
    public void setUpTest() {
        driver.get("https://demoqa.com/automation-practice-form/");
    }

    public void scrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    @Test
    public void TC01_Fill_Form() throws InterruptedException {

        WebElement firstName = driver.findElement(By.id("firstName"));
        scrollToElement(firstName);
        firstName.sendKeys("Umair");

        WebElement lastName = driver.findElement(By.id("lastName"));
        scrollToElement(lastName);
        lastName.sendKeys("Khan");

        WebElement userEmail = driver.findElement(By.id("userEmail"));
        scrollToElement(userEmail);
        userEmail.sendKeys("abcd@gmail.com");

        WebElement genderMale = driver.findElement(By.cssSelector("label[for='gender-radio-1']"));
        scrollToElement(genderMale);
        genderMale.click();

        WebElement userNumber = driver.findElement(By.id("userNumber"));
        scrollToElement(userNumber);
        userNumber.sendKeys("03002677522");

        WebElement dobInput = driver.findElement(By.id("dateOfBirthInput"));
        scrollToElement(dobInput);
        dobInput.sendKeys("07 Oct 2024");
        dobInput.sendKeys(Keys.ENTER);

        WebElement subjectsInput = driver.findElement(By.id("subjectsInput"));
        scrollToElement(subjectsInput);
        subjectsInput.sendKeys("math");
        subjectsInput.sendKeys(Keys.ENTER);

        WebElement hobbiesCheckbox = driver.findElement(By.xpath("//label[normalize-space()='Sports']"));
        scrollToElement(hobbiesCheckbox);
        Thread.sleep(1000);
        hobbiesCheckbox.click();

        WebElement uploadPicture = driver.findElement(By.id("uploadPicture"));
        Thread.sleep(2000);
        uploadPicture.sendKeys("/Users/umair/IdeaProjects/example12/src/test/resources/48.jpeg");

        WebElement currentAddress = driver.findElement(By.id("currentAddress"));
        scrollToElement(currentAddress);
        currentAddress.sendKeys("xyz Karachi");

        WebElement stateDropdown = driver.findElement(By.xpath("//div[contains(text(),'Select State')]"));
        scrollToElement(stateDropdown);
        stateDropdown.click();
        Thread.sleep(1000);
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.SPACE).perform();

        WebElement cityDropdown = driver.findElement(By.xpath("//div[contains(text(),'Select City')]"));
        scrollToElement(cityDropdown);
        cityDropdown.click();
        Thread.sleep(1000);
        actions.sendKeys(Keys.SPACE).perform();

        WebElement submitButton = driver.findElement(By.id("submit"));
        scrollToElement(submitButton);
        Thread.sleep(1000);
        submitButton.sendKeys(Keys.ENTER);
    }

    @AfterSuite
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}