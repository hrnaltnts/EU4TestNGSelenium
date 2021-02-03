package com.cybertek.tests.day2_webdriver_basic;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationDemo {

    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();

        WebDriver driver= new ChromeDriver();

        driver.get("http://www.google.com");

        //navigate to another website with differen seleniummethod
        driver.navigate().to("http://www.facebook.com");

        // wait 3 second here then move on
        Thread.sleep(3000);

        // goes back to previous page
        driver.navigate().back();

        Thread.sleep(2000);

        // goes forward
        driver.navigate().forward();

        //refresh webpage
        driver.navigate().refresh();
    }
}
