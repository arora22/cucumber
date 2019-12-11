package com.romal.base;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author ROMAL.ARORA
 *
 * @description Global Webdriver configuration class
 */
public class Config {

   private static WebDriver driver;

   public static WebDriver getDriver() {
      initDriver();
      return driver;
   }

   public static void setDriverNull() {
      driver = null;
   }

   public static void initDriver() {
      if (driver == null) {
         System.setProperty("webdriver.chrome.driver",
               System.getProperty("user.dir") + File.separator + "chromedriver_windows.exe");
         driver = new ChromeDriver();

         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      }
   }

}
