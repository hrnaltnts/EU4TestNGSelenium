package com.cybertek.tests.Reviews;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _2DisabledElement {

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
        public void test2() throws InterruptedException {
            WebDriver driver = WebDriverFactory.getDriver("Chrome");

            driver.manage().window().maximize();

            driver.get("http://practice.cybertekschool.com/dynamic_controls");

            WebElement inputBox = driver.findElement(By.cssSelector("#input-example>input"));

            //hatali denet!!!

            inputBox.sendKeys("some message");






            Assert.assertFalse(inputBox.isEnabled(),"verify input is disable");


        }
    }


