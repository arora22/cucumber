package com.romal.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author ROMAL.ARORA
 *
 * @description Provides utility controls to handle Property files
 */
public class PropertyUtil {

   private static Properties prop = new Properties();

   public static void loadPropFile(String propFilePath) {
      try {
         InputStream projectInput = new FileInputStream(propFilePath);
         prop.load(projectInput);
         if (projectInput != null) {
            projectInput.close();
         }
      } catch (IOException e) {
         e.printStackTrace();
      }
   }

   public static String getProperty(String property) {
      if (prop.isEmpty()) {
         loadPropFile(Constants.PROPERTY_FILE);
      }
      return prop.getProperty(property);
   }

}
