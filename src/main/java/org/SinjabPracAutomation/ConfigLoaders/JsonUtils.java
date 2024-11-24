//package org.SinjabPracAutomation.ConfigLoaders;
//
//import com.jayway.jsonpath.JsonPath;
//import lombok.AccessLevel;
//import lombok.NoArgsConstructor;
//import org.SinjabPracAutomation.CustomExceptions.InvalidPathException;
//import org.SinjabPracAutomation.Enums.WebEnums;
//
//import java.io.File;
//import java.io.IOException;
//import java.util.Map;
//
//@NoArgsConstructor(access = AccessLevel.PRIVATE)
//public final class JsonUtils {
//
//  private static Map < String, String > map;
//
//  public static String getValue(WebEnums key, String filePath) {
//    try {
//      return JsonPath.read(new File(filePath), key.toString().toLowerCase());
//    } catch (IOException e) {
//      throw new InvalidPathException("Can't read file, check the config.json");
//    }
//  }
//
//
//}

package org.SinjabPracAutomation.ConfigLoaders;

import com.jayway.jsonpath.JsonPath;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.SinjabPracAutomation.CustomExceptions.InvalidPathException;

import java.io.File;
import java.io.IOException;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class JsonUtils {

  // Generic method to support any enum type
  public static <E extends Enum<E>> String getValue(E key, String filePath) {
    try {
      // Read the JSON using the key's name (converts Enum to lowercase key)
      return JsonPath.read(new File(filePath), key.name().toLowerCase());
    } catch (IOException e) {
      throw new InvalidPathException("Can't read file, check the config.json");
    }
  }
}
