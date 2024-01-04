package com.crm.testcases;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportsWithTestNG {

    public static void main(String args[])
    {
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentReports.html");

        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);

        // creates a toggle for the given test, adds all log events under it
        ExtentTest test1 = extent.createTest("Login OrangeHRM", "Validate login functionality");
    }
}
