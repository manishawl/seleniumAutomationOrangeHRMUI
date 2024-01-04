package com.crm.testcases;

import com.crm.base.TestBase;
import com.crm.pageobjects.LoginPage;
import junit.framework.Assert;
import org.testng.annotations.*;
public class LoginPageTest extends TestBase {

    public LoginPage loginPage;

    public LoginPageTest() {
       super();
    }

    @BeforeMethod
    public void setup(){
        initialization();
        loginPage = new LoginPage();
    }

    @Test(priority = 1)
    public void LoginPageTitleTest()
    {
        String title = loginPage.verifyLoginpageTitle();
        Assert.assertEquals(title, "OrangeHRM");
    }

    @Test(priority = 2)
    public void loginTest()
    {
        loginPage.login(prop.getProperty("username"),prop.getProperty("password") );
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }





    

}
