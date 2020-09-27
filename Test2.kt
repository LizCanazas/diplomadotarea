package com.example.myapplication

import org.junit.Test

import org.junit.Assert.*

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;

class ExampleUnitTest {
    WebDriver driver;

    @BeforeClass
    public void setUp() throws MalformedURLException{
        //Set up desired capabilities and pass the Android app-activity and app-package to Appium
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("BROWSER_NAME", "Android");
        capabilities.setCapability("VERSION", "10");
        capabilities.setCapability("deviceName","D1AGAD5790400325");
        capabilities.setCapability("platformName","Android");


        capabilities.setCapability("appPackage", "com.vrproductiveapps.whendo");
        capabilities.setCapability("appActivity","com.vrproductiveapps.whendo.services.NotificationService");
        driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }

    @Test
    public void testCal() throws Exception {
        WebElement two=driver.findElement(By.name("addCategoryItem"));
        two.click();
    }

    @AfterClass
    public void teardown(){
        driver.quit();
    }
}