package com.romal.base;

import java.io.File;

/**
 * @author ROMAL.ARORA
 *
 * @description Constants used in framework
 */
public class Constants {

   public static String PROPERTY_FILE = System.getProperty("user.dir") + File.separator + "project.properties";
   public static final String BASE_URL = PropertyUtil.getProperty("baseurl");

   public static String USERNAME = PropertyUtil.getProperty("user");
   public static String PASSWORD = PropertyUtil.getProperty("password");
}
