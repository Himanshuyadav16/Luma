package com.luma.testCases;

import com.luma.BaseClass;
import com.luma.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LumaTest extends BaseClass {
    @Test
    public void homePageTest(){
        WebDriver driver =getDriver();
        HomePage homePage=new HomePage(driver);
        homePage.frontPage();
      //  driver.close();
    }

}