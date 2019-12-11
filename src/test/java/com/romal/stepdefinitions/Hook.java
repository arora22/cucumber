package com.romal.stepdefinitions;

import com.romal.base.Config;

import io.cucumber.java.After;
import io.cucumber.java.Before;

/**
 * @author ROMAL.ARORA
 *
 * @description Cucucmber Hook to configure before and after scenario helpers
 */
public class Hook {

   @Before
   public void beforeScenario() {
      System.out.println("In Before");
      Config.getDriver();
   }

   @After
   public void afterScenario() {
      System.out.println("In After");
      if (Config.getDriver() != null) {
         Config.getDriver().quit();
         Config.setDriverNull();
      }
   }
}
