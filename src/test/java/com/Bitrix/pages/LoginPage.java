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

    @FindBy(id = "USER_REMEMBER")
    private WebElement check_remember;



    public void login(String usernameValue, String passwordValue){
        username.sendKeys(usernameValue);
        password.sendKeys(passwordValue);

    }

    public void login(){
        String usernameValue = ConfigurationReader.getProperty("helpdesk_username");
        String passwordValue = ConfigurationReader.getProperty("password");

        username.sendKeys(usernameValue);
        password.sendKeys(passwordValue);


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
        password.sendKeys(passwordValue);

    }

   public void setLogInBtn(){
       logInBtn.click();
    }




    public void setCheck_remember(){
        if (check_remember.isSelected()){
            System.out.println("Remember me checkbox is checked");
        }else{
            System.out.println("Remember me checkbox is not checked");
        }
    }

}
