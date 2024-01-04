package com.crm.pageobjects;


import com.crm.util.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Test {

   public static void main(String args[]) {
       System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
       ChromeOptions options = new ChromeOptions();
       options.addArguments("--remote-allow-origins=*");
       WebDriver driver = new ChromeDriver(options);

       driver.manage().window().maximize();
       driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
       driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
       driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
       driver.manage().timeouts().implicitlyWait(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
       driver.findElement(By.name("username")).sendKeys("Admin");
       driver.findElement(By.name("password")).sendKeys("admin123");
       driver.findElement(By.xpath("//button[@type='submit']")).click();

       List<WebElement> menulist = driver.findElements(By.xpath("//ul/li/a/span"));

       for(int i =0; i<=menulist.size(); i++)
       {
           if(menulist.get(i).getText().equalsIgnoreCase("PIM"))
           {
               menulist.get(i).click();
               break;
           }
       }
   }
}
