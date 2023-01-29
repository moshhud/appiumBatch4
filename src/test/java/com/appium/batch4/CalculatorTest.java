package com.appium.batch4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CalculatorTest extends BaseTest{
    @Test
    public void addShouldSucceed() throws InterruptedException {

        WebElement wel0 = driver.findElement(By.id("digit_0"));
        WebElement wel1 = driver.findElement(By.id("digit_1"));
        WebElement wel2 = driver.findElement(By.id("digit_2"));
        WebElement wel3 = driver.findElement(By.id("digit_3"));
        WebElement wel4 = driver.findElement(By.id("digit_4"));
        WebElement wel5 = driver.findElement(By.id("digit_5"));
        WebElement weladd = driver.findElement(By.id("op_add"));
        WebElement weleq = driver.findElement(By.id("eq"));
        WebElement welDec = driver.findElement(By.id("dec_point"));

        wel5.isDisplayed();
        wel5.click();
        Thread.sleep(1000);


        wel0.isDisplayed();
        wel0.click();
        Thread.sleep(1000);

        weladd.isDisplayed();
        weladd.click();
        Thread.sleep(1000);


        wel3.isDisplayed();
        wel3.click();
        Thread.sleep(1000);

        welDec.isDisplayed();
        welDec.click();
        Thread.sleep(1000);

        wel4.isDisplayed();
        wel4.click();
        Thread.sleep(1000);

        weleq.isDisplayed();
        weleq.click();
        Thread.sleep(3000);

    }
}
