package com.cybertek.tests.day16_ddf;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DDFWithDataProvider {

    @DataProvider
    public Object[][] testData(){
        String[][] data={
                {"Person of Interest","10"},
                {"Sherlock","9"},
                {"Breaking Bad","4"},
                {"The Office","8"},
                {"Friends","7"},
                {"Gotham","6"},
        };
        return data;
    }

    @Test(dataProvider = "testData")
    public void test1(String tvshow,String rating){
        System.out.println("Tv show: " + tvshow+" has rating "+rating);
        //Tv show: Person of Interest has rating 10
        //Tv show: Sherlok has rating 9
        //Tv show: Breaking Bad has rating 4
        //Tv show: The Office has rating 8
        //Tv show: Friends has rating 7
        //Tv show: Gotham has rating 6


    }


}
