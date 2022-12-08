package com.way2automation.pages;

import com.way2automation.utility.Utility;
import org.openqa.selenium.By;

public class CustomersPage extends Utility {

    By searchCustomer = By.id("userSelect");

    public void searchCustomer(){
        selectByValueFromDropDown(searchCustomer, "1");
    }


}
