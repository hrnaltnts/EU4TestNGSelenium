package com.cybertek.tests.day2_webdriver_basic;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class CallWebDriverFactory {
    public static void main(String[] args) {

        //getDriver Utality de ki methodun adi


        WebDriver driver=WebDriverFactory.getDriver("firefox");
        driver.get("http://www.google.com");

        String title = driver.getTitle();
        System.out.println("title = " + title);
        


    }
}

//title = Google
