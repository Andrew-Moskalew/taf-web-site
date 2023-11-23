package by.itacademy.moskalew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class KvitkiByPage {
    private String buttonAcceptCookies = "//*[@id=\"CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll\"]";
    private String buttonLogin = "/html/body/div[3]/div[2]/div/app-user-account-link";
    private String buttonTabEnter = "//*[@id=\"mat-tab-label-0-0\"]/span[2]";
    private String buttonEnter = "//*[@id=\"mat-tab-content-0-0\"]/div/app-user-login-form/app-collapsible/div/app-ui-button/button";
   private String inputEmail = "/html/body/div[7]/div[2]/div/mat-dialog-container/div/div/app-user-auth-form/div[2]/mat-tab-group/div/mat-tab-body[1]/div/app-user-login-form/app-collapsible/div/app-form-builder/form/app-collapsible[1]/app-email-input/div/input";
    private String inputPassword = "/html/body/div[7]/div[2]/div/mat-dialog-container/div/div/app-user-auth-form/div[2]/mat-tab-group/div/mat-tab-body[1]/div/app-user-login-form/app-collapsible/div/app-form-builder/form/app-collapsible[2]/app-password-input/div/input";
    private String errorMassageEmail = "//*[@id=\"mat-tab-content-0-0\"]/div/app-user-login-form/app-collapsible/div/app-form-builder/form/app-collapsible[1]/app-email-input/app-field-error/app-collapsible";
    private String errorMassagePassword = "//*[@id=\"mat-tab-content-0-0\"]/div/app-user-login-form/app-collapsible/div/app-form-builder/form/app-collapsible[2]/app-password-input/app-field-error/app-collapsible";
    private String errorMassageNoFindUser = "//*[@id=\"mat-mdc-dialog-1\"]/div/div/app-info-dialog-content/div[3]";
    WebDriver driver;

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
