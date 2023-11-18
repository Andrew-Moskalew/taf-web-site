package by.itacademy.moskalew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Vek21byPage {
    public String buttonAccount = "//*[@id=\"header\"]/div/div[3]/div/div[3]/div/div/div/button/span";
    public String buttonLogin = "//*[@id=\"userToolsDropDown\"]/div/div[1]/div[2]/button";
    public String inputEmail = "//*[@id=\"login-email\"]";
    public String inputPassword = "//*[@id=\"login-password\"]";
    public String errorMassageEmail = "//*[@id=\"default-:R2mm:-modal\"]/div/div/div[2]/div/div/form/div/div[1]/div[3]/span[2]";
    public String errorMassagePassword = "//*[@id=\"default-:R2mm:-modal\"]/div/div/div[2]/div/div/form/div/div[2]/div[3]/span[2]";
    public String buttonEnter = "//*[@id=\"default-:R2mm:-modal\"]/div/div/div[2]/div/div/form/div/div[3]/button";
    public String buttonCookieReject = "//*[@id=\"modal-cookie\"]/div/div[2]/div/button[2]/div";

    WebDriver driver;

    public Vek21byPage(WebDriver driver){
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
