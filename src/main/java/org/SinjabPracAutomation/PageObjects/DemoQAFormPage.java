package org.SinjabPracAutomation.PageObjects;

import org.SinjabPracAutomation.Enums.DemoQAEnums;
import org.SinjabPracAutomation.constants.FrameworkPathConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.SinjabPracAutomation.ConfigLoaders.JsonUtils.getValue;
import static org.SinjabPracAutomation.PageObjects.DemoQAFormPageLocators.*;
import static org.SinjabPracAutomation.PageObjects.DemoQAFormPageTestData.*;
import static org.SinjabPracAutomation.Utilities.Utility.scrollToElement;
import static org.SinjabPracAutomation.drivers.WebDriverManager.getWebDriver;

public class DemoQAFormPage {

    public void navigateToDemoQAPage() {
        getWebDriver().get(getValue(DemoQAEnums.URL, FrameworkPathConstants.TEST_DATA_FILE_PATH));
    }

    public void fillFirstName(){
        WebElement firstName = getWebDriver().findElement(By.id(firstNameLocator));
        scrollToElement(firstName);
        firstName.sendKeys(firstNameTestData);
    }

    public void fillLastName(){
        WebElement lastName = getWebDriver().findElement(By.id(lastNameLocator));
        scrollToElement(lastName);
        lastName.sendKeys(lastNameTestData);
    }

    public void fillUserEmail(){
        WebElement userEmail = getWebDriver().findElement(By.id(emailLocator));
        scrollToElement(userEmail);
        userEmail.sendKeys(emailTestData);
    }

}
