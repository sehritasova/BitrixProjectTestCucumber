package com.Bitrix.step_definitons;

import com.Bitrix.pages.BasePage;
import com.Bitrix.pages.LoginPage;
import com.Bitrix.utils.ConfigurationReader;
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
    @When("user logs in as a {string}")
    public void user_logs_in_as_a(String string) throws InterruptedException {
        loginPage.login(string);
        Thread.sleep(3000);


    }


    @Then("user should see dashboard page")
    public void user_should_see_dashboard_page() {
        String expected = "CRM";
       // String actual= loginPage.getPageSubTitleText().trim();
        String actual= loginPage.getCrmTitleText();
        Assert.assertEquals("I see dashboard", expected, actual);

    }




}
