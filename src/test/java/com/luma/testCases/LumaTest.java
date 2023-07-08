package com.luma.testCases;

import com.luma.BaseClass;
import com.luma.pages.CreateAccount;
import com.luma.pages.HomePage;
import com.luma.pages.SearchPage;
import com.luma.pages.SignUpPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LumaTest extends BaseClass {

    @Test
    public void homePageTest() {
        WebDriver driver = getDriver();
        HomePage homePage = new HomePage(driver);
        homePage.frontPage();
        homePage.createAccount();
        homePage.signIn();
        homePage.search();
        homePage.searchButton();
        homePage.inCart();
        homePage.closeCart();
        driver.close();
    }

    @Test
    public void createAccountTest(){
        WebDriver driver = getDriver();
        HomePage homePage = new HomePage(driver);
        homePage.frontPage();
        homePage.createAccount();
        CreateAccount createAccount=new CreateAccount(driver);
        createAccount.fillAccountForm();
    }
    @Test
    public void signUpTest(){
        WebDriver driver = getDriver();
        HomePage homePage = new HomePage(driver);
        homePage.frontPage();
        homePage.signIn();
        SignUpPage signUpPage=new SignUpPage(driver);
        signUpPage.signUp();
    }

    @Test
    public void searchTest(){
        WebDriver driver = getDriver();
        HomePage homePage = new HomePage(driver);
        homePage.frontPage();
        homePage.search();
        homePage.searchButton();
        SearchPage searchPage=new SearchPage(driver);
        searchPage.selectSorter();
    }





}