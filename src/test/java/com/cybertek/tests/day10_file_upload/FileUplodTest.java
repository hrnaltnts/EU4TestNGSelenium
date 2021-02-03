package com.cybertek.tests.day10_file_upload;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FileUplodTest {
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
    public void test1() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/upload");

        //location choose file buton
        WebElement choosefile = driver.findElement(By.name("file"));

        //sendin gfile with sendKeys meyhod
        choosefile.sendKeys("C:\\Users\\HP\\Desktop\\file.txt");

        //clicking upload button
        driver.findElement(By.id("file-submit")).click();

        //getting thr file name from browser
        String actualFileName=driver.findElement(By.id("uploaded-file")).getText();

        //verify file name is file.txt
        Assert.assertEquals(actualFileName, "file.txt");

    }
}
