package com.Bitrix.pages;

import com.Bitrix.utils.BrowserUtils;
import com.Bitrix.utils.ConfigurationReader;
import com.sun.tools.internal.jxc.ConfigReader;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage{


    @FindBy(name = "USER_LOGIN")
    private WebElement username;

    @FindBy(name = "USER_PASSWORD")
    private WebElement password;

    @FindBy(className = "login-btn")
    private WebElement logInBtn;

    @FindBy(id = "USER_REMEMBER")
    private WebElement check_remember;

    @FindBy(className = "errortext")
    private WebElement error_message;

    @FindBy(className = "login-link-forgot-pass")
    private WebElement forgot_link;

    @FindBy(className = "log-popup-header")
    private WebElement getPasswordPage;



    public void login(String worngUsername, String wrongPassword) {
        wait.until(ExpectedConditions.visibilityOf(username)).sendKeys(worngUsername);
        wait.until(ExpectedConditions.visibilityOf(password)).sendKeys(wrongPassword, Keys.ENTER);


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


    public String getErrorMessage(){
        return error_message.getText();
    }

    public void getForgotLink(){
      BrowserUtils.clickOnElement(forgot_link);
    }

    public void setGetPasswordPage(){
        BrowserUtils.clickOnElement(getPasswordPage);
    }



}
