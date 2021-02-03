package com.cybertek.tests.day14_extent_reports;

import com.cybertek.pages.LoginPage;
import com.cybertek.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NegativeLoginTestwithReport extends TestBase {

    @Test
    public void wrongPasswordTest(){
        //name of Test
        extentLogger = report.createTest("Wrong Password Test");

        LoginPage loginPage=new LoginPage();

        extentLogger.info("Enter Username:user1");
        loginPage.passwordInput.sendKeys("somepasword");

        extentLogger.info("Verify login Button");
        loginPage.loginBtn.click();

        extentLogger.info("Verify Page URl");
        Assert.assertEquals(driver.getCurrentUrl(),"https://qa3.vytrack.com/user/login");

        extentLogger.pass("Wrong Password Test is Passed");


        loginPage.usernameInput.sendKeys("user1");
        loginPage.passwordInput.sendKeys("asfasfas");
        loginPage.loginBtn.click();

        Assert.assertEquals(driver.getCurrentUrl(),"https://qa3.vytrack.com/user/login");

    }
    @Test
    public void wrongUsernameTest(){
        extentLogger = report.createTest("Wrong Username Test");

        LoginPage loginPage=new LoginPage();
        extentLogger.info("Enter useername: someusername");

        extentLogger.info("Enter password : UserUser123");

        extentLogger.info("Click Login button");
        loginPage.loginBtn.click();

        extentLogger.info("verify page url");
        Assert.assertEquals(driver.getCurrentUrl(),"https://qa3.vytrack.com/user/login");
        extentLogger.pass("Passed");


        loginPage.usernameInput.sendKeys("someusername");
        loginPage.passwordInput.sendKeys("UserUser123");
        loginPage.loginBtn.click();

        Assert.assertEquals(driver.getCurrentUrl(),"https://qa3.vytrack.com/user/logiwrwarn");

    }

}
