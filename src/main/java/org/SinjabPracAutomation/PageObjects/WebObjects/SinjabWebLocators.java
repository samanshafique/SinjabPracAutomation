package org.SinjabPracAutomation.PageObjects.WebObjects;


import org.SinjabPracAutomation.Enums.WebEnums;
import org.SinjabPracAutomation.constants.FrameworkPathConstants;

import static org.SinjabPracAutomation.ConfigLoaders.JsonUtils.getValue;


public class SinjabWebLocators {
//    public static final String firstNameLocator = getValue(DemoQAEnums.FIRST_NAME, FrameworkPathConstants.LOCATORS_FILE_PATH);
//    public static final String lastNameLocator = getValue(DemoQAEnums.LAST_NAME, FrameworkPathConstants.LOCATORS_FILE_PATH);
    public static final String emailLocator = getValue(WebEnums.EMAIL, FrameworkPathConstants.WEB_LOCATORS_FILE_PATH);
    public static final String passwordLocator = getValue(WebEnums.PASSWORD, FrameworkPathConstants.WEB_LOCATORS_FILE_PATH);
    public static final String signinLocator = getValue(WebEnums.SIGN_IN, FrameworkPathConstants.WEB_LOCATORS_FILE_PATH);
    public static final String clubmangementLocator = getValue(WebEnums.CLUB_MANAGEMENT, FrameworkPathConstants.WEB_LOCATORS_FILE_PATH);
    public static final String packagemenuLocator = getValue(WebEnums.PACKAGE_MENU, FrameworkPathConstants.WEB_LOCATORS_FILE_PATH);
    public static final String packagecreateLocator = getValue(WebEnums.CREATE_PACKAGE, FrameworkPathConstants.WEB_LOCATORS_FILE_PATH);
    public static final String branchdropdownLocator = getValue(WebEnums.BRANCH_DROPDOWN, FrameworkPathConstants.WEB_LOCATORS_FILE_PATH);
    public static final String selectsportLocator = getValue(WebEnums.SELECT_SPORTS, FrameworkPathConstants.WEB_LOCATORS_FILE_PATH);
    public static final String expiryLocator = getValue(WebEnums.EXPIRY_MONTHDROPDOWN, FrameworkPathConstants.WEB_LOCATORS_FILE_PATH);
    public static final String packagecategoryLocator = getValue(WebEnums.PACKAGE_CATEGORY, FrameworkPathConstants.WEB_LOCATORS_FILE_PATH);
    public static final String packagetypeLocator = getValue(WebEnums.PACKAGE_TYPE, FrameworkPathConstants.WEB_LOCATORS_FILE_PATH);
    public static final String packageengtitleLocator = getValue(WebEnums.PACKAGE_ENGTITLE, FrameworkPathConstants.WEB_LOCATORS_FILE_PATH);
    public static final String packagearbtitleLocator = getValue(WebEnums.PACKAGE_ARBTITLE, FrameworkPathConstants.WEB_LOCATORS_FILE_PATH);
    public static final String Package_eng_descLocator = getValue(WebEnums.PACKAGE_DESENG, FrameworkPathConstants.WEB_LOCATORS_FILE_PATH);
    public static final String Package_arb_descLocator = getValue(WebEnums.PACKAGE_DESARB, FrameworkPathConstants.WEB_LOCATORS_FILE_PATH);
    public static final String PackagedurationLocator = getValue(WebEnums.PACKAGE_DURATION, FrameworkPathConstants.WEB_LOCATORS_FILE_PATH);
    public static final String Package_priceLocator = getValue(WebEnums.PACKAGE_PRICE, FrameworkPathConstants.WEB_LOCATORS_FILE_PATH);
    public static final String Package_usagecountLocator = getValue(WebEnums.PACKAGE_USAGECOUNT, FrameworkPathConstants.WEB_LOCATORS_FILE_PATH);
    public static final String Package_bookingdiscountLocator = getValue(WebEnums.PACKAGE_BOOKINGDISCOUNT, FrameworkPathConstants.WEB_LOCATORS_FILE_PATH);
    public static final String Package_draftbtnLocator = getValue(WebEnums.PACKAGE_DRAFTBTN, FrameworkPathConstants.WEB_LOCATORS_FILE_PATH);


//
}
