//package org.SinjabPracAutomation.constants;
//
//import lombok.AccessLevel;
//import lombok.NoArgsConstructor;
//
//import java.io.File;
//
//
//@NoArgsConstructor(access = AccessLevel.PRIVATE)
//public class FrameworkPathConstants {
//
//    public static final String PROJECT_PATH = System.getProperty("user.dir");
//
//    public static final String TEST_RESOURCES_DIR = PROJECT_PATH + File.separator + "src/test/resources";
//
//    public static final String LOCATORS_FILE_PATH =
//            TEST_RESOURCES_DIR + File.separator + "locators.json";
//
//    public static final String TEST_DATA_FILE_PATH =
//            TEST_RESOURCES_DIR + File.separator + "testData.json";
//
//}

package org.SinjabPracAutomation.constants;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.io.File;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class FrameworkPathConstants {

    public static final String PROJECT_PATH = System.getProperty("user.dir");

    public static final String TEST_RESOURCES_DIR = PROJECT_PATH + File.separator + "src/test/resources";

    // Mobile-specific paths
    public static final String MOBILE_LOCATORS_FILE_PATH =
            TEST_RESOURCES_DIR + File.separator + "Mobile" + File.separator + "locators.json";

    public static final String MOBILE_TEST_DATA_FILE_PATH =
            TEST_RESOURCES_DIR + File.separator + "Mobile" + File.separator + "testData.json";

    // Web-specific paths
    public static final String WEB_LOCATORS_FILE_PATH =
            TEST_RESOURCES_DIR + File.separator + "Web" + File.separator + "locators.json";

    public static final String WEB_TEST_DATA_FILE_PATH =
            TEST_RESOURCES_DIR + File.separator + "Web" + File.separator + "testData.json";

}
