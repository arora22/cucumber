package com.romal.stepdefinitions;

import org.junit.Assert;

import com.romal.account.MyAccountPage;
import com.romal.base.Constants;
import com.romal.base.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * @author ROMAL.ARORA
 *
 * @description Step Definition for Update User Info
 */
public class UpdateInfoStepDef {
   HomePage homePage = new HomePage();
   MyAccountPage myAc = new MyAccountPage();

   String firstName;
   String newFirstName;

   @Then("User clicks signin link")
   public void user_clicks_signin_link() {
      homePage.signin_link().click();
   }

   @Then("User clicks my personal info")
   public void user_clicks_my_personal_info() {
      myAc.personal_info().click();
   }

   @When("User changes firstname")
   public void user_changes_firstname() {
      firstName = myAc.first_name().getAttribute("value");
      newFirstName = firstName + "a";

      myAc.first_name().clear();
      myAc.first_name().sendKeys(newFirstName);
      myAc.current_password_textbox().sendKeys(Constants.PASSWORD);
      myAc.save_button().click();
   }

   @Then("User verifies firstname change message {string}")
   public void user_verifies_firstname_changed_message(String string) {
      Assert.assertEquals(string, myAc.info_change_message().getText().trim());
   }

}
