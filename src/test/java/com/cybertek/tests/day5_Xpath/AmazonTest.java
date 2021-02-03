package com.cybertek.tests.day5_Xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonTest {

    /*
    TASK
    go to Amazon.com
    search for selenium
    click search button
    verify 1-48 of results for "selenium"

     */
    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("Chrome");

        driver.get("https://www.amazon.com/");

        WebElement searchBox =driver.findElement((By.xpath("//*[@id='twotabsearchtextbox']")));

        searchBox.sendKeys("selenium");

        driver.findElement(By.xpath("//*[@id='nav-search-submit-text']/input")).click();

        WebElement result=driver.findElement(By.xpath("//span[contains(text(),'results for')]"));

        String  resulttext=result.getText();

        System.out.println("resulttext = " + resulttext);

        String expextedResult="1-48 of 129 results for \"selenium\"";

        if(expextedResult.equals(resulttext)){
            System.out.println("pass");
        }else{
            System.out.println("Faill");
            System.out.println("expextedResult = " + expextedResult);
            System.out.println("resulttext = " + resulttext);
        }
/*
        resulttext = 1-48 of 128 results for
        Faill
                expextedResult = 1-48 of 129 results for "selenium"
        resulttext = 1-48 of 128 results for

        Process finished with exit code 0
*/

    }

}
