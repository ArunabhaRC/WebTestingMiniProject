package com.sparta.arc;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;

public class SGRegFormTester {

    WebDriver webDriver = new ChromeDriver();
    SGRegFormPOM page = new SGRegFormPOM(webDriver);

    @Test
    @DisplayName("Checking website URL is correct")
    public void siteUrlIsCorrect(){
        page = page.goToHomePage();
        assertEquals("http://localhost:9292/", page.getURl());
        webDriver.quit();
    }
    @Test
    @DisplayName("Check to see if Sign in Application has a title")
    public void signInTitleTest(){
        page = page.goToHomePage();
        assertEquals(true,page.isAppTitleCorrect());
        webDriver.quit();
    }

    @Test
    @DisplayName("Checking first name text box for placeholder")
    public void firstNamePlaceholderTest(){
        page = page.goToHomePage();
        assertEquals(true, page.isFirstnameTextBoxcorrect());
        webDriver.quit();
    }

    @Test
    @DisplayName("Checking last name text box for placeholder")
    public void lastNamePlaceholderTest(){
        page = page.goToHomePage();
        assertEquals(true, page.isLastnameTextBoxcorrect());
        webDriver.quit();
    }

    @Test
    public void addressPlaceholderTest(){
        page = page.goToHomePage();
        assertEquals(true,page.isAddressTextBoxcorrect());
        webDriver.quit();
    }

    @Test
    public void uniOptionsOxfordTest(){
        page = page.goToHomePage();
        assertEquals(true,page.isUniOxford());
        webDriver.quit();
    }

    @Test
    public void uniOptionsCambridgeTest(){
        page = page.goToHomePage();
        assertEquals(true,page.isUniCambridge());
        webDriver.quit();
    }

    @Test
    public void uniOptionsSheffieldTest(){
        page = page.goToHomePage();
        assertEquals(true, page.isUniSheffield());
        webDriver.quit();
    }

    @Test
    public void uniOptionsRoahamptonTest(){
        page = page.goToHomePage();
        assertEquals(true,page.isUniRoehampton());
        webDriver.quit();
    }





}
