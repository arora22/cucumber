package com.romal.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * @author ROMAL.ARORA
 *
 * @description Class to contain page objects and controls for Home Page
 */
public class HomePage extends Config {

   String window;

   public void open_home_page() {
      getDriver().get(Constants.BASE_URL);
   }

   public WebElement tShirtsMenuLink() {
      return getDriver().findElement(By.xpath("//div[@id='block_top_menu']/ul/li/a[@title='T-shirts']"));
   }

   public WebElement signin_link() {
      return getDriver().findElement(By.xpath("//a[@class='login']"));
   }

}
