package com.cybertek.tests.day12_properties_driver_tests;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SingletonTest {

    @Test
    public void test1(){
        String s1=Singleton.getInstance();
        String s2=Singleton.getInstance();

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);

        /*
        str is null. assigning value it
        it has value, just returning it
        s1 = somevalue
        s2 = somevalue
         */
    }
    @Test
    public void test2(){
        WebDriver driver= Driver.get();
        driver.get("https://wwww.google.com");
        //Browser type selected at configuration.properties
        /* HOW WE CREATE configuration.properties
        Create Properties file
        1.Right click on the name of the project
        2.New -> File
        3.Enter name: configuration.properties
        4.OK*/
        //DONT USE HERE



    }
    @Test
    public void test3(){
       // Driver.get().get("https://wwww.google.com"); Also u can use this structure





    }
}
