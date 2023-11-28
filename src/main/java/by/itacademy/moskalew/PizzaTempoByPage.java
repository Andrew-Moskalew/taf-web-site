package by.itacademy.moskalew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PizzaTempoByPage {
    private String linkPizza = "//img[@alt='Пицца']";
    private String buttonOrdertMargheria = " //div[@id='1']/div/div[2]/div[3]/div[3]";
    private String buttonOrder = "//div[@class='rCol']/div[1]/div[3]/div[4]/button";
    private String linkBasket = "//a[@href='https://www.pizzatempo.by/menu/order/']";
    private String textPizzaMargheriaInBasket = "//div[@id='basket_expand']/table/tbody/tr[1]/td[2]/div[1]";
    private WebDriver driver;

    public PizzaTempoByPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickLinkPizza() {
        driver.findElement(By.xpath(linkPizza)).click();
    }

    public void clickOrderPizzaMargheria() {
        driver.findElement(By.xpath(buttonOrdertMargheria)).click();
    }

    public void clickButtonOrder() {
        driver.findElement(By.xpath(buttonOrder)).click();
    }
    public void clickLinkBasket() {
        driver.findElement(By.xpath(linkBasket)).click();
    }
    public String getTextPizzaMargheriaInBasket() {
        return driver.findElement(By.xpath(textPizzaMargheriaInBasket)).getText();
    }

}
