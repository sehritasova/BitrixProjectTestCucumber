package com.Bitrix.step_definitons;

import com.Bitrix.pages.LoginPage;
import com.Bitrix.utils.ConfigurationReader;
import com.Bitrix.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinitions {

    LoginPage loginPage = new LoginPage();


    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get("http://login2.nextbasecrm.com");
    }
    @When("user logs in as a {string}")
    public void user_logs_in_as_a(String string) throws InterruptedException {
        loginPage.login(string);
        Thread.sleep(3000);


    }
    @When("click on {string} option")
    public void click_on_option(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user should see dashboard page")
    public void user_should_see_dashboard_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }




}
