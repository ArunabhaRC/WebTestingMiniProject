package com.sparta.arc;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SGRegFormPOM {
    WebDriver webDriver;
    By title = new By.ByClassName("main-content");
    By oxford = new By.ByXPath("/html/body/div/form/div[8]/div/select/option[2]");
    By cambridge = new By.ByXPath("/html/body/div/form/div[8]/div/select/option[3]");
    By sheffield = new By.ByXPath("/html/body/div/form/div[8]/div/select/option[4]");
    By roehampton = new By.ByXPath("/html/body/div/form/div[8]/div/select/option[5]");

    public SGRegFormPOM(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public SGRegFormPOM goToHomePage(){
        webDriver.manage().window().maximize();
        webDriver.get("http://localhost:9292");
        return this;
    }

    public String getURl(){
        return webDriver.getCurrentUrl();
    }

    public boolean isAppTitleCorrect(){
        String appTitle = webDriver.findElement(title).getText();
        return appTitle.contains("Sparta Global Registration Form");
    }

    public boolean isFirstnameTextBoxcorrect(){
        String placeHolder = webDriver.findElement(By.id("firstName")).getAttribute("placeholder");
        return placeHolder.contains("Enter First Name");
    }

    public boolean isLastnameTextBoxcorrect(){
        String placeHolder = webDriver.findElement(By.id("lastName")).getAttribute("placeholder");
        return placeHolder.contains("Enter Last Name");
    }

    public boolean isAddressTextBoxcorrect(){
        String placeHolder = webDriver.findElement(By.id("inputAddress")).getAttribute("placeholder");
        return placeHolder.contains("1234 Main St");
    }

    public boolean isUniOxford(){
        String uni = webDriver.findElement(oxford).getText();
         webDriver.findElement(oxford).click();
         return uni.contains("University of Oxford");
    }

    public boolean isUniCambridge(){
        String uni = webDriver.findElement(cambridge).getText();
        webDriver.findElement(cambridge).click();
        return uni.contains("University of Cambridge");
    }

    public boolean isUniSheffield(){
        String uni = webDriver.findElement(sheffield).getText();
        webDriver.findElement(sheffield).click();
        return uni.contains("University of Sheffield");
    }

    public boolean isUniRoehampton(){
        String uni = webDriver.findElement(roehampton).getText();
        webDriver.findElement(roehampton).click();
        return uni.contains("University of Roehampton");
    }
}

