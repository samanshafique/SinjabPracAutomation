package Mobile;

import org.SinjabPracAutomation.drivers.MobileDriverManager;
import org.SinjabPracAutomation.PageObjects.MobileObjects.SinjabMobileObject;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SinjabMobileTestCase {

    private SinjabMobileObject sinjabMobile;

    @BeforeClass
    public void setUp() {
        MobileDriverManager.setUpMobileDriver();
        sinjabMobile = new SinjabMobileObject();
    }


    @Test
    public void testMobileLogin() throws InterruptedException {
        Thread.sleep(2000);
        sinjabMobile.clickStartButton();
        Thread.sleep(2000);
        sinjabMobile.clickDoneButton();
        Thread.sleep(3000);
        sinjabMobile.fillEmail();
        sinjabMobile.fillPhone();
        Thread.sleep(2000);
        sinjabMobile.clickSignInButton();
        Thread.sleep(2000);
        sinjabMobile.enterOTP();
        Thread.sleep(5000);
        sinjabMobile.clickExploreAllClubs();
        Thread.sleep(2000);
        sinjabMobile.clickPopupOkButton();
        Thread.sleep(2000);
        sinjabMobile.clickLocationAccessButton();
        Thread.sleep(2000);
        sinjabMobile.clickShahrukhClub();
        Thread.sleep(2000);
        sinjabMobile.clickBookActivity();
        Thread.sleep(2000);
        sinjabMobile.clickBookMatch();
        Thread.sleep(2000);
        sinjabMobile.selectDate();
        Thread.sleep(2000);
        sinjabMobile.selectSport();
        Thread.sleep(3000);
        sinjabMobile.selectTimeSlot();
        Thread.sleep(2000);
        sinjabMobile.clickProceedButton();
        Thread.sleep(2000);
        sinjabMobile.clickPayButton();



    }

    @AfterSuite
    public void tearDown() {
        // Quit Mobile Driver
        MobileDriverManager.quitMobileDriver();
    }
}
