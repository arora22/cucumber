package com.romal.shoping;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.romal.base.Config;

/**
 * @author ROMAL.ARORA
 *
 * @description Shipping DetailPage
 */
public class ShoppingPage extends Config {

   public WebElement order_proceed_btn() {
      return getDriver().findElement(By.name("processAddress"));
   }

   public WebElement terms_agree_checkboxreturn() {

      return getDriver().findElement(By.xpath("//p[@class='checkbox']//span[not(@class='checked')]/input"));
   }

   public WebElement process_proceed_btn() {
      return getDriver().findElement(By.name("processCarrier"));
   }

   public WebElement pay_by_check_btn() {
      return getDriver().findElement(By.xpath("//a[@title='Pay by check.']"));
   }

   public WebElement confirm_order_btn() {
      return getDriver().findElement(By.xpath("//span[text()='I confirm my order']"));
   }

   public WebElement order_confirmation_txt() {
      return getDriver().findElement(By.cssSelector("p.alert.alert-success"));
   }

   public WebElement getOrderRef() {
      return getDriver().findElement(By.xpath("//div[@class='box order-confirmation']"));
   }

}
