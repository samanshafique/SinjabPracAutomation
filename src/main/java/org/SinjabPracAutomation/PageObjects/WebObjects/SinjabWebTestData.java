package org.SinjabPracAutomation.PageObjects.WebObjects;

import org.SinjabPracAutomation.Enums.DemoQAEnums;
import org.SinjabPracAutomation.Enums.WebEnums;
import org.SinjabPracAutomation.constants.FrameworkPathConstants;

import static org.SinjabPracAutomation.ConfigLoaders.JsonUtils.getValue;

public class SinjabWebTestData {
//        public static final String firstNameTestData = getValue(DemoQAEnums.FIRST_NAME, FrameworkPathConstants.TEST_DATA_FILE_PATH);
//        public static final String lastNameTestData = getValue(DemoQAEnums.LAST_NAME, FrameworkPathConstants.TEST_DATA_FILE_PATH);
        public static final String emailTestData = getValue(WebEnums.EMAIL, FrameworkPathConstants.WEB_TEST_DATA_FILE_PATH);
        public static final String passwordTestData = getValue(WebEnums.PASSWORD, FrameworkPathConstants.WEB_TEST_DATA_FILE_PATH);
    public static final String PackageEngTitleTestData = getValue(WebEnums.PACKAGE_ENGTITLE, FrameworkPathConstants.WEB_TEST_DATA_FILE_PATH);
    public static final String PackageArbTitleTestData = getValue(WebEnums.PACKAGE_ARBTITLE, FrameworkPathConstants.WEB_TEST_DATA_FILE_PATH);
    public static final String PackageEngDesTestData = getValue(WebEnums.PACKAGE_DESENG, FrameworkPathConstants.WEB_TEST_DATA_FILE_PATH);
    public static final String PackageArbDesTestData = getValue(WebEnums.PACKAGE_DESARB, FrameworkPathConstants.WEB_TEST_DATA_FILE_PATH);
    public static final String PackagePriceTestData = getValue(WebEnums.PACKAGE_PRICE, FrameworkPathConstants.WEB_TEST_DATA_FILE_PATH);
    public static final String PackageUsageTestData = getValue(WebEnums.PACKAGE_USAGECOUNT, FrameworkPathConstants.WEB_TEST_DATA_FILE_PATH);
    public static final String PackageBookingDiscountTestData = getValue(WebEnums.PACKAGE_BOOKINGDISCOUNT, FrameworkPathConstants.WEB_TEST_DATA_FILE_PATH);





    }

