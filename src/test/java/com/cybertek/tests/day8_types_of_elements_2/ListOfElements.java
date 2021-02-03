package com.cybertek.tests.day8_types_of_elements_2;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class ListOfElements {

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
    public void test1 () {
        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        //SAVE OUR WEB ELEMENTS INSIDE THE LIST

        //driver.findElements(By.className("button"));
        // alt+enter -->  List<WebElement> button = driver.findElements(By.className("button"));
        List<WebElement> buttons = driver.findElements(By.tagName("button"));

        System.out.println("buttons.size() = " + buttons.size());

        Assert.assertEquals(buttons.size(), 6, "verify buttons size");

        //iter --->  for (WebElement button : buttons) {
        //
        //        }

        for (WebElement button : buttons) {
            System.out.println(button.getText());
            Assert.assertTrue(button.isDisplayed(), "verify button are displayed");
        }

        //CLICK SECOND BUTTON
        buttons.get(1).click();

    }
    @Test
    public void test2() {
         driver.get("http://practice.cybertekschool.com/multiple_buttons");

            //Regular findElement method will be throw NSE if locator doent exist
            //driver.findElements(By.tagName("buttonaisysdgausda"));

            //passing locator which doent exäst, it will not throw NoSuchElemet

            List<WebElement> buttons = driver.findElements(By.tagName("buttonaisysdgausda"));

            System.out.println("buttons.size() = " + buttons.size());
        }



    }

