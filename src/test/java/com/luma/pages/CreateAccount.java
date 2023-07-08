package com.luma.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccount extends  BasePage{
    @FindBy(id="firstname")
    private WebElement firstname;
    @FindBy(id="lastname")
    private WebElement lastname;
    @FindBy(id="is_subscribed")
    private WebElement subscribedButton;
    @FindBy(id="email_address")
    private WebElement email;
    @FindBy(css="input#password")
    private WebElement password;
    @FindBy(id="password-confirmation")
    private WebElement passwordMatch;
    @FindBy(xpath = "//*[contains(span,'Create an Account')]")
    private WebElement createButton;

    public CreateAccount(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public void fillAccountForm(){
        firstname.sendKeys("Ram");
        lastname.sendKeys("Yadav");
        subscribedButton.click();
        email.sendKeys("ramyadav124@gmail.com");
        password.sendKeys("Password@12");
        passwordMatch.sendKeys("Password@12");
        createButton.click();
    }

}