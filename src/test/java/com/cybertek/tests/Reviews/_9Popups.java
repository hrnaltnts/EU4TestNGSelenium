package com.cybertek.tests.Reviews;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class _9Popups {

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
    public void test2() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/javascript_alerts");

        //click Click For JS Alert Button



        driver.findElement(By.xpath("//button[1]")).click();

        //switch to JS Alert pop up

        //SADECE JAVA SCRIPT ICIN
        Alert alert= driver.switchTo().alert();
        Thread.sleep(2000);
        alert.accept();

        //click for JS confirm
        Thread.sleep(4000);
        driver.findElement(By.xpath("//button[2]")).click();
        Thread.sleep(2000);
        alert.dismiss();

        //click for JS Prompt
        driver.findElement(By.xpath("//button[3]")).click();
        alert.sendKeys("Giris yapalim");
        Thread.sleep(2000);
        //click ok
        alert.accept();
        Thread.sleep(2000);


    }

}

