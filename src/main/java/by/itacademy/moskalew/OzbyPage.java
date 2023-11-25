package by.itacademy.moskalew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OzbyPage {
    private String buttonLogin = "//a[@class='link user-bar__item']";
    private String tabLinkEmail = "//a[@id='loginFormLoginEmailLink']";
    private String inputEmail = "//input[@name='cl_email' and @tabindex='1']";
    private String inputPassword = "//input[@name='cl_psw' and@tabindex='2']";
    private String buttonEnter = "//button[@value='login' and text()='Войти']";
    private String errorMassage = "//div[@class='i-input-group__popover i-input-group__popover_login i-input-group__popover_visible']";
    private String headerTextEnter = " //p[@id='loginPopupIntro']";

    private WebDriver driver;

    public OzbyPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickButtonLogin() {
        driver.findElement(By.xpath(buttonLogin)).click();
    }

    public void clickTabLinkEmail() {
        driver.findElement(By.xpath(tabLinkEmail)).click();
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

    public String getTextErrorMassage() {
        return driver.findElement(By.xpath(errorMassage)).getText();
    }

    public String getTextHeaderTextEnter() {
        return driver.findElement(By.xpath(headerTextEnter)).getText();
    }

}
