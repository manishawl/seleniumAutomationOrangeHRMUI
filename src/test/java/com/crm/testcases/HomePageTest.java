package com.crm.testcases;

import com.crm.base.TestBase;
import com.crm.pageobjects.HomePage;
import com.crm.pageobjects.LoginPage;
import junit.framework.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class HomePageTest extends TestBase {

    LoginPage loginpage;
    HomePage homePage;

    public HomePageTest() {
        super();
    }

    @BeforeTest
    public void setup() {
        initialization();
        loginpage = new LoginPage();
        homePage = new HomePage();
        loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
    }

    @Test
    public void verifymenuisclickable() {

        homePage.clickMenu("Leave");
    }


   @AfterTest
    public void tearDown(){
        driver.quit();
    }
}


