package com.softserve.edu;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SimpleTest {

    @Test
    public void testWedDriver() throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        Thread.sleep(1000); // For Presentation Only
        //
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.google.com");
        //
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("Cheese!" + Keys.ENTER);
        System.out.println("1. Page title is: " + driver.getTitle());
        Thread.sleep(1000); // For Presentation Only
        //
        System.out.println("2. Page title is: " + driver.getTitle());
        //
        driver.findElement(By.partialLinkText("Cheese - Wikipedia")).click();
        Thread.sleep(2000); // For Presentation Only
        System.out.println("3. Page title is: " + driver.getTitle());
        //
        WebElement actual = driver.findElement(By.id("siteSub"));
        Assert.assertEquals("From Wikipedia, the free encyclopedia", actual.getText());
        //
        Thread.sleep(2000); // For Presentation Only
        driver.quit();
    }

}
