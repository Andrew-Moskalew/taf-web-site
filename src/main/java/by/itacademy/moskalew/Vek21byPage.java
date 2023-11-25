package by.itacademy.moskalew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Vek21byPage {
    private String buttonAccount = "//button[@class='styles_userToolsToggler__c2aHe']";
    private String buttonLogin = "//button[@data-testid='loginButton']";
    private String inputEmail = "//input[@id='login-email']";
    private String inputPassword = "//input[@id='login-password']";
    private String errorMassageEmail = "//*[@id=\"default-:R2mm:-modal\"]/div/div/div[2]/div/div/form/div/div[1]/div[3]/span[2]";
    private String errorMassagePassword = "//*[@id=\"default-:R2mm:-modal\"]/div/div/div[2]/div/div/form/div/div[2]/div[3]/span[2]";
    private String buttonEnter = "//button[@data-testid='loginSubmit']";
    private String buttonCookieReject = "//button[@class='Button-module__button AgreementCookie_reject__f5oqP Button-module__gray-secondary']";

    private WebDriver driver;

    public Vek21byPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickButtonAccount() {
        driver.findElement(By.xpath(buttonAccount)).click();
    }

    public void clickButtonLogin() {
        driver.findElement(By.xpath(buttonLogin)).click();
    }

    public void clickButtonEnter() {
        driver.findElement(By.xpath(buttonEnter)).click();
    }

    public void clickButtonCookieReject() {
        driver.findElement(By.xpath(buttonCookieReject)).click();
    }

    public void sendKeysInputEmail(String email) {
        driver.findElement(By.xpath(inputEmail)).sendKeys(email);
    }

    public void sendKeysInputPassword(String password) {
        driver.findElement(By.xpath(inputPassword)).sendKeys(password);
    }

    public String getTextErrorMassageEmail() {
        return driver.findElement(By.xpath(errorMassageEmail)).getText();
    }

    public String getTextErrorMassagePassword() {
        return driver.findElement(By.xpath(errorMassagePassword)).getText();
    }

}
