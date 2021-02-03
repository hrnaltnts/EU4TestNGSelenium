package com.cybertek.tests.day3_webelement;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriverBuilder;

public class verifyURLnotClick {

    public static void main(String[] args) {
        /* Verify URL notchanged
        -open chrome browser
        -goto http://practice.cybertekschool.com/forgot_password
        -click on Retrieve password
        -verifythat url did not change
         */

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/forgot_password");

        //save actual url after clicking button
        String expectedUrl = driver.getCurrentUrl();

        //Click on Retrieve password
        WebElement retrivePasswordButton = driver.findElement(By.id("form_submit"));
        retrivePasswordButton.click();

        String actualUrl = driver.getCurrentUrl();

        if( expectedUrl.equals(actualUrl)){
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }

        //CLOSE YOUR BROWSER





    }

}
