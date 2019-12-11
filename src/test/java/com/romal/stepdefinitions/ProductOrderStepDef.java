package com.romal.stepdefinitions;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.romal.account.MyAccountPage;
import com.romal.account.SigninPage;
import com.romal.base.HomePage;
import com.romal.product.TShirtProductCategoryPage;
import com.romal.shoping.ShoppingPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

/**
 * @author ROMAL.ARORA
 *
 * @description Step Definition for Product Order
 */
public class ProductOrderStepDef {

   HomePage homePage = new HomePage();
   MyAccountPage myAc = new MyAccountPage();
   SigninPage signPage = new SigninPage();
   TShirtProductCategoryPage tShirt = new TShirtProductCategoryPage();
   ShoppingPage shop = new ShoppingPage();

   String orderRefNo;

   @Given("User opens Home Page")
   public void user_opens_Home_Page() {
      homePage.open_home_page();
   }

   @Then("User clicks Tshirt Menu")
   public void user_clicks_Tshirt_Menu() {
      homePage.tShirtsMenuLink().click();
   }

   @Then("User clicks Tshirt Link")
   public void user_clicks_Tshirt_Link() {
      tShirt.tshirt_link().click();
   }

   @Then("User adds item to cart")
   public void add_to_cart() throws Exception {
      tShirt.waitForAddToCartButton();
      tShirt.add_to_cart_btn().click();
   }

   @Then("User clicks proceed to checkout button")
   public void user_clicks_proceed_to_checkout_button() {
      tShirt.switchToDefault();
      tShirt.proceed_to_checkout_btn().click();
   }

   @Then("User clicks proceed to checkout summary button")
   public void user_clicks_proceed_to_checkout_summary_button() {
      tShirt.proceed_to_checkout_sum_btn().click();
   }

   @Then("User enters Signin info")
   public void user_enters_Signin_info() {
      signPage.login();
   }

   @Then("User clicks on Proceed Order Button")
   public void user_clicks_on_Proceed_Order_Button() {
      shop.order_proceed_btn().click();
   }

   @Then("User checks Terms agreement")
   public void user_checks_Terms_agreement() {
      shop.terms_agree_checkboxreturn().click();
   }

   @Then("User clicks Proceed process button")
   public void user_clicks_Proceed_process_button() {
      shop.process_proceed_btn().click();
   }

   @Then("User selects Pay by check method")
   public void user_selects_Pay_by_check_method() {
      shop.pay_by_check_btn().click();
   }

   @Then("User clicks Confirm Order button")
   public void user_clicks_Confirm_Order_button() {
      shop.confirm_order_btn().click();
   }

   @Then("User checks success message {string}")
   public void user_checks_success_message(String string) {
      Assert.assertTrue(shop.order_confirmation_txt().getText().contains(string));
   }

   @Then("User stores order reference no")
   public void store_order_reference_no() {
      String reference = shop.getOrderRef().getText();
      String sub = reference.substring(reference.indexOf("order reference "), reference.indexOf("- An email has"));
      orderRefNo = sub.split(" ")[2].replace(".", "").replace("\n", "");
   }

   @Then("User goes to my account page")
   public void user_goes_to_my_account_page() {
      myAc.my_account().click();
   }

   @Then("User clicks order history and details")
   public void user_clicks_order_history_and_details() {
      myAc.order_history().click();
   }

   @Then("User checks placed order")
   public void user_checks_placed_order() {
      List<WebElement> orderElementsList = myAc.order_refe_list();
      List<String> ordersRefList = new ArrayList<>();

      for (WebElement orderRefElement : orderElementsList) {
         ordersRefList.add(orderRefElement.getText());
      }

      Assert.assertTrue("Order " + orderRefNo + " not found in order history list: " + ordersRefList,
            ordersRefList.contains(orderRefNo));
   }

}
