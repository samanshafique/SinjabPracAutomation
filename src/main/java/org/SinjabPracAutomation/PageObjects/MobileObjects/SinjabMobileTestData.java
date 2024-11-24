package org.SinjabPracAutomation.PageObjects.MobileObjects;

import org.SinjabPracAutomation.Enums.MobileEnums;
import org.SinjabPracAutomation.Enums.WebEnums;
import org.SinjabPracAutomation.constants.FrameworkPathConstants;

import static org.SinjabPracAutomation.ConfigLoaders.JsonUtils.getValue;

public class SinjabMobileTestData {


    public static final String emailTestData = getValue(MobileEnums.EMAIL_FIELD, FrameworkPathConstants.MOBILE_TEST_DATA_FILE_PATH);
        public static final String phoneTestData = getValue(MobileEnums.PHONE_FIELD, FrameworkPathConstants.MOBILE_TEST_DATA_FILE_PATH);
       // public static final String otpTestData = getValue(MobileEnums.OTP_FIELDS, FrameworkPathConstants.MOBILE_TEST_DATA_FILE_PATH);
    public static final String otp1 = getValue(MobileEnums.OTP_FIELD_1, FrameworkPathConstants.MOBILE_TEST_DATA_FILE_PATH);
    public static final String otp2 = getValue(MobileEnums.OTP_FIELD_2, FrameworkPathConstants.MOBILE_TEST_DATA_FILE_PATH);
    public static final String otp3 = getValue(MobileEnums.OTP_FIELD_3, FrameworkPathConstants.MOBILE_TEST_DATA_FILE_PATH);
    public static final String otp4 = getValue(MobileEnums.OTP_FIELD_4, FrameworkPathConstants.MOBILE_TEST_DATA_FILE_PATH);
    public static final String otp5 = getValue(MobileEnums.OTP_FIELD_5, FrameworkPathConstants.MOBILE_TEST_DATA_FILE_PATH);
    public static final String otp6 = getValue(MobileEnums.OTP_FIELD_6, FrameworkPathConstants.MOBILE_TEST_DATA_FILE_PATH);
    }

