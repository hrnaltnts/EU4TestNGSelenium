package com.cybertek.tests.day9_popups_tabs_frames;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class IframeTest {

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
        public void test1() throws InterruptedException {
            driver.get("http://practice.cybertekschool.com/iframe");


            //How to switch frames
            //1.Switch using by name or ID attribute of iframe
            driver.switchTo().frame("mce_0_ifr");

            //clear before sendKeys
            driver.findElement(By.cssSelector("#tinymce")).clear();
            Thread.sleep(2000);
            driver.findElement(By.cssSelector("#tinymce")).sendKeys("MikeSmith");

            //goes back to first frame (main html)
            //goes back to first frame,useful when we have switched multiple frames
            driver.switchTo().defaultContent();

            //2.Switching with INDEX
            driver.switchTo().frame(0);
            Thread.sleep(2000);

            //clear before sendkeys
            driver.findElement(By.cssSelector("#tinymce")).clear();
            Thread.sleep(2000);
            driver.findElement(By.cssSelector("#tinymce")).sendKeys("MikeSmith WITH INDEX");

            //second way to switch parent
            driver.switchTo().parentFrame();

            //3.USING WEB ELEMENT
            WebElement IframeElemt=driver.findElement(By.tagName("iframe"));

            driver.switchTo().frame(IframeElemt);

            Thread.sleep(1000);
            driver.findElement(By.cssSelector("#tinymce")).sendKeys("MikeSmith WITH WEBELEMENT");


        }
        @Test
        public  void test2NestedFrame(){
            driver.get("http://practice.cybertekschool.com/nested_frames");


            //switching to frame top
            driver.switchTo().frame("frame-Top");
            //top has 3 frame undere left middle and right
            //switch to frame middle
            driver.switchTo().frame("frame-middle");
            System.out.println(driver.findElement(By.linkText("content")).getText());

            //goes back to top frame
            driver.switchTo().parentFrame();

            //switch right with index
            driver.switchTo().frame(2);

            driver.findElement(By.tagName("body")).getText();

            //go to main html to switch bottom
            driver.switchTo().defaultContent();

            driver.switchTo().frame(1);
            driver.findElement(By.tagName("body")).getText();

            //go to main html to switch home
            driver.switchTo().defaultContent();

            driver.switchTo().frame(1);
            driver.findElement(By.tagName("body")).getText();
        }

}


