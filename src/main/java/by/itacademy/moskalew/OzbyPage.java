package by.itacademy.moskalew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OzbyPage {
    private String buttonLogin = "//*[@id=\"top-page\"]/header/div[1]/div/div[1]/a";
    private String tabLinkEmail = "//*[@id=\"loginFormLoginEmailLink\"]";
    private String inputEmail = "//*[@id=\"loginForm\"]/div[2]/div[1]/div[1]/input";
    private String inputPassword = "//*[@id=\"loginForm\"]/div[2]/div[1]/div[2]/input";
    private String buttonEnter = "//*[@id=\"loginForm\"]/button";
    private String errorMassage = "//*[@id=\"test\"]/div/div";
    private String headerTextEnter = "//*[@id=\"loginPopupIntro\"]";

    WebDriver driver;

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
