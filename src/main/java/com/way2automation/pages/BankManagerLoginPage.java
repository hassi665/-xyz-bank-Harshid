package com.way2automation.pages;

import com.way2automation.utility.Utility;
import org.openqa.selenium.By;

public class BankManagerLoginPage extends Utility {

    By bankManagerLogin = By.xpath("//button[contains(text(),'Bank Manager Login')]");
    By addCustomer = By.xpath("//button[contains(text(),'Add Customer')]");



    public void clickOnBankManger(){
        clickOnElement(bankManagerLogin);
    }
    public void clickOnAddCustomer(){
        clickOnElement(addCustomer);
    }



}
