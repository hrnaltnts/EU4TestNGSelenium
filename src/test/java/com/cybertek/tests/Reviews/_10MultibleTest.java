package com.cybertek.tests.Reviews;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;

public class _10MultibleTest {
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
        driver.get("http://practice.cybertekschool.com/windows");

        //get Tittle
        System.out.println("driver.getTitle() = " + driver.getTitle());
        //driver.getTitle() = Practice

        driver.findElement(By.linkText("Click Here")).click();

        System.out.println("driver.getTitle() = " + driver.getTitle());
        //driver.getTitle() = Practice

        System.out.println("driver.getWindowHandles() = " + driver.getWindowHandles());
        //driver.getWindowHandles() = [CDwindow-24850B9751B5EBF5333F7C299135DB0E, CDwindow-B629BE460BDC286111E3E24DC3E06530]

        String currentWindowHandle = driver.getWindowHandle();

        Set<String> windowHandles = driver.getWindowHandles();

        //list den farki set ayni elementi listelemiyor her biri unique

        //loop through each window
        for (String handle : windowHandles) {

            if (!handle.equals(currentWindowHandle)) {
                driver.switchTo().window(handle);
            }
        }

        System.out.println("Title after switch new window" + driver.getTitle());
        //Title after switch new windowNew Window


    }
    @Test
    public void moreThan2Window() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/windows");
        driver.findElement(By.linkText("Click Here")).click();

        System.out.println("Before Switch = " + driver.getTitle());
        //Before Switch = Practice
        Set<String> windowHandles = driver.getWindowHandles();

        //loop through each window
        for (String handle : windowHandles) {
            //one by one change it
            driver.switchTo().window(handle);

            //whenever your title equals to your expected window title
            if(driver.getTitle().equals("New Window")){
                // stop on that window
                break;
            }
        }
        System.out.println("After Switch = " + driver.getTitle());
        //After Switch = New Window
    }




}

