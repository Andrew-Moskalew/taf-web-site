package by.itacademy.moskalew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PassRWbyPage {
    private String buttonPersonalAccount = "//a[@data-target='#auth-popup']";
    private String headerTextAutorisation = "//div[@class='auth-modal__title h3']";
    private String inputLoginOrEmail = "//input[@name='login']";
    private String inputPassword = "//input[@name='password']";
    private String buttonEnter = "//input[@name='dologin']";
    private String errorMassageLoginOrEmail = "//label[@id='login-error']";
    private String errorMassagePassword = "//label[@id='password-error']";
    private String errorMassageUserNotFound = "//div[@class='danger standalone']";
    private WebDriver driver;

    public PassRWbyPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickButtonPersonalAccount() {
        driver.findElement(By.xpath(buttonPersonalAccount)).click();
    }

    public void clickButtonEnter() {
        driver.findElement(By.xpath(buttonEnter)).click();
    }

    public void sendKeysInputLoginOrEmail(String loginOrEmail) {
        driver.findElement(By.xpath(inputLoginOrEmail)).sendKeys(loginOrEmail);
    }

    public void sendKeysInputPassword(String password) {
        driver.findElement(By.xpath(inputPassword)).sendKeys(password);
    }

    public String getTextHeaderTextAutorisation() {
        return driver.findElement(By.xpath(headerTextAutorisation)).getText();
    }

    public String getTextErrorMassageLoginOrEmail() {
        return driver.findElement(By.xpath(errorMassageLoginOrEmail)).getText();
    }

    public String getTextErrorMassagePassword() {
        return driver.findElement(By.xpath(errorMassagePassword)).getText();
    }

    public String getTextErrorMassageUserNotFound() {
        return driver.findElement(By.xpath(errorMassageUserNotFound)).getText();
    }
}
