package com.cybertek.tests.day10_action_is;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HoverTest {
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

    /**
     * hover over each image in the website
     * verify each name: user text is displayed
     */

    @Test
    public void test1() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/hovers");

        WebElement img1 = driver.findElement(By.tagName("img"));

        Actions actions = new Actions(driver);

        actions.moveToElement(img1).perform();

        WebElement text1 = driver.findElement(By.xpath("//h5[.='name: user1']"));

        Assert.assertTrue(text1.isDisplayed(), "verify text 1 is displayed");

    }

    @Test
    public void Test2() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/hovers");

        for (int i = 0; i < 3; i++) {
             String imgpath="(//img)["+"i"+"]";
             WebElement img=driver.findElement(By.xpath(imgpath));
            System.out.println(imgpath);

            Actions actions=new Actions(driver);
            Thread.sleep(2000);
            actions.moveToElement(img).perform();

            String textPath="//h5[.='name:user"+i+"'";
            WebElement text1 = driver.findElement(By.xpath(textPath));
            System.out.println(textPath);
            Assert.assertTrue(text1.isDisplayed(), "verify text 1 is displayed");

        }

        }

    }
