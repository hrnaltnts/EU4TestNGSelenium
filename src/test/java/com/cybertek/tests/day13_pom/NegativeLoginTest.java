package com.cybertek.tests.day13_pom;

import com.cybertek.pages.LoginPage;
import com.cybertek.tests.TestBase;
import com.cybertek.utilities.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NegativeLoginTest extends TestBase {

    @Test
    public void wrongPasswordTest(){

        //EVERYTHING COME FROM configuration.properties

       // driver.findElement(By.id("prependedInput")).sendKeys("user1");
       // driver.findElement(By.id("prependedInput2")).sendKeys("adsfaf");
       // driver.findElement(By.id("_submit")).click();

        // NOW COME FROM LoginPage

        //How to create Pom ?
        //Create a new package
        //1.Right click on cybertek
        //2.new -> package
        //3.Enter name: pages
        //4.OK

        LoginPage loginPage= new LoginPage();
        loginPage.usernameInput.sendKeys("user1");
        loginPage.passwordInput.sendKeys("asfasfas");
        loginPage.loginBtn.click();

        Assert.assertEquals(driver.getCurrentUrl(),"https://qa1.vytrack.com/user/login");

    }

}
