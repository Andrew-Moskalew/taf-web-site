package by.itacademy.moskalew;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vek21byTest {
    @Test
    public void test21vekbyEmptyValues() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.21vek.by/");
        Vek21byPage vek21byPage = new Vek21byPage();
        driver.findElement(By.xpath(vek21byPage.buttonCookieReject)).click();
        driver.findElement(By.xpath(vek21byPage.buttonCookieReject)).click();
        driver.findElement(By.xpath(vek21byPage.buttonAccount)).click();
        driver.findElement(By.xpath(vek21byPage.buttonLogin)).click();
        driver.findElement(By.xpath(vek21byPage.buttonEnter)).click();
        Assertions.assertEquals("Электронная почта не указана", driver.findElement(By.xpath(vek21byPage.errorMassageEmail)).getText());
        Assertions.assertEquals("Пароль не указан", driver.findElement(By.xpath(vek21byPage.errorMassagePassword)).getText());
        driver.close();
    }

    @Test
    public void test21vekEmptyPassword() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.21vek.by/");
        Vek21byPage vek21byPage = new Vek21byPage();
        driver.findElement(By.xpath(vek21byPage.buttonCookieReject)).click();
        driver.findElement(By.xpath(vek21byPage.buttonCookieReject)).click();
        driver.findElement(By.xpath(vek21byPage.buttonAccount)).click();
        driver.findElement(By.xpath(vek21byPage.buttonLogin)).click();
        driver.findElement(By.xpath(vek21byPage.inputEmail)).sendKeys("test@test.by");
        driver.findElement(By.xpath(vek21byPage.buttonEnter)).click();
        Assertions.assertEquals("Пароль не указан", driver.findElement(By.xpath(vek21byPage.errorMassagePassword)).getText());
        driver.close();
    }

    @Test
    public void test21vekEmptyEmail() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.21vek.by/");
        Vek21byPage vek21byPage = new Vek21byPage();
        driver.findElement(By.xpath(vek21byPage.buttonCookieReject)).click();
        driver.findElement(By.xpath(vek21byPage.buttonCookieReject)).click();
        driver.findElement(By.xpath(vek21byPage.buttonAccount)).click();
        driver.findElement(By.xpath(vek21byPage.buttonLogin)).click();
        driver.findElement(By.xpath(vek21byPage.inputPassword)).sendKeys("testpassword");
        driver.findElement(By.xpath(vek21byPage.buttonEnter)).click();
        Assertions.assertEquals("Электронная почта не указана", driver.findElement(By.xpath(vek21byPage.errorMassageEmail)).getText());
        driver.close();
    }

    @Test
    public void test21vekInvalidValues() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.21vek.by/");
        Vek21byPage vek21byPage = new Vek21byPage();
        driver.findElement(By.xpath(vek21byPage.buttonCookieReject)).click();
        driver.findElement(By.xpath(vek21byPage.buttonCookieReject)).click();
        driver.findElement(By.xpath(vek21byPage.buttonAccount)).click();
        driver.findElement(By.xpath(vek21byPage.buttonLogin)).click();
        driver.findElement(By.xpath(vek21byPage.inputEmail)).sendKeys("test@test.by");
        driver.findElement(By.xpath(vek21byPage.inputPassword)).sendKeys("testpassword");
        driver.findElement(By.xpath(vek21byPage.buttonEnter)).click();
        Thread.sleep(500);
        Assertions.assertEquals("Неправильный пароль. \n" + "Сбросить пароль?", driver.findElement(By.xpath(vek21byPage.errorMassagePassword)).getText());
        driver.close();
    }

    @Test
    public void test21vekInvalidEmailFormat() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.21vek.by/");
        Vek21byPage vek21byPage = new Vek21byPage();
        driver.findElement(By.xpath(vek21byPage.buttonCookieReject)).click();
        driver.findElement(By.xpath(vek21byPage.buttonCookieReject)).click();
        driver.findElement(By.xpath(vek21byPage.buttonAccount)).click();
        driver.findElement(By.xpath(vek21byPage.buttonLogin)).click();
        driver.findElement(By.xpath(vek21byPage.inputEmail)).sendKeys("testInvalidEmail");
        driver.findElement(By.xpath(vek21byPage.inputPassword)).sendKeys("testpassword");
        driver.findElement(By.xpath(vek21byPage.buttonEnter)).click();
        Thread.sleep(500);
        Assertions.assertEquals("Неправильный формат электронной почты", driver.findElement(By.xpath(vek21byPage.errorMassageEmail)).getText());
        driver.close();
    }
}
