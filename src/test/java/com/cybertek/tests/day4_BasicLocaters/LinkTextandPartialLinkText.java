package com.cybertek.tests.day4_BasicLocaters;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LinkTextandPartialLinkText {
    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/dynamic_loading");

        WebElement linkLocater = driver.findElement(By.linkText("Example 1: Element on page that is hidden and become visible after trigger"));
        linkLocater.click();

        driver.get("http://practice.cybertekschool.com/dynamic_loading");


        WebElement partialLocater = driver.findElement(By.partialLinkText("Example 3: El"));
        partialLocater.click();

    }
}
