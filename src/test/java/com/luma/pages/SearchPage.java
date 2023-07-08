package com.luma.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.SkipException;

public class SearchPage extends  BasePage{


    public SearchPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public void selectSorter(){
throw  new SkipException("skip test");

    }



}
