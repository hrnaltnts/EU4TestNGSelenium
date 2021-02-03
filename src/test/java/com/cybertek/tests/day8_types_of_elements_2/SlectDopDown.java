package com.cybertek.tests.day8_types_of_elements_2;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class SlectDopDown {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver= WebDriverFactory.getDriver("Chrome");

    }

    @AfterMethod
    public  void tearDown() throws InterruptedException {
        Thread.sleep(200);
        driver.quit();

    }

    @Test
    public void test1 () throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/dropdown");

        //1.Locateyour dropdownjustli ke any other webelemet with unique locator
        WebElement dropDownElement = driver.findElement(By.id("state"));

        //2. create Select object by passing that element as as constructor
        Select stateDropDown = new Select(dropDownElement);

        // getOptions
        List<WebElement> options = stateDropDown.getOptions();
        System.out.println("options.size() = " + options.size());

        //print options one by one
        //iter --->
        for (WebElement option : options) {
            System.out.println("option.getText() = " + option.getText());

        }
    }
        @Test
        public void test2() throws InterruptedException {
            driver.get("http://practice.cybertekschool.com/dropdown");

            //1.Locateyour dropdownjustli ke any other webelemet with unique locator
            WebElement dropDownElement = driver.findElement(By.id("state"));

            //2. create Select object by passing that element as as constructor
            Select stateDropDown = new Select(dropDownElement);


            //verify that first selection is Select a state
            String expectedOption = "Select a State";
            String actualOption = stateDropDown.getFirstSelectedOption().getText();
            Assert.assertEquals(actualOption, expectedOption, "verify first selection");

            //HOW TOL SELECT OPTIONS FROM DROPDOWN?
            // 1. SELECT USING VISIBLE TEXT
            Thread.sleep(2000);
            stateDropDown.selectByVisibleText("Virginia");

            expectedOption = "Virginia";
            actualOption = stateDropDown.getFirstSelectedOption().getText();
            Assert.assertEquals(actualOption, expectedOption, "verify first selection");

            //2. SELECT USING INDEX
            Thread.sleep(2000);
            stateDropDown.selectByIndex(51);

            expectedOption = "Wyoming";
            actualOption = stateDropDown.getFirstSelectedOption().getText();
            Assert.assertEquals(actualOption, expectedOption, "verify first selection");

            //3. SELECT BY VALUE
            Thread.sleep(2000);
            stateDropDown.selectByValue("TX");

            expectedOption = "Texas";
            actualOption = stateDropDown.getFirstSelectedOption().getText();
            Assert.assertEquals(actualOption, expectedOption, "verify first selection");


        }
    }

