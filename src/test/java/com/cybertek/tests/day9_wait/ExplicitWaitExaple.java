package com.cybertek.tests.day9_wait;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ExplicitWaitExaple {

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
        driver.get("http://practice.cybertekschool.com/dynamic_loading/1");


        driver.findElement(By.tagName("button")).click();

        WebElement usernameInput = driver.findElement(By.id("username"));

        //usernameInput.sendKeys("MikeSmith");
        //element not interactable mean it doesnt visible

        // HOW TO WAIT EXPLICITLY ?
        // create explicit(aşikar) wait object

        WebDriverWait wait = new WebDriverWait(driver,20);

        wait.until(ExpectedConditions.visibilityOf(usernameInput));


        usernameInput.sendKeys("MikeSmith");
        System.out.println(usernameInput.getText());



    }

    @Test
    public void test2(){
        driver.get("http://practice.cybertekschool.com/dynamic_controls");

        driver.findElement(By.xpath("//*[.='Enable']")).click();

        //finding inputbox
        //WebElement inputbox = driver.findElement(By.cssSelector("#input-exaple>input"));
        //no such element
        WebElement inputbox = driver.findElement(By.cssSelector("#input-example>input"));
        //run
        //element not interactable

        //WebDriverWait wait = new WebDriverWait(driver,2);
        //TimeoutException: Expected condition failed: waiting for element to be clickable: [[ChromeDriver: chrome on WINDOWS

        WebDriverWait wait = new WebDriverWait(driver,10);

        wait.until(ExpectedConditions.elementToBeClickable(inputbox));


        inputbox.sendKeys("MikeSmith");


    }
}

//no such element error is mean it doesnt has the html
//element not interactable mean it doesnt visible