package com.cybertek.tests.day9_popups_tabs_frames;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;

public class MultibleWidows {
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
        driver.get("http://practice.cybertekschool.com/windows");

        //get Tittle
        System.out.println("driver.getTitle() = " + driver.getTitle());

        driver.findElement(By.linkText("Click Here")).click();

        System.out.println("driver.getTitle() = " + driver.getTitle());

        System.out.println("driver.getWindowHandles() = " + driver.getWindowHandles());
        //CDwindow-87C8F0978E72160E22BF82FF4DE22B38

        String currentWindowHandle = driver.getWindowHandle();

        Set<String> windowHandles = driver.getWindowHandles();

        //loop through each window
        for (String handle : windowHandles) {

            if (!handle.equals(currentWindowHandle)) {
                driver.switchTo().window(handle);
            }
        }

        System.out.println("Title after switch new window" + driver.getTitle());


    }
    @Test
    public void moreThan2Window() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/windows");
        driver.findElement(By.linkText("Click Here")).click();

        System.out.println("Before Switch = " + driver.getTitle());
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
    }




    }