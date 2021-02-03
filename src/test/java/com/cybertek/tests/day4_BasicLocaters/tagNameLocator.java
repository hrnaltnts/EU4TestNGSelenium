package com.cybertek.tests.day4_BasicLocaters;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tagNameLocator {

    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();


        driver.get("http://practice.cybertekschool.com/sign_up");

        //click dont click button

        WebElement tagNameLocater=driver.findElement(By.tagName("input"));
        tagNameLocater.sendKeys("Mike Smith with TagNAme");


        // it doent work
        //WebElement emaiInput = driver.findElement(By.name("input"));
        //tagNameLocater.sendKeys("mike@emali.com");

    }
}
