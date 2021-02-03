package com.cybertek.tests.day9_wait;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ImplicitWaitExample {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(200);
        driver.quit();

    }

    @Test
    public void test1() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/dynamic_loading/4");

        //HOW TO WAIT IMPILICITLY?
        // but inside before method

        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        // PUT IT BEFORE METHOD AND IT IS ALREADY WORK

        WebElement element = driver.findElement(By.cssSelector("#finish"));

        System.out.println(element.getText());
    }
}