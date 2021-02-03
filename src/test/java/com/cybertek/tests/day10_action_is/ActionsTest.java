package com.cybertek.tests.day10_action_is;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ActionsTest {
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
        driver.get("http://practice.cybertekschool.com/hovers");

        WebElement img1 =driver.findElement(By.tagName("img"));
        // Actions  --> class that contains all the user interactions
        // how to create actions object ---> passing driver as a constructor

        Actions actions = new Actions(driver);
        //perfom() --> perform actions, complate the action
        //moveToElement --> move mouse to weElement(hover over)
        //Thread.sleep(2000);
       actions.moveToElement(img1).perform();
        Thread.sleep(2000);

        WebElement viewlink = driver.findElement(By.linkText("View profile"));

        Assert.assertTrue(viewlink.isDisplayed(),"verify view link is displayed");
        //if DONT USE .perform()
        //verify view link is displayed expected [true] but found [false]

    }

    @Test
    public void dragAndDrop () throws InterruptedException {
        driver.get("http://demos.telerik.com/kendo-ui/dragdrop/index");
        driver.manage().window().maximize();

        Actions actions = new Actions(driver);

        WebElement source=driver.findElement(By.id("draggable"));
        WebElement target=driver.findElement(By.id("droptarget"));

        driver.findElement(By.xpath("//*[@id='onetrust-accept-btn-handler']")).click();

        Thread.sleep(2000);

        actions.dragAndDrop(source,target).perform();
        Thread.sleep(2000);
    }

    @Test
    public void dragdrop2 () throws InterruptedException {
        driver.get("http://demos.telerik.com/kendo-ui/dragdrop/index");
        driver.manage().window().maximize();

        Actions actions = new Actions(driver);

        WebElement source=driver.findElement(By.id("draggable"));
        WebElement target=driver.findElement(By.id("droptarget"));

        driver.findElement(By.xpath("//*[@id='onetrust-accept-btn-handler']")).click();

        Thread.sleep(2000);

        actions.moveToElement(source).clickAndHold().moveToElement(target).pause(2000).release().perform();
        Thread.sleep(2000);
    }

}
