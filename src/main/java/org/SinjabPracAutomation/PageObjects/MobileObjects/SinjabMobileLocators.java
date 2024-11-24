package org.SinjabPracAutomation.PageObjects.MobileObjects;

import org.SinjabPracAutomation.Enums.MobileEnums;
import org.SinjabPracAutomation.constants.FrameworkPathConstants;

import java.awt.*;

import static org.SinjabPracAutomation.ConfigLoaders.JsonUtils.getValue;

public class SinjabMobileLocators {
    public static final String startButtonLocator = getValue(MobileEnums.START_BTN, FrameworkPathConstants.MOBILE_LOCATORS_FILE_PATH);
    public static final String doneButtonLocator = getValue(MobileEnums.DONE_BTN, FrameworkPathConstants.MOBILE_LOCATORS_FILE_PATH);
    public static final String emailFieldLocator = getValue(MobileEnums.EMAIL_FIELD, FrameworkPathConstants.MOBILE_LOCATORS_FILE_PATH);
    public static final String phoneFieldLocator = getValue(MobileEnums.PHONE_FIELD, FrameworkPathConstants.MOBILE_LOCATORS_FILE_PATH);
    public static final String signinButtonLocator = getValue(MobileEnums.SIGNIN_BTN, FrameworkPathConstants.MOBILE_LOCATORS_FILE_PATH);
    public static final String otpField1Locator = getValue(MobileEnums.OTP_FIELD_1, FrameworkPathConstants.MOBILE_LOCATORS_FILE_PATH);
    public static final String otpField2Locator = getValue(MobileEnums.OTP_FIELD_2, FrameworkPathConstants.MOBILE_LOCATORS_FILE_PATH);
    public static final String otpField3Locator = getValue(MobileEnums.OTP_FIELD_3, FrameworkPathConstants.MOBILE_LOCATORS_FILE_PATH);
    public static final String otpField4Locator = getValue(MobileEnums.OTP_FIELD_4, FrameworkPathConstants.MOBILE_LOCATORS_FILE_PATH);
    public static final String otpField5Locator = getValue(MobileEnums.OTP_FIELD_5, FrameworkPathConstants.MOBILE_LOCATORS_FILE_PATH);
    public static final String otpField6Locator = getValue(MobileEnums.OTP_FIELD_6, FrameworkPathConstants.MOBILE_LOCATORS_FILE_PATH);
    public static final String exploreClubsLocator = getValue(MobileEnums.EXPLORE_CLUBS, FrameworkPathConstants.MOBILE_LOCATORS_FILE_PATH);
    public static final String popUpOkLocator = getValue(MobileEnums.POPUP_OK_BTN, FrameworkPathConstants.MOBILE_LOCATORS_FILE_PATH);
    public static final String locationAccesLocator = getValue(MobileEnums.LOCATION_ACCESS_BTN, FrameworkPathConstants.MOBILE_LOCATORS_FILE_PATH);
    public static final String ShahrukhClubLocator = getValue(MobileEnums.SHAHRUKH_CLUB, FrameworkPathConstants.MOBILE_LOCATORS_FILE_PATH);
    public static final String bookActivtyBtnLocator = getValue(MobileEnums.BOOK_ACTIVITY_BTN, FrameworkPathConstants.MOBILE_LOCATORS_FILE_PATH);
    public static final String bookMatchbtnLocator = getValue(MobileEnums.BOOK_MATCH_BTN, FrameworkPathConstants.MOBILE_LOCATORS_FILE_PATH);
    public static final String SelectDateLocator = getValue(MobileEnums.SELECT_DATE, FrameworkPathConstants.MOBILE_LOCATORS_FILE_PATH);
    public static final String SelectSportLocator = getValue(MobileEnums.SELECT_SPORT, FrameworkPathConstants.MOBILE_LOCATORS_FILE_PATH);
    public static final String TimeSelectionLocator = getValue(MobileEnums.TIME_SELECTION, FrameworkPathConstants.MOBILE_LOCATORS_FILE_PATH);
    public static final String ProceedhbtnLocator = getValue(MobileEnums.PROCEED_BTN, FrameworkPathConstants.MOBILE_LOCATORS_FILE_PATH);
    public static final String paybtnLocator = getValue(MobileEnums.PAY_BTN, FrameworkPathConstants.MOBILE_LOCATORS_FILE_PATH);









    //public static final String otpFieldLocator = getValue(MobileEnums.OTP_FIELDS, FrameworkPathConstants.MOBILE_LOCATORS_FILE_PATH);
// For OTP Fields Locator
  //  public static final List<String> otpFieldLocators = getValue(MobileEnums.OTP_FIELDS, FrameworkPathConstants.MOBILE_LOCATORS_FILE_PATH); // This returns a List of locators

}