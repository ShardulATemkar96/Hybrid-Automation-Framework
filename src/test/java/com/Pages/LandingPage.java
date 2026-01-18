package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Pages.LoginPage;

public class LandingPage {

    WebDriver driver;

    @FindBy(linkText = "Login") 
    WebElement linkLogin;

    @FindBy(linkText = "Register") 
    WebElement linkRegister;

    @FindBy(xpath = "//input[@name='search[keywords]']") 
    WebElement txtSearchBox;

    @FindBy(xpath = "//button[@value='Search']") 
    WebElement btnSearch;

    @FindBy(linkText = "Advanced Search") 
    WebElement linkAdvanceSearch;

    public LandingPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean isEmailDisplayed() {
        return linkLogin.isDisplayed();
    }

    public LoginPage clickLogin() {
        linkLogin.click();
        return new LoginPage(driver);
    }

    public boolean isRegisterDisplayed() {
        return linkRegister.isDisplayed();
    }

    public void isRegisterClicakable() {
        linkRegister.click();
    }

    public void searchBox(String text) {
        txtSearchBox.sendKeys(text);
    }

    public void clickSearch() {
        btnSearch.click();
    }

    public boolean isAdvanceSearchDisplayed() {
        return linkAdvanceSearch.isDisplayed();
    }

    public void isAdvanceSearcClicakbel() {
        linkAdvanceSearch.click();
    }
}
