package com.cybertek.tests.day3_webelement;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class verifyURLchanged {
    public static void main(String[] args) {


    /*
    open chrome browser
    go to http://practice.cybertekschool.com/forgot_password links to anter any email
    click any email
    clickon Retrieve password
    verify thaturl changed to http://practice.cybertekschool.com/email_sent

     */

    // open chrome
    WebDriver driver = WebDriverFactory.getDriver("Chrome");

    // go to http://practice.cybertekschool.com/forgot_password
    driver.get("http://practice.cybertekschool.com/forgot_password");


    //enter any email
        WebElement emailBox= driver.findElement(By.name("email"));

    //sendKeys() ---> send keybord action to the webelemet
        emailBox.sendKeys("harun@deneme.com");

        // click retrieve password button
        WebElement retrievePasswordButton = driver.findElement(By.id("form_submit"));
        retrievePasswordButton.click();

        //TASK
        // verify thaturl changed to http://practice.cybertek.com/email_sent

        String expectedUrl="http://practice.cybertekschool.com/email_sent";

        //Saving actual url
        String actualUrl=driver.getCurrentUrl();

        if(expectedUrl.equals(actualUrl)) {
            System.out.println("pass");
        }else{
            System.out.println("faill");
            System.out.println("expectedUrl = " + expectedUrl);
            System.out.println("actualUrl = " + actualUrl);
        }
        }



}
