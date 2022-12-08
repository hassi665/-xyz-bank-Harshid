package com.way2automation.pages;

import com.way2automation.utility.Utility;
import org.openqa.selenium.By;

public class CustomerLoginPage extends Utility {

    By customerLogin = By.xpath("//button[contains(text(),'Customer Login')]");


    By login = By.xpath("//button[contains(text(),'Login')]");

    By logout = By.xpath("//button[contains(text(),'Logout')]");



    public void clickOnCustomerLogin(){
        clickOnElement(customerLogin);
    }

    public void clickOnLogin(){
        clickOnElement(login);
    }

    public void clickOnLogout(){
        clickOnElement(logout);
    }

}
