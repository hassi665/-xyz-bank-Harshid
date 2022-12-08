package com.way2automation.pages;

import com.way2automation.utility.Utility;
import org.openqa.selenium.By;

public class OpenAccountPage extends Utility {

    By openAccount = By.xpath("//button[contains(text(),'Open Account')]");

    By addedCustomer = By.id("userSelect");

    By currency = By.id("currency");
    By process = By.xpath("//button[contains(text(),'Process')]");



    public void clickOnOpenAccount(){
        clickOnElement(openAccount);
    }

    public void selectCustomer(){
        selectByValueFromDropDown(addedCustomer, "2");
    }

    public void selectCurrency(){
        selectByValueFromDropDown(currency, "Pound");
    }

    public void clickOnProcess(){
        clickOnElement(process);
    }

}
