package com.cybertek.tests.day4_BasicLocaters;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NameLocaterTTest {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        //
        //        driver.manage().window().maximize();
        //
        //
        //        driver.get("http://practice.cybertekschool.com/sign_up");
        //
        //        //click dont click button
        WebElement  fullNameInput=driver.findElement(By.name("full_name"));
        fullNameInput.sendKeys("Mike Simith");

        //proper way
        WebElement emailInput=driver.findElement(By.name("email"));
        emailInput.sendKeys("mike@smith.com");

        //lazy way
       // driver.findElement(By.name("email")).sendKeys("mike@smith.com");


        //proper way
        WebElement signUpButton=driver.findElement(By.name("wooden_spoon"));
        signUpButton.click();

        //lazy way
        //driver.findElement(By.name("woodem_spoon")).click();




    }
}
