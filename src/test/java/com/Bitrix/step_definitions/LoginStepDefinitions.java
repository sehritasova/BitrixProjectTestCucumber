package com.Bitrix.step_definitions;

import com.Bitrix.pages.LoginPage;
import com.Bitrix.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

    public class LoginStepDefinitions {

        LoginPage loginPage = new LoginPage();


        @Given("user is on the login page")
        public void user_is_on_the_login_page() {
            Driver.getDriver().get("http://login2.nextbasecrm.com");
        }

        @When("user enter {string} and {string}")
        public void user_enter_and(String username, String password) {
            loginPage.login();
        }

        @When("user clicks on {string} button")
        public void user_clicks_on_button(String string) {
            loginPage.setLogInBtn();
        }
        @Then("user should see dashboard page")
        public void user_should_see_dashboard_page() {
            String expected = "CRM";
            // String actual= loginPage.getPageSubTitleText().trim();
            String actual= loginPage.getCrmTitleText();
            Assert.assertEquals("I see dashboard", expected, actual);
            Driver.closeDriver();

        }

        @When("user check {string} checkbox")
        public void user_check_checkbox(String string) {

            loginPage.setCheck_remember();

        }


        @Given("user logs in with {string} username and {string} password")
        public void user_logs_in_with_username_and_password(String string, String string2) {
            loginPage.login(string, string2);
        }

        @When("navigates to {string} link page")
        public void navigates_to_link_page(String string) {
            loginPage.navigateTo(string);
        }



        @Then("{string} page displayed")
        public void page_displayed(String string) {
            loginPage.verifyTitle(string);

        }


        @Then("user verifies that {string} message is displayed")
        public void user_verifies_that_message_is_displayed(String expected) {
            String actualResult = loginPage.getErrorMessage();
            Assert.assertEquals(expected, actualResult);

        }
















    }