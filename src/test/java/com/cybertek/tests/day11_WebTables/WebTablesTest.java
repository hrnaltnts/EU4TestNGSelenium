package com.cybertek.tests.day11_WebTables;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class WebTablesTest {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/tables");


    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(200);
        driver.quit();

    }

    @Test
    public void printTable() throws InterruptedException {
        WebElement table = driver.findElement(By.xpath("//table[@id='table1']"));

        System.out.println(table.getText());

        Assert.assertTrue(table.getText().contains("jdoe@hotmail.com"));
        /*
        Last Name First Name Email Due Web Site Action
        Smith John jsmith@gmail.com $50.00 http://www.jsmith.com edit delete
        Bach Frank fbach@yahoo.com $51.00 http://www.frank.com edit delete
        Doe Jason jdoe@hotmail.com $100.00 http://www.jdoe.com edit delete
        Conway Tim tconway@earthlink.net $50.00 http://www.timconway.com edit delete

        ===============================================
        Default Suite
        Total tests run: 1, Passes: 1, Failures: 0, Skips: 0
        ===============================================

         */


    }
    @Test
    public void gatAllHeaders() throws InterruptedException {

        // How many colums we have?

        List<WebElement> headers = driver.findElements(By.xpath("//table[@id='table1']//th"));
        System.out.println("headers.size() = " + headers.size());

        //number of rows
        List<WebElement> AllrowsWithHeader = driver.findElements(By.xpath("//table[@id='table1']//tr"));
        System.out.println("AllrowsWithHeader.size() = " + AllrowsWithHeader.size());

        //number of rows without header (we prefer this)
        List<WebElement> AllrowsWithoutHeader = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
        System.out.println("AllrowsWithoutHeader.size() = " + AllrowsWithoutHeader.size());
        /*
        headers.size() = 6
        AllrowsWithHeader.size() = 5
        AllrowsWithoutHeader.size() = 4
         */

    }

    @Test
    public void getRow(){

        //print the second row information
        WebElement row2 = driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[2]"));

        System.out.println("row2.getText() = " + row2.getText());

        //get all rows dynamicly
        //1. fimd number of rows
        List<WebElement> numRows = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));

        //2.iterate one by one
        for (int i = 1; i < numRows.size(); i++) {

            WebElement row = driver.findElement(By.xpath("//table[@id='table1']/tbody/tr["+i+"]"));
            System.out.println("row.getText() = " + row.getText());

        }
        //****loop shortcut iter and itar****
        /*
        row2.getText() = Bach Frank fbach@yahoo.com $51.00 http://www.frank.com edit delete
        row.getText() = Smith John jsmith@gmail.com $50.00 http://www.jsmith.com edit delete
        row.getText() = Bach Frank fbach@yahoo.com $51.00 http://www.frank.com edit delete
        row.getText() = Doe Jason jdoe@hotmail.com $100.00 http://www.jdoe.com edit delete

        ===============================================
        Default Suite
        Total tests run: 1, Passes: 1, Failures: 0, Skips: 0
        ===============================================


        Process finished with exit code 0
         */
    }

    @Test
    public void GetAllCellInOneRow() {
        List<WebElement> AllcellElements = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr[1]/td"));

        for (WebElement webElement : AllcellElements) {
            System.out.println(webElement.getText());
            /*
            Smith
            John
            jsmith@gmail.com
            $50.00
            http://www.jsmith.com
            edit delete
             */


        }
    }

        @Test
    public void printAllCellByIndex(){
        int rowNumber= getNumberOfRows();
        int colNumber= getNumberOfRows();

            System.out.println("rowNumber = " + rowNumber);
            System.out.println("colNumber = " + colNumber);

            //iterate throgheachrow on th table
            for (int i = 1; i <= rowNumber; i++) {
                 //iterate through each cell in the row
                for (int j = 1; j <= colNumber; j++) {
                     String cellXpath="//table[@id='table1']/tbody/tr["+i+"]/td["+j+"]";
                    System.out.println(cellXpath);

                }

            }
            /*
            rowNumber = 4
            colNumber = 4

            //table[@id='table1']/tbody/tr[1]/td[1]
            //table[@id='table1']/tbody/tr[1]/td[2]
            //table[@id='table1']/tbody/tr[1]/td[3]
            //table[@id='table1']/tbody/tr[1]/td[4]
            //table[@id='table1']/tbody/tr[2]/td[1]
            //table[@id='table1']/tbody/tr[2]/td[2]
            //table[@id='table1']/tbody/tr[2]/td[3]
            //table[@id='table1']/tbody/tr[2]/td[4]
            //table[@id='table1']/tbody/tr[3]/td[1]
            //table[@id='table1']/tbody/tr[3]/td[2]
            //table[@id='table1']/tbody/tr[3]/td[3]
            //table[@id='table1']/tbody/tr[3]/td[4]
            //table[@id='table1']/tbody/tr[4]/td[1]
            //table[@id='table1']/tbody/tr[4]/td[2]
            //table[@id='table1']/tbody/tr[4]/td[3]
            //table[@id='table1']/tbody/tr[4]/td[4]
             */


        }


        @Test
        public void getCellInRelationToAnotherCellInSameRow(){

        String firstANme="John";
        String xpath ="//table[@id='table1']//td[.='"+firstANme+"']/../td[3]";
        WebElement email=driver.findElement(By.xpath(xpath));


            System.out.println("email.getText() = " + email.getText());
            //email.getText() = jsmith@gmail.com


        }

        private int getNumberOfColums(){
            List<WebElement> headers = driver.findElements(By.xpath("//table[@id='table1']//th"));
            return headers.size();

        }

        private int getNumberOfRows(){
            List<WebElement> AllrowsWithoutHeader = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
            return AllrowsWithoutHeader.size();

        }





}
