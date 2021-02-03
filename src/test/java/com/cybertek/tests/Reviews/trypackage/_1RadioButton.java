package com.cybertek.tests.Reviews.trypackage;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _1RadioButton {


    //Radio Button just selected one

    @Test
    public void test1() throws InterruptedException {
        System.out.println("");

        System.out.println("HERE STARTS RADIO BUTTON TEST");
        System.out.println("This is another test class on same package");

        WebDriver driver= WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/radio_buttons");

        //locatin radio buttons
        WebElement blueButton = driver.findElement(By.cssSelector("#blue"));
        WebElement redButton=driver.findElement(By.id("red"));

        System.out.println("blueButton.isSelected() = " + blueButton.isSelected());
        System.out.println("redButton.isSelected() = " + redButton.isSelected());

        //blue --> true
        System.out.println("");

        Assert.assertTrue(blueButton.isSelected(),"verify that blue is selected");
        // red --> false
       // Assert.assertFalse(redButton.isSelected(),"verify that red is not selected");

        // how to click radio button

        redButton.click();
        //blue --> false
       // Assert.assertTrue(blueButton.isSelected(),"verify that blue is selected");
        // red --> true
        //Assert.assertFalse(redButton.isSelected(),"verify that red is not selected");

        System.out.println("HERE END OF RADIO BUTTON TEST");
        Thread.sleep(4000);
        driver.quit();

    }

}
