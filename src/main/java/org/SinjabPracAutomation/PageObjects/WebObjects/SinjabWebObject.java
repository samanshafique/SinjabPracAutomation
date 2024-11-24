package org.SinjabPracAutomation.PageObjects.WebObjects;


import org.SinjabPracAutomation.Enums.WebEnums;
import org.SinjabPracAutomation.constants.FrameworkPathConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import static org.SinjabPracAutomation.ConfigLoaders.JsonUtils.getValue;
import static org.SinjabPracAutomation.PageObjects.WebObjects.SinjabWebLocators.*;
import static org.SinjabPracAutomation.PageObjects.WebObjects.SinjabWebTestData.*;
import static org.SinjabPracAutomation.Utilities.Utility.scrollToElement;

import static org.SinjabPracAutomation.drivers.WebDriverManager.getWebDriver;


public class SinjabWebObject {
    Actions actions = new Actions(getWebDriver());
    public void navigateToSinjabWeb() {
        getWebDriver().get(getValue(WebEnums.URL, FrameworkPathConstants.WEB_TEST_DATA_FILE_PATH));
    }


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

    public void ClubManagement(){
        WebElement club = getWebDriver().findElement(By.xpath(clubmangementLocator));
        scrollToElement(club);
        club.click();


    }

    public void PackageMenu(){
        WebElement packagemenu = getWebDriver().findElement(By.xpath(packagemenuLocator));
        scrollToElement(packagemenu);
        packagemenu.click();

    }

    public void CreatePackage(){
        WebElement createpackage = getWebDriver().findElement(By.xpath(packagecreateLocator));
        scrollToElement(createpackage);
        createpackage.click();

    }

    public void BranchDropDown(){
        WebElement branchdropdown = getWebDriver().findElement(By.id(branchdropdownLocator));
        scrollToElement(branchdropdown);
        branchdropdown.click();
        //  Thread.sleep(1000);

        actions.sendKeys(Keys.SPACE).perform();


    }

    public void SelectSport(){
        WebElement selectsport = getWebDriver().findElement(By.xpath(selectsportLocator));
        scrollToElement(selectsport);
        selectsport.click();
        actions.sendKeys(Keys.ARROW_DOWN) // Navigate to the first option
                .sendKeys(Keys.ARROW_DOWN) // Navigate to the second option
                .sendKeys(Keys.ENTER)     // Select the second option
                .perform();

    }
    public void PackageExpiry(){
        WebElement packageexpiry = getWebDriver().findElement(By.id(expiryLocator));
        scrollToElement(packageexpiry);
        new Select(packageexpiry).selectByVisibleText("3 Months");

    }
    public void PackageCategory(){
        WebElement packagecategory = getWebDriver().findElement(By.id(packagecategoryLocator));
        scrollToElement(packagecategory);
        new Select(packagecategory).selectByVisibleText("Court");

    }
    public void PackageType(){
        WebElement packagetype = getWebDriver().findElement(By.id(packagetypeLocator));
        scrollToElement(packagetype);
        new Select(packagetype).selectByVisibleText("gold");

    }
    public void PackageTitleEng(){
        WebElement engtitle = getWebDriver().findElement(By.cssSelector(packageengtitleLocator));
        scrollToElement(engtitle);
        engtitle.sendKeys(PackageEngTitleTestData);


    }
    public void PackageTitleArb(){
        WebElement arbtitle = getWebDriver().findElement(By.cssSelector(packagearbtitleLocator));
        scrollToElement(arbtitle);
        arbtitle.sendKeys(PackageArbTitleTestData);

    }
    public void PackageDesEng(){
        WebElement engdes = getWebDriver().findElement(By.id(Package_eng_descLocator));
        scrollToElement(engdes);
        engdes.sendKeys(PackageEngDesTestData);

    }
    public void PackageDesArb(){
        WebElement arbdes = getWebDriver().findElement(By.id(Package_arb_descLocator));
        scrollToElement(arbdes);
        arbdes.sendKeys(PackageArbDesTestData);

    }

    public void PackageDuration(){
        WebElement pacakgeduration = getWebDriver().findElement(By.id(PackagedurationLocator));
        scrollToElement(pacakgeduration);
        pacakgeduration.click();
        new Select(pacakgeduration).selectByVisibleText("90");
    }

    public void PackagePrice(){
        WebElement price = getWebDriver().findElement(By.id(Package_priceLocator));
        scrollToElement(price);
        price.sendKeys(PackagePriceTestData);

    }
    public void PackageUsage(){
        WebElement usagecount = getWebDriver().findElement(By.id(Package_usagecountLocator));
        scrollToElement(usagecount);
        usagecount.sendKeys(PackageUsageTestData);

    }
    public void PackageBookingDiscount(){
        WebElement bookingdicount = getWebDriver().findElement(By.id(Package_bookingdiscountLocator));
        scrollToElement(bookingdicount);
        bookingdicount.sendKeys(PackageBookingDiscountTestData);

    }
    public void DraftBtn(){
        WebElement draftbtn = getWebDriver().findElement(By.xpath(Package_draftbtnLocator));
        scrollToElement(draftbtn);
        draftbtn.click();

    }










}
