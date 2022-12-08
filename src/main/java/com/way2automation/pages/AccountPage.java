package com.way2automation.pages;

import com.way2automation.utility.Utility;
import org.openqa.selenium.By;

public class AccountPage extends Utility {

    By deposit = By.xpath("//button[contains(text(),'Deposit')]");
    By depositSubmit = By.xpath("//button[@type= 'submit']");

    By withdraw = By.xpath("//button[contains(text(),'Withdrawl')]");
    By withdrawSubmit = By.xpath("//button[@type= 'submit']");
    By enterAmout = By.xpath("//input[@placeholder = 'amount']");

    public void clickOnDepositOption(){
        clickOnElement(deposit);
    }

    public void sendAmountToField(){
        sendTextToElement(enterAmout, "100");
    }

    public void clickOnDeposit(){
        clickOnElement(depositSubmit);
    }

    public void clickOnWithdrawlOption(){
        clickOnElement(withdraw);
    }

    public void enterAmountWithdrawn(){
        sendTextToElement(enterAmout, "50");
    }

    public void clickOnWithdraw(){
        clickOnElement(withdrawSubmit);
    }

}
