package com.appium.batch4.pom.pages;

import com.appium.batch4.pom.BaseEmiCalculatorTest;
import com.appium.batch4.pom.util.General;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.backgroundservice.BackgroundService;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class CalculatorPage extends BaseEmiCalculatorTest {
    @FindBy(id="etLoanAmount")
    WebElement etLoanAmount;

    @FindBy(id="etInterest")
    WebElement etInterest;

    @FindBy(id = "etYears")
    WebElement etYears;

    @FindBy(id = "etMonths")
    WebElement etMonths;

    @FindBy(id = "etFee")
    WebElement etFee;

    @FindBy(id = "btnCalculate")
    WebElement btnCalculate;

    @FindBy(id = "btnReset")
    WebElement btnReset;

    @FindBy(id = "btnDetail")
    WebElement btnDetail;

    public CalculatorPage() {
        //PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(General.TIME_OUT)), this);
        PageFactory.initElements(driver, this);
    }

    public CalculatorPage fillLoanAmount(int amount){
        etLoanAmount.isDisplayed();
        etLoanAmount.clear();
        etLoanAmount.sendKeys(String.valueOf(amount));
        return this;
    }

    public CalculatorPage fillInterestPercentage(int interest) {
        etInterest.isDisplayed();
        etInterest.clear();
        etInterest.sendKeys(String.valueOf(interest));
        return this;
    }


    public CalculatorPage fillYear(int year) {
        etYears.isDisplayed();
        etYears.clear();
        etYears.sendKeys(String.valueOf(year));
        return this;
    }

    public CalculatorPage fillMonth(int months) {
        etMonths.isDisplayed();
        etMonths.clear();
        etMonths.sendKeys(String.valueOf(months));
        return this;
    }

    public CalculatorPage fillProcessFee(int fee) {
        etFee.isDisplayed();
        etFee.clear();
        etFee.sendKeys(String.valueOf(fee));
        return this;
    }

    public CalculatorPage tapCalculatorBtn() {
        btnCalculate.isDisplayed();
        btnCalculate.click();
        return this;
    }

    public boolean hasDetailBtn() {
        return btnDetail.isDisplayed();
    }

    public CalculatorPage tapResetBtn(){
        btnReset.isDisplayed();
        btnReset.click();
        return this;
    }

    public EmiDetailedPage tapEmiDetailBtn(){
        btnDetail.isDisplayed();
        btnDetail.click();
        return  new EmiDetailedPage();
    }


}
