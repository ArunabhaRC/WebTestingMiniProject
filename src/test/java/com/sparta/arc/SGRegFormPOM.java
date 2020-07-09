package com.sparta.arc;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class SGRegFormPOM {
    WebDriver webDriver;
    By signIn = new By.ByXPath("/html/body/div/form/button");
    By title = new By.ByClassName("main-content");
    By notices = new By.ByClassName("invalid-feedback");
    By oxford = new By.ByXPath("/html/body/div/form/div[8]/div/select/option[2]");
    By cambridge = new By.ByXPath("/html/body/div/form/div[8]/div/select/option[3]");
    By sheffield = new By.ByXPath("/html/body/div/form/div[8]/div/select/option[4]");
    By roehampton = new By.ByXPath("/html/body/div/form/div[8]/div/select/option[5]");
    By male = new By.ByCssSelector("div.custom-control:nth-child(6) > label:nth-child(2)");
    By female = new By.ByCssSelector("div.custom-control:nth-child(7) > label:nth-child(2)");
    By buck = new By.ByXPath("/html/body/div/form/div[12]/div/select/option[2]");
    By hert = new By.ByXPath("/html/body/div/form/div[12]/div/select/option[3]");
    By sYork = new By.ByXPath("/html/body/div/form/div[12]/div/select/option[4]");
    By bris = new By.ByXPath("/html/body/div/form/div[12]/div/select/option[5]");
    By SDET = new By.ByCssSelector("div.custom-control:nth-child(1) > label:nth-child(2)");
    By DevOps = new By.ByCssSelector("div.custom-control:nth-child(2) > label:nth-child(2)");
    By terms = new By.ById("terms");
    By termsSelected = new By.ByClassName("form-check-label");


    public SGRegFormPOM(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public SGRegFormPOM goToHomePage(){
        webDriver.get("http://localhost:9292");
        return this;
    }

    public String getURl(){
        return webDriver.getCurrentUrl();
    }

    public String clickSignIn(){
        webDriver.findElement(signIn).click();
        return webDriver.findElement(By.id("firstName")).getCssValue("background-color");
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

    public String isFeedbackRed(){
        return  webDriver.findElement(notices).getCssValue("color");
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
    public String isMaleclicked(){
        webDriver.findElement(male).click();
        return webDriver.findElement(male).getCssValue("color");
    }

    public String isFemaleclicked(){
        webDriver.findElement(female).click();
        return webDriver.findElement(female).getCssValue("color");
    }

    public boolean isCountyBuckinghamshire(){
        String county = webDriver.findElement(buck).getText();
        webDriver.findElement(buck).click();
        return county.contains("Buckinghamshire");
    }

    public boolean isCountyHertforshire(){
        String county = webDriver.findElement(hert).getText();
        webDriver.findElement(hert).click();
        return county.contains("Hertfordshire");
    }

    public boolean isCountySouthYorkshire(){
        String county = webDriver.findElement(sYork).getText();
        webDriver.findElement(sYork).click();
        return county.contains("South Yorkshire");
    }

    public boolean isCountyBristol(){
        String county = webDriver.findElement(bris).getText();
        webDriver.findElement(bris).click();
        return county.contains("Bristol");
    }

    public String isSDETclicked(){
        webDriver.findElement(SDET).click();
        return webDriver.findElement(SDET).getCssValue("color");
    }

    public String isDevOpsclicked(){
        webDriver.findElement(DevOps).click();
        return webDriver.findElement(DevOps).getCssValue("color");
    }

    public String isTermsClicked(){
        webDriver.findElement(terms).click();
        webDriver.findElement(signIn).click();
        return webDriver.findElement(termsSelected).getCssValue("color");
    }
}

