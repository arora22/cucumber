package com.romal.product;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.romal.base.Config;

/**
 * @author ROMAL.ARORA
 *
 * @description TShirt Product Category Page
 */
public class TShirtProductCategoryPage extends Config {

   String window;

   public WebElement tshirt_link() {
      return getDriver().findElement(By.xpath("//a[@class='product_img_link']/img"));
   }

   public WebElement add_to_cart_btn() {
      return getDriver().findElement(By.xpath("//p[@id='add_to_cart']/button"));
   }

   public void waitForAddToCartButton() throws Exception {
      window = getDriver().getWindowHandle();
      getDriver().switchTo().frame(getDriver().findElement(By.xpath("//iframe[starts-with(@id, 'fancybox-frame')]")));
      Thread.sleep(10000);
   }

   public void switchToDefault() {
      getDriver().switchTo().window(window);
   }

   public WebElement proceed_to_checkout_btn() {
      try {
         Thread.sleep(20000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }

      new WebDriverWait(getDriver(), 15)
            .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@title='Proceed to checkout']")));

      WebElement element = getDriver().findElement(By.xpath("//a[@title='Proceed to checkout']"));
      return element;
   }

   public WebElement proceed_to_checkout_sum_btn() {
      return getDriver().findElement(By.xpath("//div[@id='columns']//a[@title='Proceed to checkout']"));
   }

   public void proceed_to_checkout_btn_click() {
      WebElement element = getDriver().findElement(By.xpath("//div[@id='columns']//a[@title='Proceed to checkout']"));
      ((JavascriptExecutor) getDriver()).executeScript("arguments[0].click();", element);
   }

}
