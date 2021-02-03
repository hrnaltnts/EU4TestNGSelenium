package com.cybertek.tests.day7_types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButtonTest {


    //Radio Button just selected one

    @Test
    public void test1() throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/radio_buttons");

        //locatin radio buttons
        WebElement blueButton = driver.findElement(By.cssSelector("#blue"));
        WebElement redButton=driver.findElement(By.id("red"));

        System.out.println("blueButton.isSelected() = " + blueButton.isSelected());
        System.out.println("redButton.isSelected() = " + redButton.isSelected());


        //blue --> true
        Assert.assertTrue(blueButton.isSelected(),"verify that blue is selected");
        // red --> false
        Assert.assertFalse(redButton.isSelected(),"verify that red is not selected");

        // how to click radio button
        redButton.click();

        Thread.sleep(4000);
        driver.quit();

    }

}
