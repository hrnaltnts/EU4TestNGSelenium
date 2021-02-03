package com.cybertek.tests.day12_properties_driver_tests;

import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.security.Key;

public class PropertiesTest {

    @Test
    public void test1(){
        String browserType=ConfigurationReader.get("browser");

        System.out.println("browserType = " + browserType);

        String url =ConfigurationReader.get("url");


    }

    @Test
    public void OpenVrowserWithConf(){

        WebDriver  driver=WebDriverFactory.getDriver(ConfigurationReader.get("browser"));

        driver.get(ConfigurationReader.get("url"));

        //driver.findElement(By.id("prependedInput")).sendKeys("User1");
        //driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123")+ Keys.ENTER;

        String username=ConfigurationReader.get("driver_username");
        String password=ConfigurationReader.get("driver_password");

        driver.findElement(By.id("prependedInput")).sendKeys(username);
        driver.findElement(By.id("prependedInput2")).sendKeys(password+ Keys.ENTER);





    }

}
