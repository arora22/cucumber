package com.romal.account;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.romal.base.Config;
import com.romal.base.Constants;

/**
 * @author ROMAL.ARORA
 *
 * @description Signin Page
 */
public class SigninPage extends Config {

   public WebElement username_txtbox() {
      return getDriver().findElement(By.id("email"));
   }

   public WebElement password_txtbox() {
      return getDriver().findElement(By.id("passwd"));
   }

   public WebElement signin_btn() {
      return getDriver().findElement(By.id("SubmitLogin"));
   }

   public void login() {
      username_txtbox().sendKeys(Constants.USERNAME);
      password_txtbox().sendKeys(Constants.PASSWORD);
      signin_btn().click();
   }

}
