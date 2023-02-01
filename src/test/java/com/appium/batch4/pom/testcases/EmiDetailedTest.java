package com.appium.batch4.pom.testcases;

import com.appium.batch4.pom.BaseEmiCalculatorTest;
import com.appium.batch4.pom.pages.CalculatorPage;
import com.appium.batch4.pom.pages.EmiDetailedPage;
import com.appium.batch4.pom.pages.HomePage;
import com.appium.batch4.pom.util.General;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class EmiDetailedTest extends BaseEmiCalculatorTest {
    EmiDetailedPage emiDetailedPage;
    CalculatorPage calculatorPage;

    @BeforeClass
    public void initialization() {
        calculatorPage = new HomePage().tapEmiCalculatorBtn();
    }

    @Test
    public void calculateLoanShouldSucceed(){
        calculatorPage = calculatorPage
                .fillLoanAmount(250000)
                .fillInterestPercentage(8)
                .fillYear(5)
                .fillMonth(6)
                .fillProcessFee(2)
                .tapCalculatorBtn();

        Assert.assertTrue(calculatorPage.hasDetailBtn());

        emiDetailedPage = calculatorPage.tapEmiDetailBtn();
        Assert.assertTrue(emiDetailedPage.hasTotalPaymentResult());
        General.waitForDomStable();


    }
}
