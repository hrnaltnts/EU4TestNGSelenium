package com.cybertek.tests.Reviews.trypackage.insidepackage.innerinside;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HelloWorldTest {

    @BeforeTest
    public void trySeconBeforeTest(){
        System.out.println("");
        System.out.println("Hello From Inner Insider Package BEFORE TEST");
        System.out.println("");
    }

    @Test
    public void tryHello(){
        System.out.println("");
        System.out.println("");
        System.out.println("Hello World From Inner Inside Inside Package");
        System.out.println("");
        System.out.println("I  HAVE BEFORE TEST AND AFTER METHOD ANNOTATION");
        System.out.println("");
        System.out.println("");
    }
    @AfterMethod
    public void trySeconAfterMethod(){
        System.out.println("");
        System.out.println("Hello From Inner Insider Package AFTER METHOD");
        System.out.println("");
    }

}
