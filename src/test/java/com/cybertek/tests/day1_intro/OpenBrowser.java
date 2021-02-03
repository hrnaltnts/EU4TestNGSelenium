package com.cybertek.tests.day1_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenBrowser {
    public static void main(String[] args) {
/*
        // We have to enter this line every time we want to open choreme
        // hey webdrivermanager, can you make choreme ready for me for automation

        WebDriverManager.chromedriver().setup();

        // WebDriver repressent the browser
        //we  are creating driver for choreme browser
        // new  ChoremmDriver() ---> this part will open choreme browser
        WebDriver driver= new ChromeDriver();

        // . get(url) method used for navigation to page
        driver.get("https://cybertekschool.com");
         */


        WebDriverManager.firefoxdriver().setup();

        WebDriver driver1= new FirefoxDriver();

        driver1.get("https://cybertekschool.com");




    }
}
