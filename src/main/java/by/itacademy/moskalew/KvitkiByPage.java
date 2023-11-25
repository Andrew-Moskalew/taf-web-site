package by.itacademy.moskalew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class KvitkiByPage {
    private String buttonAcceptCookies = "//button[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']";
    private String buttonLogin = "//app-user-account-link[@tabindex='0']";
    private String buttonTabEnter = "//span[@class='mdc-tab__text-label' and text()='Вход']";
    private String buttonEnter = " //app-ui-button";
    private String inputEmail = "//input[@type='email']";
    private String inputPassword = "//input[@type='password']";
    private String errorMassageEmail = "//app-email-input/app-field-error";
    private String errorMassagePassword = "//app-password-input/app-field-error";
    private String errorMassageNoFindUser = "//div[@class='info-text']";
    private WebDriver driver;

    public KvitkiByPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickButtonAcceptCookies() {
        driver.findElement(By.xpath(buttonAcceptCookies)).click();
    }

    public void clickButtonLogin() {
        driver.findElement(By.xpath(buttonLogin)).click();
    }

    public void clickInputEmail() {
        driver.findElement(By.xpath(inputEmail)).click();
    }

    public void clickInputPassword() {
        driver.findElement(By.xpath(inputPassword)).click();
    }

    public void clickButtonEnter() {
        driver.findElement(By.xpath(buttonEnter)).click();
    }

    public void sendKeysInputEmail(String email) {
        driver.findElement(By.xpath(inputEmail)).sendKeys(email);
    }

    public void sendKeysInputPassword(String password) {
        driver.findElement(By.xpath(inputPassword)).sendKeys(password);
    }

    public String getTextButtonTabEnter() {
        return driver.findElement(By.xpath(buttonTabEnter)).getText();
    }

    public String getTextErrorMassageEmail() {
        return driver.findElement(By.xpath(errorMassageEmail)).getText();
    }

    public String getTextErrorMassagePassword() {
        return driver.findElement(By.xpath(errorMassagePassword)).getText();
    }

    public String getTextErrorMassageNoFindUser() {
        return driver.findElement(By.xpath(errorMassageNoFindUser)).getText();
    }
}
