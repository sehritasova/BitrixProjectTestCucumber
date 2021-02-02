package com.Bitrix.pages;

import com.Bitrix.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {


    @FindBy(id = "header-inner")
    private WebElement pageSubtitle;


    @FindBy(className = "logo-text")
            private WebElement Crm;




    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    public String getPageSubTitleText(){
        return pageSubtitle.getText();
    }

    public String getCrmTitleText(){
        return Crm.getText();
    }

}
