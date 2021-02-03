package com.cybertek.tests.Reviews;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _4Attributes {


        @Test
        public void test1() {
            WebDriver driver = WebDriverFactory.getDriver("chrome");
            driver.manage().window().maximize();

            driver.get("http://practice.cybertekschool.com/radio_buttons");

            WebElement blueRadioBtn = driver.findElement(By.id("blue"));

            System.out.println("blueRadioBtn.getAttribute(\"value\") = " + blueRadioBtn.getAttribute("value"));

            //on

            //get the value of type attribute
            System.out.println(blueRadioBtn.getAttribute("type"));

            //radio

            //get the value of name attribute
            System.out.println(blueRadioBtn.getAttribute("name"));

            //color

            //get the value of checked
            //since checked attribute does not keep any value, it will return true or false based on the condition
            System.out.println(blueRadioBtn.getAttribute("checked"));

            //true

            //trying to get attribute that does not exist
            //when we use non exist attribute it will return null to us.
            System.out.println(blueRadioBtn.getAttribute("href"));

            //null

            System.out.println(blueRadioBtn.getAttribute("outerHTML"));
            //<input type="radio" id="blue" name="color" checked="">

            System.out.println(blueRadioBtn.getAttribute("innerHTML"));



            driver.get("http://practice.cybertekschool.com/multiple_buttons");

            WebElement button2 = driver.findElement(By.name("button2"));

            System.out.println(button2.getText());


           // <button class="btn btn-primary" onclick="button2()" name="button2">Button 2</button>


            String outerHTML = button2.getAttribute("outerHTML");
            Assert.assertTrue(outerHTML.contains("Button 2"));

            System.out.println("Inner HTML: " + button2.getAttribute("innerHTML"));

            //Inner HTML: Button 2

            driver.quit();

        }

    }


