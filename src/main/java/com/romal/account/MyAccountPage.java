package com.romal.account;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.romal.base.Config;

/**
 * @author ROMAL.ARORA
 *
 * @description My Account Page
 */
public class MyAccountPage extends Config {

   public WebElement my_account() {
      return getDriver().findElement(By.xpath("//a[@title='View my customer account']"));
   }

   public WebElement order_history() {
      return getDriver().findElement(By.xpath("//a[@title='Orders']"));
   }

   public List<WebElement> order_refe_list() {
      return getDriver().findElements(By.cssSelector("td.footable-first-column"));
   }

   public WebElement personal_info() {
      return getDriver().findElement(By.xpath("//a[@title='Information']"));
   }

   public WebElement first_name() {
      return getDriver().findElement(By.id("firstname"));
   }

   public WebElement save_button() {
      return getDriver().findElement(By.name("submitIdentity"));
   }

   public WebElement info_change_message() {
      return getDriver().findElement(By.cssSelector("p.alert-success"));
   }

   public WebElement current_password_textbox() {
      return getDriver().findElement(By.name("old_passwd"));
   }

}
