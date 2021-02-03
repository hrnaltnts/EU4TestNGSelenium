package com.cybertek.tests.HOMEWORK;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

public class Etsy {

    WebDriver driver;

    @BeforeTest
    public void beforetest() {
        System.out.println("This is Before Test");

    }

    @BeforeMethod
    public void beforemethod() {
        System.out.println("This is Before Method");

    }
    public WebElement getmenubutton(String menu){


        WebElement getmenuchange=driver.findElement(By.xpath("//span[contains(text(),'"+menu+"')]"));
        return getmenuchange;

    }


    @Test
    public void test1() throws InterruptedException {
        System.out.println("This is Test");

        driver= WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.get("https://www.etsy.com");

        Thread.sleep(1000);

       WebElement cookieaccept=driver.findElement(By.cssSelector(".wt-btn.wt-btn--filled.wt-mb-xs-0"));
       cookieaccept.click();

       getmenubutton("Jewelry & Accessories").click();
        Thread.sleep(1000);
       getmenubutton("Clothing & Shoes").click();
        Thread.sleep(1000);
       getmenubutton("Home & Living").click();
        Thread.sleep(1000);
       getmenubutton("Wedding & Party").click();
        Thread.sleep(1000);
        getmenubutton("Toys & Entertainment").click();
        Thread.sleep(1000);
        getmenubutton("Art & Collectibles").click();
        Thread.sleep(1000);
        getmenubutton("Craft Supplies & Tools").click();



    }

    @AfterTest
    public void aftertest() {
        System.out.println("This is After Test");

    }

    @AfterMethod
    public void afteremethod() {
        System.out.println("This is After Method");

    }

}