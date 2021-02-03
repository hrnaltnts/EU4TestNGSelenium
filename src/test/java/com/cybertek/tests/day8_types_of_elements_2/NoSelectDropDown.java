package com.cybertek.tests.day8_types_of_elements_2;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class NoSelectDropDown {

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
    public void test1() {
        driver.get("http://practice.cybertekschool.com/dropdown");

        WebElement dropdownelement = driver.findElement(By.id("dropdownMenuLink"));

        //click the dropdown to see available options
        dropdownelement.click();
        //get the options with findElements method and finding common loactor between them
        List<WebElement> dropdownOption = driver.findElements(By.className("dropdown-item"));

        //Print size of options
        System.out.println("buttons.size() = " + dropdownOption.size());
        Assert.assertEquals(dropdownOption.size(), 5, "verify buttons size");

        //print them one by one
        for (WebElement option : dropdownOption) {
            System.out.println("webElement = " + option.getText());
        }

        //click yahoo
        dropdownOption.get(2).click();


    }
}