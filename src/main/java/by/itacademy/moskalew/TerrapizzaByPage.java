package by.itacademy.moskalew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TerrapizzaByPage {
    private String buttonCloseCookies = "//button[@class='close-icon']";
    private String linkPizza = "//li[@class='menu-navigation__item']/a[@href='/catalog/picca']";
    private String linkBar = "//li[@class='menu-navigation__item']/a[@href='/catalog/bar']";
    private String buttonAddPizzaMargheriaToBasket = "//button[@data-id='364']";
    private String buttonAddGingerTeaToBasket = "//button[@data-id='2218']";
    private String buttonBasket = "//div[@class='shopping-cart-btn page-cap__shopping-cart-btn  shopping-cart-btn_scroll']";
    private String textGingerTea = "//li[@data-menu-id='2218']/div[2]/div[1]/div";
    private String textPizzaMargheria = "//li[@data-menu-id='364']/div[2]/div[1]/div[1]";
    private WebDriver driver;

    public TerrapizzaByPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickButtonCloseCookies() {
        driver.findElement(By.xpath(buttonCloseCookies)).click();
    }

    public void clickLinkPizza() {
        driver.findElement(By.xpath(linkPizza)).click();
    }

    public void clickLinkBar() {
        driver.findElement(By.xpath(linkBar)).click();
    }

    public void clickButtonAddPizzaMargheriaToBasket() {
        driver.findElement(By.xpath(buttonAddPizzaMargheriaToBasket)).click();
    }

    public void clickButtonAddGingerTeaToBasket() {
        driver.findElement(By.xpath(buttonAddGingerTeaToBasket)).click();
    }

    public void clickButtonBasket() {
        driver.findElement(By.xpath(buttonBasket)).click();
    }

    public String getTextPizzaMargheria() {
        return driver.findElement(By.xpath(textPizzaMargheria)).getText();
    }

    public String getTextGingerTea() {
        return driver.findElement(By.xpath(textGingerTea)).getText();
    }

}
