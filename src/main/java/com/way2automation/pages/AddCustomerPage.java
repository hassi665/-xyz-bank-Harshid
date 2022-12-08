package com.way2automation.pages;

import com.way2automation.utility.Utility;
import org.openqa.selenium.By;

public class AddCustomerPage extends Utility {

    //------------------------AddCutomer Detils -------------------------------------//

    By firstName = By.xpath("//input[@placeholder='First Name']");
    By lastName = By.xpath("//input[@placeholder='Last Name']");
    By postCode = By.xpath("//input[@placeholder='Post Code']");
    By addCustomer1= By.xpath("//button[@class='btn btn-default']");


    public void sendFirstName(){
        sendTextToElement(firstName, "John");
    }

    public void sendLastName(){
        sendTextToElement(lastName, "Cena");
    }

    public void sendPostCode(){
        sendTextToElement(postCode, "EN15JK");
    }

    public void clickOnAddCustomer1(){
        clickOnElement(addCustomer1);
    }

}
