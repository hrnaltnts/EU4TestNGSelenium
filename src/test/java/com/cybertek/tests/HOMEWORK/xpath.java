package com.cybertek.tests.HOMEWORK;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class xpath {

    public static void main(String[] args) {


        WebDriver driver= WebDriverFactory.getDriver("Chrome");

        driver.get("https://www.kitapyurdu.com/");

        WebElement findAuthor = driver.findElement(By.xpath("//a[@href='yazarlar']"));
        findAuthor.click();

        WebElement findSearchAuthor = driver.findElement(By.xpath("//input[@name='search']"));
        findSearchAuthor.sendKeys("Sabahattin Ali");

        WebElement clickSearch = driver.findElement(By.xpath("//input[@value='Arama']"));
        clickSearch.click();

        WebElement MyALi =driver.findElement((By.xpath("//a[text()='Sabahattin Ali']")));
        MyALi.click();

        WebElement BooksNumber = driver.findElement(By.xpath("//div[@class='results']"));

        System.out.println("BooksNumber.getText() = " + BooksNumber.getText());

        WebElement GetPrice =driver.findElement(By.xpath("(//span[@class='TL'])[16]"));
        System.out.println("GetPrice.getText() = " + GetPrice.getText());


    }
    }


