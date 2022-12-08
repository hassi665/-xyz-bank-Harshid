package com.way2automation.testsuite;

import com.way2automation.pages.*;
import com.way2automation.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BankTest extends BaseTest {

    Homepage homepage = new Homepage();
    CustomersPage customersPage = new CustomersPage();
    AddCustomerPage addCustomerPage = new AddCustomerPage();

    BankManagerLoginPage bankManagerLoginPage = new BankManagerLoginPage();

    CustomerLoginPage customerLoginPage = new CustomerLoginPage();

    OpenAccountPage openAccountPage = new OpenAccountPage();
    AccountPage accountPage = new AccountPage();

    @Test
    public void bankManagerShouldAddCustomerSuccessfully() {

        //click On "Bank Manager Login" Tab
        bankManagerLoginPage.clickOnBankManger();

        //	click On "Add Customer" Tab
        bankManagerLoginPage.clickOnAddCustomer();

        // 	enter FirstName
        addCustomerPage.sendFirstName();

        //	enter LastName
        addCustomerPage.sendLastName();

        //	enter PostCode
        addCustomerPage.sendPostCode();

        //	click On "Add Customer" Button
        addCustomerPage.clickOnAddCustomer1();

        //	popup display & verify message "Customer added successfully"
        getTextFromAlert();
        Assert.assertTrue(addCustomerPage.getTextFromAlert().contains("Customer added successfully"));

        //	click on "ok" button on popup.
        acceptAlert();

    }

    @Test
    public void bankManagerShouldOpenAccountSuccessfully() throws InterruptedException {

        //click On "Bank Manager Login" Tab
        Thread.sleep(1000);
        bankManagerLoginPage.clickOnBankManger();

        //	click On "Open Account" Tab
        openAccountPage.clickOnOpenAccount();

        //	Search customer that created in first test
        openAccountPage.selectCustomer();

        //	Select currency "Pound"
        Thread.sleep(1000);
        openAccountPage.selectCurrency();

        //	click on "process" button
        openAccountPage.clickOnProcess();

        //	popup displayed verify message "Account created successfully"
        getTextFromAlert();
        Assert.assertTrue(openAccountPage.getTextFromAlert().contains("Account created successfully"));
        System.out.println(openAccountPage.getTextFromAlert());

        //	click on "ok" button on popup.
        acceptAlert();

    }

    @Test
    public void customerShouldLoginAndLogoutSuceessfully() {

        //click on "Customer Login" Tab
        customerLoginPage.clickOnCustomerLogin();

        //	search customer that you created.
        customersPage.searchCustomer();

        //	click on "Login" Button
        customerLoginPage.clickOnLogin();

        //	verify "Logout" Tab displayed.
        verifyText(By.xpath("//button[contains(text(),'Logout')]"), "Logout", "Login not successfully");

        //	click on "Logout"
        customerLoginPage.clickOnLogout();

        //	verify "Your Name" text displayed.
        verifyText(By.xpath("//label[contains(text(),'Your Name :')]"), "Your Name :", "Logout not successfully");

    }

    @Test
    public void customerShouldDepositMoneySuccessfully(){

        //click on "Customer Login" Tab
        customerLoginPage.clickOnCustomerLogin();

        //	search customer that you created.
        customersPage.searchCustomer();

        //	click on "Login" Button
        customerLoginPage.clickOnLogin();

        //	click on "Deposit" Tab
        accountPage.clickOnDepositOption();

        //	Enter amount 100
        accountPage.sendAmountToField();

        //	click on "Deposit" Button
        accountPage.clickOnDeposit();

        //	verify message "Deposit Successful"
        verifyText(By.xpath("//span[contains(text(),'Deposit Successful')]"), "Deposit Successful", "Ammount not Diposited");

    }

    @Test
    public void customerShouldWithdrawMoneySuccessfully(){

        //click on "Customer Login" Tab
        customerLoginPage.clickOnCustomerLogin();

        //	search customer that you created.
        customersPage.searchCustomer();

        //	click on "Login" Button
        customerLoginPage.clickOnLogin();

        //	click on "Withdrawl" Tab
        accountPage.clickOnWithdrawlOption();

        //	Enter amount 50
        accountPage.enterAmountWithdrawn();

        //	click on "Withdraw" Button
        accountPage.clickOnWithdraw();

        //	verify message "Transaction Successful"
        verifyText(By.xpath("//span[contains(text(),'Transaction successful')]"), "Transaction successful", "Transaction not succeed");
    }


}
