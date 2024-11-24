
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

        Thread.sleep(1000);
        sinjabwebpage.ClubManagement();
        Thread.sleep(3000);
        sinjabwebpage.PackageMenu();
        sinjabwebpage.CreatePackage();
        sinjabwebpage.BranchDropDown();
        sinjabwebpage.SelectSport();
        sinjabwebpage.PackageExpiry();
        sinjabwebpage.PackageCategory();
        sinjabwebpage.PackageType();
        sinjabwebpage.PackageTitleEng();
        sinjabwebpage.PackageTitleArb();
        sinjabwebpage.PackageDesEng();
        sinjabwebpage.PackageDesArb();
        sinjabwebpage.PackageDuration();
        sinjabwebpage.PackagePrice();
        sinjabwebpage.PackageUsage();
        sinjabwebpage.PackageBookingDiscount();
        sinjabwebpage.DraftBtn();

    }




//    @AfterTest
//    public void TearDown() {
//        closeWebDriver();
//    }

    @AfterSuite
    public void tearDown() {
        sinjabwebpage = null;
        quitWebDriver();
    }
}