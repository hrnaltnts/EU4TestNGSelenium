package com.cybertek.tests.day12_properties_driver_tests;

import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginTest {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        //WE CHANGED HERE
        driver = Driver.get();
        //
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/tables");


    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(200);
        //WE CHANGED HERE
        Driver.closeDriver();
        //

    }


    @Test
    public void OpenVrowserWithConf(){



        driver.get(ConfigurationReader.get("url"));

        String username=ConfigurationReader.get("driver_username");
        String password=ConfigurationReader.get("driver_password");

        driver.findElement(By.id("prependedInput")).sendKeys(username);
        driver.findElement(By.id("prependedInput2")).sendKeys(password+ Keys.ENTER);





    }

}
