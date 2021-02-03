package com.cybertek.tests.day7_testing;

import org.testng.annotations.*;

public class BeforeAfterMethod {

    @Test
    public void test1(){
        System.out.println("My First Test");
    }

    @Ignore
    @Test
    public void test2(){
        System.out.println("My Second Test");
    }

    @Test
    public void test3(){
        System.out.println("My Third Test");
    }


    @BeforeMethod
    public void setUp(){
        System.out.println();
        System.out.println("BEFORE METHOD");

        System.out.println("WebDriver, Opening Browser");
    }
    @AfterMethod
        public void TearDown() {
        System.out.println();
        System.out.println("AFTER METHOD");

            System.out.println("Closing Browser, Quit");
        }
    }
    /*

         BEFORE METHOD
WebDriver, Opening Browser
My First Test

AFTER METHOD
Closing Browser, Quit

BEFORE METHOD
WebDriver, Opening Browser
My Third Test

AFTER METHOD
Closing Browser, Quit

===============================================
@BeforeMethod --> runs once before each method with @Test annotations
@AfterMethod --> runs once after each of with @Test annotations

How to ignore some @Test to run ?
@Ignore --> we can put on top of the @Test that we want to ignore
OR
we can comment out the @Test annotation

@BeforeClass --> runs only once before eveything in the class
@AfterClass --> runs only once after everthing in the class

<BeforeClass>
<BeforeMethod>test1<afterMethod>
<BeforeMethod>test2<afterMethod>
<BeforeMethod>test3<afterMethod>
<AfterClass>
===============================================


*/