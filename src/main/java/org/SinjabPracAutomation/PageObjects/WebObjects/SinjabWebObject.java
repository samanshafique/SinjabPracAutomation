package org.SinjabPracAutomation.PageObjects.WebObjects;


import org.SinjabPracAutomation.Enums.WebEnums;
import org.SinjabPracAutomation.constants.FrameworkPathConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.SinjabPracAutomation.ConfigLoaders.JsonUtils.getValue;
import static org.SinjabPracAutomation.PageObjects.WebObjects.SinjabWebLocators.*;
import static org.SinjabPracAutomation.PageObjects.WebObjects.SinjabWebTestData.*;
import static org.SinjabPracAutomation.Utilities.Utility.scrollToElement;
import static org.SinjabPracAutomation.drivers.WebDriverManager.getWebDriver;


public class SinjabWebObject {

    public void navigateToSinjabWeb() {
        getWebDriver().get(getValue(WebEnums.URL, FrameworkPathConstants.WEB_TEST_DATA_FILE_PATH));
    }

//    public void fillFirstName(){
//        WebElement firstName = getWebDriver().findElement(By.id(firstNameLocator));
//        scrollToElement(firstName);
//        firstName.sendKeys(firstNameTestData);
//    }
//


    public void fillUserEmail(){
        WebElement userEmail = getWebDriver().findElement(By.cssSelector(emailLocator));
        scrollToElement(userEmail);
        userEmail.sendKeys(emailTestData);
    }

        public void fillPassword(){
        WebElement password = getWebDriver().findElement(By.cssSelector(passwordLocator));
        scrollToElement(password);
            password.sendKeys(passwordTestData);
    }

        public void SigninBtn(){
        WebElement signin = getWebDriver().findElement(By.xpath(signinLocator));
        scrollToElement(signin);
        signin.click();

    }
//
//    public void fillLastName(){
////        WebElement lastName = getWebDriver().findElement(By.id(passwordLocator));
////        scrollToElement(lastName);
////        lastName.sendKeys(passwordTestData);
////    }//    public void fillLastName(){
////        WebElement lastName = getWebDriver().findElement(By.id(passwordLocator));
////        scrollToElement(lastName);
////        lastName.sendKeys(passwordTestData);
////    }



}
