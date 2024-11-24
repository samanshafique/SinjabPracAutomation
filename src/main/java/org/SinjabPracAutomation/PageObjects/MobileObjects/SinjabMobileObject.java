
package org.SinjabPracAutomation.PageObjects.MobileObjects;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.SinjabPracAutomation.PageObjects.MobileObjects.SinjabMobileLocators.*;
import static org.SinjabPracAutomation.PageObjects.MobileObjects.SinjabMobileTestData.*;
import static org.SinjabPracAutomation.Utilities.Utility.scrollToElement;
import static org.SinjabPracAutomation.drivers.MobileDriverManager.getMobileDriver;

public class SinjabMobileObject {

    public void clickStartButton() throws InterruptedException {
        Thread.sleep(4000);  // Sleep to allow time for splash screen or other initialization
        WebElement startButton = getMobileDriver().findElement(By.id(startButtonLocator));
        startButton.click();  // Directly clicking the button
    }

    public void clickDoneButton() throws InterruptedException {
        Thread.sleep(3000);  // Adjust sleep time as needed
        WebElement doneButton = getMobileDriver().findElement(By.id(doneButtonLocator));
        //scrollToElement(doneButton);  // Scroll to the element if necessary
        doneButton.click();
    }

    public void fillEmail() throws InterruptedException {
        Thread.sleep(3000);  // Wait for the email field to be visible
        WebElement emailField = getMobileDriver().findElement(By.id(emailFieldLocator));
      //  scrollToElement(emailField);
        emailField.sendKeys(emailTestData);
    }

    public void fillPhone() throws InterruptedException {
        Thread.sleep(2000);  // Wait for the phone field to be visible
        WebElement phoneField = getMobileDriver().findElement(By.id(phoneFieldLocator));
      //  scrollToElement(phoneField);
        phoneField.sendKeys(phoneTestData);
    }

    public void clickSignInButton() throws InterruptedException {
        Thread.sleep(2000);  // Adjust sleep time as needed
        WebElement signinButton = getMobileDriver().findElement(By.id(signinButtonLocator));
        signinButton.click();
    }

    public void enterOTP() throws InterruptedException {
        Thread.sleep(2000);  // Wait for the OTP fields to be visible

        WebElement otpField1 = getMobileDriver().findElement(By.id(otpField1Locator));
        otpField1.sendKeys(otp1);

        WebElement otpField2 = getMobileDriver().findElement(By.id(otpField2Locator));
        otpField2.sendKeys(otp2);

        WebElement otpField3 = getMobileDriver().findElement(By.id(otpField3Locator));
        otpField3.sendKeys(otp3);

        WebElement otpField4 = getMobileDriver().findElement(By.id(otpField4Locator));
        otpField4.sendKeys(otp4);

        WebElement otpField5 = getMobileDriver().findElement(By.id(otpField5Locator));
        otpField5.sendKeys(otp5);

        WebElement otpField6 = getMobileDriver().findElement(By.id(otpField6Locator));
        otpField6.sendKeys(otp6);
    }
    public void clickExploreAllClubs() throws InterruptedException {
        Thread.sleep(3000);
        WebElement exploreAllClubs = getMobileDriver().findElement(By.id(exploreClubsLocator));
        exploreAllClubs.click();
      //  System.out.println("Clicked on the Explore all clubs");
    }

    public void clickPopupOkButton() {
        WebDriverWait wait = new WebDriverWait(getMobileDriver(), Duration.ofSeconds(10));
        try {
            WebElement popupOkButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.id(popUpOkLocator)));
            popupOkButton.click();
            System.out.println("Allowed location access popup.");
        } catch (Exception e) {
            System.out.println("Location access popup not displayed.");
        }
    }

    public void clickLocationAccessButton() {
        WebDriverWait wait = new WebDriverWait(getMobileDriver(), Duration.ofSeconds(10));
        try {
            WebElement allowButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.id(locationAccesLocator)));
            allowButton.click();
            System.out.println("Clicked on 'While using the app' to allow location access.");
        } catch (Exception e) {
            System.out.println("Permission popup not displayed or already handled.");
        }
    }


    public void clickShahrukhClub() {
        WebElement shahrukhClub = getMobileDriver().findElement(By.xpath(ShahrukhClubLocator));
        shahrukhClub.click();
        System.out.println("Clicked on Shahrukh club");
    }

    public void clickBookActivity() throws InterruptedException {
        Thread.sleep(2000); // Add delay for stability
        WebElement bookActivity = getMobileDriver().findElement(By.id(bookActivtyBtnLocator));
        bookActivity.click();
        System.out.println("Clicked on book club");
    }

    public void clickBookMatch() throws InterruptedException {
        Thread.sleep(3000); // Add delay for stability
        WebElement bookMatch = getMobileDriver().findElement(By.id(bookMatchbtnLocator));
        bookMatch.click();
        System.out.println("Clicked on Book a court");
    }

    public void selectDate() throws InterruptedException {
        Thread.sleep(3000); // Add delay for stability
        WebElement selectDate = getMobileDriver().findElement(By.xpath(SelectDateLocator));
        selectDate.click();
        System.out.println("Date Selected");
    }

    public void selectSport() throws InterruptedException {
        Thread.sleep(2000); // Add delay for stability
        WebElement selectSport = getMobileDriver().findElement(By.xpath(SelectSportLocator));
        selectSport.click();
        System.out.println("Sport Selected");
    }

    public void selectTimeSlot() throws InterruptedException {
        Thread.sleep(2000);
        WebElement timeSelection = getMobileDriver().findElement(By.xpath(TimeSelectionLocator));
        timeSelection.click();
        System.out.println("Clicked on time Slot");
    }

    public void clickProceedButton() {
        WebElement proceedButton =getMobileDriver().findElement(By.id(ProceedhbtnLocator));
        proceedButton.click();
        System.out.println("Clicked on proceed button");
    }

//    public void handleToggleSwitch() {
//        try {
//            WebElement toggleSwitch = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.setpoint.android.devid:id/switchBtn")));
//            String toggleState = toggleSwitch.getAttribute("checked");
//            System.out.println("Current toggle state: " + toggleState);
//
//            if (toggleState.equals("false")) {
//                toggleSwitch.click();
//                System.out.println("Toggle switched ON.");
//            } else {
//                System.out.println("Toggle is already ON.");
//            }
//        } catch (Exception e) {
//            System.out.println("Failed to handle the toggle switch: " + e.getMessage());
//        }
//    }

    public void clickPayButton() {

        WebElement payButton =getMobileDriver().findElement(By.id(paybtnLocator));

        payButton.click();
        System.out.println("Payment Button Clicked");
    }

}
