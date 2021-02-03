package com.cybertek.tests.day9_popups_tabs_frames;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Popups {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("Chrome");

    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(200);
        driver.quit();

    }

    @Test
    public void test1() {
        driver.get("http://primefaces.org/showcase/ui/overlay/confirmDialog.xtml");

        //click Destroy the World button
        driver.findElement(By.xpath("//button[.='Destroy the World']")).click();

        //Click NO button
        driver.findElement(By.xpath("//button[.'No']")).click();
    }

    @Test
    public void test2() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/javascript_alerts");

        //click Click For JS Alet Button
        driver.findElement(By.xpath("//button[1]")).click();

        //switch to JS Alert pop up
        Alert alert= driver.switchTo().alert();
        Thread.sleep(2000);
        alert.accept();

        //click for JS confirm
        driver.findElement(By.xpath("//button[2]")).click();
        Thread.sleep(2000);
        alert.dismiss();

        //click for JS Prompt
        driver.findElement(By.xpath("//button[3]")).click();
        alert.sendKeys("MekieSimith");
        //click ok
        alert.accept();


    }

}