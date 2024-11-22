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
//    public static final String dateOfBirthLocator = getValue(DemoQAEnums.DATE_OF_BIRTH, FrameworkPathConstants.LOCATORS_FILE_PATH);
//    public static final String uploadPictureLocator = getValue(DemoQAEnums.UPLOAD_PICTURE, FrameworkPathConstants.LOCATORS_FILE_PATH);
//    public static final String subjectLocator = getValue(DemoQAEnums.SUBJECT, FrameworkPathConstants.LOCATORS_FILE_PATH);
//    public static final String sportsLocator = getValue(DemoQAEnums.SPORTS, FrameworkPathConstants.LOCATORS_FILE_PATH);
//    public static final String selectStateLocator = getValue(DemoQAEnums.SELECT_STATE, FrameworkPathConstants.LOCATORS_FILE_PATH);
//    public static final String selectCityLocator = getValue(DemoQAEnums.SELECT_CITY, FrameworkPathConstants.LOCATORS_FILE_PATH);
//    public static final String submitBtnLocator = getValue(DemoQAEnums.SUBMIT_BTN, FrameworkPathConstants.LOCATORS_FILE_PATH);
}
