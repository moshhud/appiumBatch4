package com.appium.batch4.pom.pages;

import com.appium.batch4.pom.BaseEmiCalculatorTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmiDetailedPage extends BaseEmiCalculatorTest {

    @FindBy(id="total_payment_result")
    WebElement totalPaymentResult;

    public EmiDetailedPage(){
        PageFactory.initElements(driver, this);
    }

    public boolean hasTotalPaymentResult(){
        return totalPaymentResult.isDisplayed();
    }
}
