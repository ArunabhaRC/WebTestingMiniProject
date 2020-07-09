package com.sparta.arc;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SGRegForm {
    WebDriver webDriver;
    By signIn = new By.ByLinkText("sign in");

    public SGRegForm(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public SGRegForm goToHomePage(){
        webDriver.manage().window().maximize();
        webDriver.get("http://localhost:9292");
        return this;
    }

    public String getURl(){
        return webDriver.getCurrentUrl();
    }
    

}

