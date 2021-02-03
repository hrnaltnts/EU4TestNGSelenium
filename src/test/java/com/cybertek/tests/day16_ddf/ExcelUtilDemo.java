package com.cybertek.tests.day16_ddf;

import com.cybertek.utilities.ExcelUtil;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class ExcelUtilDemo {

    @Test
    public  void readExcelFile(){

    //Create an object from ExelUtil
    //it accepts two argument
    //Argument 1: location of the file(path)
    //Argument 2: sheet that wew want to open (sheetName)

        ExcelUtil qa3short =new ExcelUtil("src/test/resources/Vytracktestdata.xlsx", "QA3-short");

        //how many row in the sheet
        System.out.println("qa3short.rowCount() = " + qa3short.rowCount());
        //qa3short.rowCount() = 14

        //how many columns in the sheet
        System.out.println("qa3short.columnCount() = " + qa3short.columnCount());
        //qa3short.columnCount() = 4

        //get all column names
        System.out.println("qa3short.getColumnsNames() = " + qa3short.getColumnsNames());
        //qa3short.getColumnsNames() = [username, password, firstname, lastname]

        //get all data in List of maps

        //qa3short.getDataList(); right click create variable
        List<Map<String, String>> dataList = qa3short.getDataList();

       //iter  --- onerow

        for (Map<String, String> onerow : dataList) {
            System.out.println( onerow);
            //{password=UserUser123, firstname=John, username=user1, lastname=Doe}
            //{password=UserUser123, firstname=Kyleigh, username=user4, lastname=Reichert}
            //{password=UserUser123, firstname=Nona, username=user5, lastname=Carroll}
            //{password=UserUser123, firstname=Geovany, username=storemanager51, lastname=Jenkins}
            //{password=UserUser123, firstname=Roma, username=storemanager52, lastname=Medhurst}
            //{password=UserUser123, firstname=Aditya, username=storemanager53, lastname=Rempel}
            //{password=UserUser123, firstname=Turner, username=storemanager54, lastname=Considine}
            //{password=UserUser123, firstname=Rachel, username=storemanager55, lastname=Oberbrunner}
            //{password=UserUser123, firstname=Peyton, username=salesmanager101, lastname=Harber}
            //{password=UserUser123, firstname=Patricia, username=salesmanager102, lastname=Doyle}
            //{password=UserUser123, firstname=Nellie, username=salesmanager103, lastname=Corwin}
            //{password=UserUser123, firstname=Nikita, username=salesmanager104, lastname=Wintheiser}
            //{password=UserUser123, firstname=Geraldine, username=salesmanager105, lastname=Parisian}

        }

        //get Nona as a value
        System.out.println("dataList.get(2) = " + dataList.get(2));
        //dataList.get(2) = {password=UserUser123, firstname=Nona, username=user5, lastname=Carroll}
        System.out.println("dataList.get(2) = " + dataList.get(2).get("firstname"));
        //dataList.get(2) = Nona


        //get all data in 2d array

        String [][] dataArray =qa3short.getDataArray();

        System.out.println(Arrays.deepToString(dataArray));
        //[[username, password, firstname, lastname], [user1, UserUser123, John, Doe], [user4, UserUser123, Kyleigh, Reichert], [user5, UserUser123, Nona, Carroll], [storemanager51, UserUser123, Geovany, Jenkins], [storemanager52, UserUser123, Roma, Medhurst], [storemanager53, UserUser123, Aditya, Rempel], [storemanager54, UserUser123, Turner, Considine], [storemanager55, UserUser123, Rachel, Oberbrunner], [salesmanager101, UserUser123, Peyton, Harber], [salesmanager102, UserUser123, Patricia, Doyle], [salesmanager103, UserUser123, Nellie, Corwin], [salesmanager104, UserUser123, Nikita, Wintheiser], [salesmanager105, UserUser123, Geraldine, Parisian]]



    }
}
