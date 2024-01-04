package com.crm.pageobjects;

import com.crm.base.TestBase;
import org.openqa.selenium.WebDriver;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {

    //public Logger logger = Logger.getLogger(LoginPage.class.getName());

    //PageFactory or object repo
    @FindBy(name = "username")
    WebElement username;
    @FindBy(name = "password")
    WebElement password;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement submit;

    //Initialise page objects
    public LoginPage()
    {
       PageFactory.initElements(driver,this);
    }

    //Actions
    public String verifyLoginpageTitle()
    {
       return driver.getTitle();
    }
    public void login(String uname, String pwd)
    {
        username.sendKeys(uname);
        password.sendKeys(pwd);
        submit.click();
        //return new HomePage();
    }

}
