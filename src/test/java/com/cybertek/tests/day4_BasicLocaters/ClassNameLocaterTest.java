package com.cybertek.tests.day4_BasicLocaters;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClassNameLocaterTest
{
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
               driver.manage().window().maximize();
        //

        driver.get("http://practice.cybertekschool.com/sign_up");
        //click dont click button
        WebElement fullNameInput=driver.findElement(By.className("nav-link"));
        fullNameInput.click();
    }
}
