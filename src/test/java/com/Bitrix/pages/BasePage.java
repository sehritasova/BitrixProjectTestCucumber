package com.Bitrix.pages;

import com.Bitrix.utils.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {


    @FindBy(className = "logo-text")
    private WebElement Crm;


    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);

    public void navigateTo(String link){
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText(link))).click();
    }

    public void verifyTitle(String expectedPageTitle){
        Assert.assertTrue(wait.until(ExpectedConditions.titleIs(expectedPageTitle)));

    }



    public String getCrmTitleText(){
        return Crm.getText();
    }

}
