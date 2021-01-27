package com.Bitrix.pages;

import com.Bitrix.utils.ConfigurationReader;
import com.sun.tools.internal.jxc.ConfigReader;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{


    @FindBy(name = "USER_LOGIN")
    private WebElement username;

    @FindBy(name = "USER_PASSWORD")
    private WebElement password;

    @FindBy(className = "login-btn")
    private WebElement logInBtn;



    public void login(String usernameValue, String passwordValue){
        username.sendKeys(usernameValue);
        password.sendKeys(passwordValue, Keys.ENTER);

    }

    public void login(){
        String usernameValue = ConfigurationReader.getProperty("helpdesk_username");
        String passwordValue = ConfigurationReader.getProperty("password");

        username.sendKeys(usernameValue);
        password.sendKeys(passwordValue, Keys.ENTER);

    }

    public void login(String role){
        String usernameValue="";
        String passwordValue= ConfigurationReader.getProperty("password");

        if (role.equalsIgnoreCase("helpdesk")) {
            usernameValue = ConfigurationReader.getProperty("helpdesk_username");
        } else if (role.equalsIgnoreCase("marketing")) {
            usernameValue = ConfigurationReader.getProperty("marketing_username");
        } else{
            usernameValue = ConfigurationReader.getProperty("hr_username");
        }

        username.sendKeys(usernameValue);
        password.sendKeys(passwordValue, Keys.ENTER);


    }

}
