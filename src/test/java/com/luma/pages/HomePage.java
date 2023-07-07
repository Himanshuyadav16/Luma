package com.luma.pages;

import com.luma.utils.ApplicationProperties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage extends BasePage{
    public String baseUrl = ApplicationProperties.INSTANCE.getUrl();
    @FindBy(xpath = "//*[contains(a,'Create an Account')]")
    private WebElement createAccount;
    @FindBy(xpath = "//*[contains(a, 'Sign In')]")
    private WebElement signIn ;
    @FindBy(css=".input-text#search")
    private WebElement search;
    @FindBy(css = "button.action.search")
    private WebElement searchButton;
    @FindBy(css = "a.action.showcart")
    private WebElement cartButton;
    @FindBy(id = "btn-minicart-close")
    private  WebElement closeButton;

    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void frontPage() {
        driver.get(baseUrl);
    }

    public void createAccount(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(createAccount));
        createAccount.click();
    }
    public void signIn(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(signIn));
        signIn.click();
    }
    public void search(){
        search.sendKeys("shirt");
    }
    public void searchButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
         wait.until(ExpectedConditions.elementToBeClickable(searchButton));
        searchButton.click();
    }

    public void inCart(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(cartButton));
        cartButton.click();
    }
    public void closeCart(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(closeButton));
        closeButton.click();
    }
}
