package com.luma.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage extends BasePage{
    @FindBy(id="email")
    private WebElement email;
    @FindBy(id="pass")
    private WebElement password;
    @FindBy(css = "button.action.login.primary")
  //  @FindBy(xpath = "//*[contains(span,'Sign In')]")
    private WebElement signInButton;

    public SignUpPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public void signUp(){
        email.sendKeys("ramyadav12@gmail.com");
        password.sendKeys("Password@12");
        signInButton.click();
    }

}