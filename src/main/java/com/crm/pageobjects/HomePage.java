package com.crm.pageobjects;

import com.crm.base.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends TestBase {

    @FindBy(xpath = "//ul/li/a/span")
    public List<WebElement> userMenuList;

    public HomePage()
    {
       PageFactory.initElements(driver,this);
    }

    //Actions
    public void clickMenu(String menu)
    {
        for(int i = 0; i < userMenuList.size();i++)
        {
            if(userMenuList.get(i).getText().equalsIgnoreCase(menu))
            {
                userMenuList.get(i).click();
                break;
            }
        }
    }


}
