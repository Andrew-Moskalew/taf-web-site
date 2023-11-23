package by.itacademy.moskalew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PassRWbyPage {
    private String buttonPersonalAccount = "//*[@id=\"db\"]/div[1]/div[1]/div/header/div/div[3]/div[3]/ul/li[2]/a/span[2]";
    private String headerTextAutorisation = "//*[@id=\"auth-popup\"]/div/div/div[1]/div";
    private String inputLoginOrEmail = "//*[@id=\"form-auth\"]/fieldset/div[1]/label/div[2]/input";
    private String inputPassword = "//*[@id=\"form-auth\"]/fieldset/div[2]/div[1]/div/label/div[2]/input";
    private String buttonEnter = "//*[@id=\"form-auth\"]/fieldset/div[3]/input";
    private String errorMassageLoginOrEmail = "//*[@id=\"login-error\"]";
    private String errorMassagePassword = "//*[@id=\"password-error\"]";
    private String errorMassageUserNotFound = "//*[@id=\"auth-popup\"]/div/div/div[2]/div[2]/div";
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
