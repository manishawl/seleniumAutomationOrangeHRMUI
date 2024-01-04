package com.crm.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class AjaxGoogleSearch {
    public static void main(String args[]) {

        // Set Driver path
        System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        //open google
        driver.get("https://www.google.com");
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        String str = "testing";

        driver.findElement(By.id("APjFqb")).sendKeys(str);

        //enter techlistic tutorials in search box

        List<WebElement> ele =driver.findElements(By.xpath("//ul[@role = 'listbox']//li/descendant::div[@class ='wM6W7d']"));

        for(int i = 0 ; i < ele.size(); i++)
        {
            System.out.println(ele.get(i).getText());
            if(ele.get(i).getText().contains("testing tools"))
            {
                ele.get(i).click();
                break;
            }
        }

        //driver.close();
    }
}
