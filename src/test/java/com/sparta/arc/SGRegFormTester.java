package com.sparta.arc;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.*;

public class SGRegFormTester {

    WebDriver webDriver = new ChromeDriver();
    SGRegFormPOM page = new SGRegFormPOM(webDriver);

    @Test
    public void siteUrlIsCorrect(){
        page = page.goToHomePage();
        assertEquals("http://localhost:9292/", page.getURl());
        webDriver.quit();
    }

    @Test
    public void signInTitleTest(){
        page = page.goToHomePage();
        assertEquals(true,page.isAppTitleCorrect());
        webDriver.quit();
    }

    @Test
    public void firstNamePlaceholderTest(){
        page = page.goToHomePage();
        assertEquals(true, page.isFirstnameTextBoxcorrect());
        webDriver.quit();
    }


    @Test
    public void addressPlaceholderTest(){
        page = page.goToHomePage();
        assertEquals(true,page.isAddressTextBoxcorrect());
        webDriver.quit();
    }

    @Test
    public void invalidFeedbackColour(){
        page = page.goToHomePage();
        assertEquals("rgba(220, 53, 69, 1)",page.isFeedbackRed());
        webDriver.quit();
    }

    @Test
    public void uniOptionsOxfordTest(){
        page = page.goToHomePage();
        assertEquals(true,page.isUniOxford());
        webDriver.quit();
    }


    @Test
    public void maleClickedTest(){
       page = page.goToHomePage();
       assertEquals("rgba(33, 37, 41, 1)",page.isMaleclicked());
       webDriver.quit();
    }

    @Test
    public void countyOptionsHerts(){
        page = page.goToHomePage();
        assertEquals(true, page.isCountyHertforshire());
        webDriver.quit();
    }

    @Test
    public void sDETClickedTest(){
        page = page.goToHomePage();
        assertEquals("rgba(33, 37, 41, 1)",page.isSDETclicked());
        webDriver.quit();
    }

    @Test
    public void devOpsClickedTest(){
        page = page.goToHomePage();
        assertEquals("rgba(33, 37, 41, 1)",page.isDevOpsclicked());
        webDriver.quit();
    }

    @Test
    public void agreedToTermAndConditionsTest(){
        page = page.goToHomePage();
        assertEquals("rgba(40, 167, 69, 1)",page.isTermsClicked());
        webDriver.quit();
    }
}
