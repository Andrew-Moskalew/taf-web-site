package by.itacademy.moskalew;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OzbyTest {
    @Test
    public void testOzbyInvalidValues() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://oz.by/");
        OzbyPage ozbyPage = new OzbyPage();
        driver.findElement(By.xpath(ozbyPage.buttonLogin)).click();
        driver.findElement(By.xpath(ozbyPage.buttonLoginOptionEmail)).click();
        driver.findElement(By.xpath(ozbyPage.inputEmail)).sendKeys("example@test.by");
        driver.findElement(By.xpath(ozbyPage.inputPassword)).sendKeys("testPassword");
        driver.findElement(By.xpath(ozbyPage.buttonEnter)).click();
        Assertions.assertEquals("Адрес электронной почты не зарегистрирован. Зарегистрироваться",
                driver.findElement(By.xpath(ozbyPage.errorMassage)).getText());
        driver.close();
    }

    @Test
    public void testOzbyEnter() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://oz.by/");
        OzbyPage ozbyPage = new OzbyPage();
        driver.findElement(By.xpath(ozbyPage.buttonLogin)).click();
        Assertions.assertEquals("Вход", driver.findElement(By.xpath(ozbyPage.textEnter)).getText());
        driver.close();
    }
}
