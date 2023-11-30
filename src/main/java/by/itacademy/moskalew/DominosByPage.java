package by.itacademy.moskalew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DominosByPage {
    private String closeBunner = "//button[@data-test-type='close']";
    private String acceptCookies = "//div[@class='sm-notify-accept']";
    private String buttonMargheriaToCart = "//*[@id=\"app-root\"]/div/div[1]/div[2]/div[6]/div/div/div[30]/div/div[6]/div[2]";
    private String buttonCart = "//div[@class='cart-button']";
    private String textPizzaMargheriaInCart = "//*[@id=\"app-root\"]/div/div[1]/div[2]/div[2]/div/div/div/div/div/div[3]/div/div/div[2]/div/div/div/div/div[1]";
    private WebDriver driver;

    public DominosByPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickCloseBunner() {
        driver.findElement(By.xpath(closeBunner)).click();
    }

    public void clickAcceptCookies() {
        driver.findElement(By.xpath(acceptCookies)).click();
    }

    public void clickbuttonMargheriaToCart() {
        driver.findElement(By.xpath(buttonMargheriaToCart)).click();
    }

    public void clickButtonCart() {
        driver.findElement(By.xpath(buttonCart)).click();
    }

    public String getTextPizzaMargheriaInCart() {
        return driver.findElement(By.xpath(textPizzaMargheriaInCart)).getText();
    }

}
