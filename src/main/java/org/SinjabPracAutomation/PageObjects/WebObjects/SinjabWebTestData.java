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
       // public static final String currentAddressTestData = getValue(WebEnums.SIGN_IN, FrameworkPathConstants.TEST_DATA_FILE_PATH);
//        public static final String dateOfBirthTestData = getValue(DemoQAEnums.DATE_OF_BIRTH, FrameworkPathConstants.TEST_DATA_FILE_PATH);
//        public static final String subjectTestData = getValue(DemoQAEnums.SUBJECT, FrameworkPathConstants.TEST_DATA_FILE_PATH);

    }
