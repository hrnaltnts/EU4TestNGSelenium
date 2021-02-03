package com.cybertek.tests.day6_CSS;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CssLocater {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= WebDriverFactory.getDriver("Chrome");

        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        WebElement cssLocater = driver.findElement(By.cssSelector("#disappearing_button"));

        cssLocater.click();

        Thread.sleep(8000);

        driver.quit();




    }
}
