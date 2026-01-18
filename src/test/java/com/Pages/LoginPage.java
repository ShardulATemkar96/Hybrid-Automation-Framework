package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;

    @FindBy(xpath = "//input[@name='email']")
    WebElement txtEmail;

    @FindBy(xpath = "//input[@name='password']")
    WebElement txtPassword;

    @FindBy(xpath = "//button[@name='submit']")
	public
    WebElement btnLogin;

    @FindBy(linkText = "Forgot Password?")
    WebElement linkForgotPassword;

    @FindBy(xpath = "//div[contains(@class,'alert')]")
    WebElement loginErrorMessage;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterEmail(String email) {
        txtEmail.sendKeys(email);
    }

    public void enterPassword(String password) {
        txtPassword.sendKeys(password);
    }

    public void clickLogin() {
        btnLogin.click();
    }

    public void login(String email, String password) {
        txtEmail.sendKeys(email);
        txtPassword.sendKeys(password);
        btnLogin.click();
    }

    public boolean isForgotPasswordDisplayed() {
        return linkForgotPassword.isDisplayed();
    }

    public String getErrorMessage() {
        return loginErrorMessage.getText();
    }
}
