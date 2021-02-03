package com.cybertek.tests.day7_types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DisabledElement
{

    @Test
    public void test1(){

        WebDriver driver = WebDriverFactory.getDriver("Chrome");

        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/radio_buttons");

        WebElement greenButton = driver.findElement(By.id("green"));

        // how to check any web element is enabled or not?

        System.out.println("greenButton.isEnabled() = " + greenButton.isEnabled());
        Assert.assertFalse(greenButton.isEnabled(),"verify green radio button NOT enabled (disabled)");

        greenButton.click();


    }

    @Test
    public void test2(){
        WebDriver driver = WebDriverFactory.getDriver("Chrome");

        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/dynamic_controls");

        WebElement inputBox = driver.findElement(By.cssSelector("#input-example"));

        inputBox.sendKeys("some message");


    }
}
