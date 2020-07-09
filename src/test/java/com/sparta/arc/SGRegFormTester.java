package com.sparta.arc;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SGRegFormTester {

    WebDriver webDriver = new ChromeDriver();
    SGRegForm sgRegForm = new SGRegForm(webDriver);

    @Test
    @DisplayName("Checking website URL is correct")
    public void siteUrlIsCorrect(){
        sgRegForm = sgRegForm.goToHomePage();
        Assertions.assertEquals("http://localhost:9292/",sgRegForm.getURl());
        webDriver.quit();
    }

}
