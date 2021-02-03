package com.cybertek.tests.day3_webelement;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class verifyComfirmationMessage {
    public static void main(String[] args) {
        /*
        Verify confirmation message

        open chrome message
        go to http://practice.cybertekschool.com/forgot_password Link to external site
        enter any email
        verify that confirmation message

         */

        WebDriver driver = WebDriverFactory.getDriver("cHromE");
        driver.get("http://practice.cybertekschool.com/forgot_password");
        WebElement emailInputBox = driver.findElement(By.name("email"));
        String expectedEmail = "mike@smith.com";
        emailInputBox.sendKeys(expectedEmail);


        // some how we should get  text from web elements
        //to main ways to get txt from web elements
        //1. getText() it will work %99 ant it return string
        // 2. getAttribute("value") --> second way of getting text especially input boxes



        String actualEmail = emailInputBox.getAttribute("value");

        System.out.println("actualEmail = " + actualEmail);

        if(expectedEmail.equals(actualEmail)){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }

        //click on retrieve passwrd
        WebElement retrievePasswordButton =driver.findElement(By.id("form_submit"));
        retrievePasswordButton.click();

        //verify that confirmation message says "Your e-mail's been sent!"
        WebElement actualConfirmationMessage = driver.findElement(By.name("confirmation_message"));

        System.out.println(actualConfirmationMessage.getText());

        //save expected message
        String expectedMessage = "Your e-mail's been sent!";




        //save actual message to variable
        String actualMessage = actualConfirmationMessage.getText();

                if(expectedMessage.equals(actualMessage)){
                    System.out.println("Pass");
                }else{
                    System.out.println("Fail");
                    System.out.println("actualMessage = " + actualMessage);
                    System.out.println("expectedMessage = " + expectedMessage);
                }

                //close browser
                driver.quit();

    }
}
